let instructions = [
    db.inventory.drop(),
    db.inventory.insert({
        "_id":ObjectId("57a98d98e4b00679b4a830af"),
        "name":"single",
        "description":"available",
        "quantity":"1"
    })
//     db.rooms.insert({
//         "_id":"BD002",
//         "type":"single",
//         "status":"available"
//     }),
//     db.rooms.insert({
//         "_id":"BD003",
//         "type":"single",
//         "status":"available"
//     }),
//     db.rooms.insert({
//         "_id":"BD004",
//         "type":"single",
//         "status":"available"
//     }),
//     db.rooms.insert({
//         "_id":"BD005",
//         "type":"single",
//         "status":"available"
//     }),
//     db.rooms.insert({
//         "_id":"BD006",
//         "type":"double",
//         "status":"available"
//     }),
//     db.rooms.insert({
//         "_id":"BD007",
//         "type":"double",
//         "status":"available"
//     }),
//     db.rooms.insert({
//         "_id":"BD008",
//         "type":"double",
//         "status":"available"
//     }),
//     db.rooms.insert({
//         "_id":"BD009",
//         "type":"double",
//         "status":"available"
//     }),
//     db.rooms.insert({
//         "_id":"BD010",
//         "type":"double",
//         "status":"available"
//     })
];

instructions.forEach(function(instruction) {
    printjson(instruction);
});
