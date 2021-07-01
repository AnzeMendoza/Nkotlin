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
    seriesList.addIfNotInList(breakingBad)
    seriesList.sort()
    //playPlayList(seriesList)

    val seriesMap = HashMap<Int, Series>()

    seriesMap[1] = breakingBad
    seriesMap.put(2, invincible)
    seriesMap[3] = tbbt

    val series = seriesMap[3] //seriesMap.get(3)
}

fun <T>MutableList<T>.addIfNotInList(myObject: T) {
    if (!this.contains(myObject)) {
        this.add(myObject)
    } else {
        println("Series $myObject is alredy in playlist")
    }
}

fun playPlayList(seriesList: MutableList<Series>) {
    for (series in seriesList) {
        series.play()
    }
}
