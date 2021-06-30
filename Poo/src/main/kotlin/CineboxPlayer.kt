class CineboxPlayer : MediaDownloader.DownloadListener {
    override fun onDownloadFinished(media: Media) {
        media.play()
    }

    init {
        val mediaDownloader = MediaDownloader()
        mediaDownloader.createDownloadThread(this)
    }

}