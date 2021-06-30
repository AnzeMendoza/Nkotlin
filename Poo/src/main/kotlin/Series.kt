class Series(name: String, duration: Int, trailer: Trailer? = null, available: Boolean = true) :
    Media(name, duration, trailer, available) {
    var totalEpisodes: Int = 0
    var totalSeasons: Int = 0
    var episodeDuration: Int = 0

    // se ejecuta cada vez que se ejecuta series
    init {
        episodeDuration = duration
    }

    override fun play(): Boolean {
        val realDuration = episodeDuration * totalEpisodes
        return if (available) {
            if (realDuration > 0) {
                for (i in 0 until realDuration) {
                    println("Playing movie $name")
                }
                true
            } else {
                println("Movie $name duration is less than zero")
                false
            }
        } else {
            println("Movie $name is not available")
            false
        }    }
}