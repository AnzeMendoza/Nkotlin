abstract class Media (var name: String, var duration: Int, var trailer: Trailer? = null, var available: Boolean = true){

    companion object {

        private const val FRAME_RATE_HD = 60
        private const val FRAME_RATE_SD = 24
        private const val SECONDS_IN_A_MINUTE = 60

        fun getTotalFrames(duration: Int, isHD: Boolean): Int {
            return if (isHD) {
                FRAME_RATE_HD * SECONDS_IN_A_MINUTE * duration
            } else {
                FRAME_RATE_SD * SECONDS_IN_A_MINUTE * duration
            }
        }
    }

    abstract fun play(): Boolean
    abstract fun pause()
    abstract fun playTrailer()

    override fun equals(other: Any?): Boolean {
        return (other != null && other is Media && other.name == this.name && other.duration == this.duration)
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + duration
        result = 31 * result + (trailer?.hashCode() ?: 0)
        result = 31 * result + available.hashCode()
        return result
    }

}