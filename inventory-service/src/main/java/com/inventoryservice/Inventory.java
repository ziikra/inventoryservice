package com.inventoryservice;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@Document(collection = "inventory")
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    @Id
    private ObjectId _id;
    private String name;
    private String description;
    private int quantity;

    
//    @Field("published") //gunakan untuk different field name
//    private LocalDate publicationDate;


}