fun main() {
    val matthew = Book(
        title = "Matthew",
        author = "Matthew",
        testament = "New Testament"
    )
    val john = Book(
        title = "John",
        author = "John",
        testament = "New Testament"
    )
    val genesis = Book(
        title = "Genesis",
        author = "Moses",
        testament = "Old Testament"
    )
    val exodus = Book(
        title = "Exodus",
        author = "Moses",
        testament = "Old Testament"
    )

    val newTestament = Testament(
        name = "New Testament",
        books = listOf(matthew, john)
    )
    val oldTestament = Testament(
        name = "Old Testament",
        books = listOf(genesis, exodus)
    )


    newTestament.printName()
    newTestament.printBooks()

    oldTestament.printName()
    oldTestament.printBooks()

    val authorMatthew = Author(
        name = "Matthew",
        typeOfTestament = "New Testament",
        booksWritten = 1
    )
    val authorJohn = Author(
        name = "John",
        typeOfTestament = "New Testament",
        booksWritten = 1
    )

    authorMatthew.printDetails()
    authorJohn.printDetails()

    val books = listOf(
        Book("Mark", "Mark", "New Testament"),
        Book("Genesis", "Moses", "Old Testament"),
        Book("Matthew", "Matthew", "New Testament"),
        Book("andrew", "Moses", "uknown Testament")
    )

}