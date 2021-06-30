
fun main(args: Array<String>) {
    // sobrecarga de equals

    val movie1 = Movie("matrix",2)
    val movie2 = Movie("matrix", 2)

    if(movie1 == movie2){
        println("los objetos son iguales")
    } else {
        println("los objetos son distintos ${movie1.hashCode()} ${movie2.hashCode()}")
    }
    // me da distinto porque a esta comparando los hashcode, no el contenido de cada atributo
}
