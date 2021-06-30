class MediaDownloader {

    interface DownloadListener{
        fun onDownloadFinished(media: Media)
    }
    fun createDownloadThread(downloadListener: DownloadListener){
        val thread = Thread(Runnable {
            println("Download started")
            Thread.sleep(3000)
            println("Download finished")
            val downloadMovie = Movie("Avengers", 2)
            downloadListener.onDownloadFinished(downloadMovie)
        })

        thread.start()
    }
}