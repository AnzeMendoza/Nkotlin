// nulabilidad
/*
var a: Int = 3
var b: Int? = null // le dice que puede ser un Int o un null

print(a+b!!) // lanza la nullExceptionPointer si es que b es null
 */
fun main(args: Array<String>) {
    val mediaDownloader = MediaDownloader()
    mediaDownloader.downloadMedia {
        val success1 = it.play()
        success1
    }
}
