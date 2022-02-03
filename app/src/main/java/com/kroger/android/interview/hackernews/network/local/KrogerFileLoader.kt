package com.kroger.android.interview.hackernews.network.local

import android.content.Context
import java.io.IOException

interface KrogerFileLoader {
    fun readFile(fileName: String): String?
}

class DefaultKrogerFileLoader(private val context: Context) : KrogerFileLoader {
    override fun readFile(fileName: String): String? {
        return try {
            context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            null
        }
    }
}
