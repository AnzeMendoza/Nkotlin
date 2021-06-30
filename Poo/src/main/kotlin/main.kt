
fun main(args: Array<String>) {
    val matrix = Movie("Matrix", 1)
    val cars = Movie("Cars", 1)
    val coco = Movie("Coco", 1)
    val toyStory = Movie("Toy story", 2)

    val breakingBad = Series("Breaking Bad", 1)
    val invincible = Series("Invincible", 1)
    val dark = Series("Dark", 1)
    val tbbt = Series("The big ban theory", 1)

    breakingBad.totalEpisodes = 1
    invincible.totalEpisodes = 1
    dark.totalEpisodes = 1
    tbbt.totalEpisodes = 1

    // lista normal
    val movieList = listOf(matrix, cars, coco, toyStory)

    // lista mutable - podemos modificarla a diferencia de las anteriores
    val seriesList = mutableListOf(breakingBad, invincible)
    addIfNotInList(seriesList, tbbt)
    addIfNotInList(seriesList, breakingBad)
    playPlayList(seriesList)

    /*
    La elección de cada uno depende la funiconalidad, como regla si no se modifica usar los in
    mutables.
    */
}

fun addIfNotInList(seriesList: MutableList<Series>, series: Series){
    if(!seriesList.contains(series)){
        seriesList.add(series)
    } else {
        println("Series $series is alredy in playlist")
    }
}

fun playPlayList(seriesList: MutableList<Series>){
    for(series in seriesList){
        series.play()
    }
}
