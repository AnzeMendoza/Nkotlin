open class Media (var name: String, var duration: Int, var trailer: Trailer? = null, var available: Boolean = true){

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

    open fun play(): Boolean {
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

    fun pause() {
        println("Movie paused")
    }

    fun playTrailer() {
        trailer?.play(name) ?: println("No trailer available")
    }

}