class Album(val songs: List<Song>) : Music{

    fun searchArtistInAlbum(ArtistName: String): List<Song> {
        return songs.filter { it.artist == ArtistName }
    }

    override fun getPlayingTime(): Double {
        var time = 0.0
        for(song in songs){
            time += song.playingTime
        }
        return time
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }
}