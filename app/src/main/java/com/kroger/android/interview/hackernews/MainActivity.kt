package com.kroger.android.interview.hackernews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kroger.android.interview.hackernews.databinding.ActivityMainBinding

/**
 * This Activity shows the Hacker News home screen
 *
 * The Challenge:
 *
 * Recreate the Hacker News home screen in the app. The UI can be simple.
 *
 * For reference: https://news.ycombinator.com/
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var app: HackerNewsApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        app = application as HackerNewsApp
    }
}
