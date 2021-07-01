class Series(name: String, duration: Int, trailer: Trailer? = null, available: Boolean = true) :
    Media(name, duration, trailer, available),
    Comparable<Series>{
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
        }
    }

    override fun pause() {
        println("Pausing series")

    }

    override fun playTrailer() {
        println("Playing trailer from series")
    }

    override fun toString(): String {
        return name
    }

    override fun compareTo(other: Series): Int {

        // ordena Series por palabra
        // return this.name.compareTo(other.name)

        // ordena Series por totalEpisodes
        return this.totalEpisodes - other.totalEpisodes
    }
}