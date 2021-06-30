
fun main(args: Array<String>) {
    val movie = Movie("matrix 2", 2)
    val bb = Series("Breaking bad", 2)
    bb.totalEpisodes = 2
    // me permite objetos de las clases hijas
    val list = mutableListOf<Media>()
    list.add(movie)
    list.add(bb)

    list[0].play()
    list[1].play()

}
