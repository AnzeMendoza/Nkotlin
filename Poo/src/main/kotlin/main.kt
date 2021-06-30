
fun main(args: Array<String>) {
    val matrix = Movie("Matrix", 2)
    val cars = Movie("Cars", 3)
    val coco = Movie("Coco", 1)
    val toyStory = Movie("Toy story", 2)

    val breakingBad = Series("Breaking Bad", 1)
    val invincible = Series("Invincible", 2)
    val dark = Series("Dark", 3)
    val tbbt = Series("The big ban theory", 2)
    // lista normal
    val movieList = listOf(matrix, cars, coco, toyStory)

    // lista mutable - podemos modificarla a diferencia de las anteriores
    val seriesList = mutableListOf(breakingBad, invincible)
    seriesList.add(dark)
    seriesList[0] = tbbt

    /*
    La elección de cada uno depende la funiconalidad, como regla si no se modifica usar los in
    mutables.
    */
}
