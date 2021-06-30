class Movie(name: String, duration: Int, trailer: Trailer? = null, available: Boolean = true) :
    Media(name, duration, trailer, available) {

    var wonOscar: Boolean = false

    override fun toString(): String {
        return "$name: $duration min"
    }

    override fun play(): Boolean {
        return super.play()
    }

    override fun equals(other: Any?): Boolean {
        return (other != null && other is Movie && other.name == this.name && other.duration == this.duration)
    }
}

