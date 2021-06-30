class Movie(name: String, duration: Int, trailer: Trailer? = null, available: Boolean = true) :
    Media(name, duration, trailer, available) {

    var wonOscar: Boolean = false

    override fun toString(): String {
        return "$name: $duration min"
    }

    override fun play(): Boolean {
        return if (available) {
            if (duration > 0) {
                for (i in 0 until duration) {
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
        println("Movie paused")
    }

    override fun playTrailer() {
        trailer?.play(name) ?: println("No trailer available")
    }
}

