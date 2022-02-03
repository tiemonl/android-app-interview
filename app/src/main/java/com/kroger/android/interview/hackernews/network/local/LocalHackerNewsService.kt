package com.kroger.android.interview.hackernews.network.local

import com.kroger.android.interview.hackernews.network.HackerNewsService

/**
 * If Hacker News API is down or we want to start with a dummy data set, substitute the retrofit
 * instance of this interface.
 * IOW, set the USE_LOCAL_DATA BuildConfig property to true.
 */
class LocalHackerNewsService(private val fileLoader: KrogerFileLoader) : HackerNewsService
