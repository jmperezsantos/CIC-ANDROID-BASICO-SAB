package cic.ipn.mx.universalapp.model

import java.io.Serializable

class SongModel : Serializable {

    var title: String = ""
    var artist: String = ""
    var recordCompany: String = ""
    var duration: Float = 0.0f

    companion object {

        fun defaultSongs(size: Int): List<SongModel> {

            val songs = mutableListOf<SongModel>()

            for (x in 1..size) {

                val song = SongModel()
                song.title = "Title $x"
                song.artist = "Artist $x"
                song.recordCompany = "Record Company $x"
                song.duration = x * 1.3f

                songs.add(song)

            }

            return songs
        }
    }

}