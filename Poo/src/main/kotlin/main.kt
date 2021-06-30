// nulabilidad
/*
var a: Int = 3
var b: Int? = null // le dice que puede ser un Int o un null

print(a+b!!) // lanza la nullExceptionPointer si es que b es null
 */
fun main(args: Array<String>) {

    val mediaDownloader = MediaDownloader()
    mediaDownloader.createDownloadThread(object: MediaDownloader.DownloadListener{
        override fun onDownloadFinished(media: Media) {
            media.play()
        }
    })

    val breakingBad = Series("Breaking bad", 1)
    breakingBad.totalEpisodes = 5
    //breakingBad.play()
    playMedia(breakingBad)
}

fun playMedia(media: Media){
    media.play()
}
