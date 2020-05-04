package com.example.screammachine

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import kotlinx.android.synthetic.*
import android.R.raw

import android.media.MediaPlayer

import android.view.View

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        var mp = MediaPlayer.create(this, R.raw.scream)
        button.setOnClickListener(){
            if (mp.isPlaying) mp.stop()
            mp = MediaPlayer.create(this, R.raw.scream)
            mp.start()
        }
        button2.setOnClickListener(){
            if (mp.isPlaying) mp.stop()
            mp = MediaPlayer.create(this, R.raw.alien)
            mp.start()
        }
        button3.setOnClickListener(){
            if (mp.isPlaying) mp.stop()
            mp = MediaPlayer.create(this, R.raw.flavor)
            mp.start()
        }


    }





    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
