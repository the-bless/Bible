class Author(
    val name: String,
    val typeOfTestament: String,
    val booksWritten: Int,
){
    fun printDetails() {
        println("Author: $name")
        println("Type of Testament: $typeOfTestament")
        println("Books Written: $booksWritten")
    }
}
