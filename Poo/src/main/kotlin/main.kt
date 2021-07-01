
fun main(args: Array<String>) {
    val breakingBad = Series("Breaking Bad", 1)
    val invincible = Series("Invincible", 1)
    val dark = Series("Dark", 1)
    val tbbt = Series("The big ban theory", 1)

    breakingBad.totalEpisodes = 1
    invincible.totalEpisodes = 10
    dark.totalEpisodes = 4
    tbbt.totalEpisodes = 0

    // lista mutable - podemos modificarla a diferencia de las anteriores
    val seriesList = mutableListOf(breakingBad, invincible)
    addIfNotInList(seriesList, tbbt)
    addIfNotInList(seriesList, breakingBad)

    seriesList.sort()
    playPlayList(seriesList)

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
