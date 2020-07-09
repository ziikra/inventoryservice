package com.inventoryservice;

import org.bson.types.ObjectId;
import org.omg.CORBA.Object;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class InventoryController{

    private static final Logger LOG = LoggerFactory.getLogger(InventoryController.class);

    @Autowired
    private final InventoryRepository inventoryRepository;

    public InventoryController(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @RequestMapping("/")
    public @ResponseBody
    String index() {
        return "<h1>Welcome to Inventory API!</h1><br/>use //inventory//list to list";
    }

    //ambil semua
    @GetMapping("/inventory/list")
    public @ResponseBody
    Flux<Inventory> inventoryList() {
        return this.inventoryRepository.findAll();
    }

    //ambil satu by id
    @GetMapping("/inventory/")
    public @ResponseBody
    Mono<Inventory> getOneInventoryById(@RequestParam String id) {
        ObjectId oid = new ObjectId(id);
        return this.inventoryRepository.findById(oid);
    }

    // tambah, need product, id kosongkan!
    @PostMapping("/inventory/")
    public @ResponseBody
    Mono<Void> insertInventory(@RequestBody Inventory inventory){
        return this.inventoryRepository.save(inventory).then();
    }

    // hapus, by id
    @DeleteMapping("/inventory/")
    public @ResponseBody
    Mono<Void> deleteInventory(@RequestParam String id){
        ObjectId oid = new ObjectId(id);
        return this.inventoryRepository.deleteById(oid);
    }

    //update product, by id, product body kosongkan id!
    @PutMapping("/inventory/")
    public @ResponseBody
    Mono<Void> updateInventory(@RequestParam String id, @RequestBody Inventory inventory){
        inventory.set_id(new ObjectId(id));
        return this.inventoryRepository.save(inventory).then();
    }
}