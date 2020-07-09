package com.inventoryservice;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by VRavuri on 04-11-2016.
 * update by rizki on 24-06-2020.
 */

public interface InventoryRepository extends ReactiveMongoRepository<Inventory, ObjectId> {

}