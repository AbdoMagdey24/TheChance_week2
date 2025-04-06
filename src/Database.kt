interface Database {
    fun connect()
    fun insert(data: String)
    fun fetch(id: Int): String
}
