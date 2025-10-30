class RecordPlayer {
    fun play(music : Music) : String {
        val allSongsDetails = mutableListOf<String>()
        for (song in music.getAllSongs()){
            allSongsDetails.add(song.artist)
            allSongsDetails.add(song.title)
        }
        return music.getPlayingTime().toString() + " " + allSongsDetails
    }
}