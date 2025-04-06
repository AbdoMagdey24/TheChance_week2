class MongoDBDatabase : Database {
    override fun connect() {
        println("Connecting to MongoDB database...")
    }

    override fun insert(data: String) {
        println("Inserting '$data' into MongoDB database...")
    }

    override fun fetch(id: Int): String {
        println("Fetching data with ID $id from MongoDB database...")
        return "MongoDB_Data_$id"
    }
}