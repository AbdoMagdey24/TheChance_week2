fun main() {
    val db: Database = MongoDBDatabase()
    db.connect()
    db.insert("Sample data")
    val result = db.fetch(1)
    println("Result: $result")
}