class MySQLDatabase : Database {
    override fun connect() {
        println("Connecting to MySQL database...")
    }

    override fun insert(data: String) {
        println("Inserting '$data' into MySQL database...")
    }

    override fun fetch(id: Int): String {
        println("Fetching data with ID $id from MySQL database...")
        return "MySQL_Data_$id"
    }
}