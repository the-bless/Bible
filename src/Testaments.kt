class Testament(
    val name: String,
    val books: List<Book>
) {
    fun printName() {
        println(name)
    }


    fun printNoOfBooks() {
        var booksNumber = books.size
        println(booksNumber)
    }
   fun printBooks(){
       books.forEach{
            println("name --- ${it.title}")
            println("author --- ${it.author}")
            println("testament --- ${it.testament}")
        }
    }
}



