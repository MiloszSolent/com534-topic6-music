class RecordPlayer {
    fun play(music : Music) : String {
        return music.getPlayingTime().toString() + " " + music.getAllSongs()
    }
}