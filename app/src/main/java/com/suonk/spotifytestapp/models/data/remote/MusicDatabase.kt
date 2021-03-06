package com.suonk.spotifytestapp.models.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.suonk.spotifytestapp.models.data.entities.Song
import com.suonk.spotifytestapp.utils.Constants.SONG_COLLECTION
import kotlinx.coroutines.tasks.await

class MusicDatabase {

    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        } catch (e: Exception) {
            emptyList()
        }
    }
}