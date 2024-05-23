class Book(
    val title: String,
    val author: String,
    val testament: String
) {
    init {
        val existTestaments = listOf("New Testament", "Old Testament")
        if (testament !in existTestaments) {
            println("$title is unavailable because its testament is not recognized.")
        } else {
            println("$title is available in the $testament")
        }
    }


    fun printName() {
        println(title)
    }

    fun printBookDetails() {
        println("Title: $title")
        println("Author: $author")
        println("Testament: $testament")
    }
}




