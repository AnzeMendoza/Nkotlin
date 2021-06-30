class MediaDownloader {

    interface DownloadListener{
        fun onDownloadFinished(media: Media)
    }
    fun downloadMedia(downloadListener: DownloadListener){
        val thread = Thread(Runnable {
            println("Download started")
            Thread.sleep(3000)
            println("Download finished")
            val downloadMovie = Movie("Avengers", 2)
            downloadListener.onDownloadFinished(downloadMovie)
        })

        thread.start()
    }
    // Unit seria el tipo de dato que se estaria regresando el lambda
    fun downloadMedia(onDownloadFinishedLambda: (media: Media) -> Boolean){
        val thread = Thread(Runnable {
            println("Download started")
            Thread.sleep(3000)
            println("Download finished")
            val downloadMovie = Movie("Avengers", 2)
            // aca estoy recuperando el valor success1
            val success2 = onDownloadFinishedLambda(downloadMovie)
            println("success:  $success2")
        })

        thread.start()
    }
}