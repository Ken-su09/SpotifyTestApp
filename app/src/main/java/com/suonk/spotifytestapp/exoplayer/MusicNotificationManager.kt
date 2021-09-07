package com.suonk.spotifytestapp.exoplayer

import android.content.Context
import android.support.v4.media.session.MediaSessionCompat
import com.google.android.exoplayer2.ui.PlayerNotificationManager
import com.suonk.spotifytestapp.R


class MusicNotificationManager(
    private val context: Context,
    sessionToken: MediaSessionCompat.Token,
    notificationListener: PlayerNotificationManager.NotificationListener,
    private val newSongCallback: () -> Unit
) {

    private val notificationManager: PlayerNotificationManager

    init {
//        val mediaController = MediaControllerCompat(context, sessionToken)
        notificationManager = PlayerNotificationManager.createWithNotificationChannel(
            context,
            NOTIFICATION_CHANNEL_ID,
            R.string.notification_channel_name,
            R.string.notification_channel_description,
            NOTIFICATION_ID,
            
            )
    }
}