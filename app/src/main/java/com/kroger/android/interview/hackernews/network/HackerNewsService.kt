package com.kroger.android.interview.hackernews.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

val BASE_URL = "https://hacker-news.firebaseio.com/"

/**
 * Retrofit service for the Hacker News API
 *
 * https://github.com/HackerNews/API
 */

// https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty
// https://hacker-news.firebaseio.com/v0/item/26068032.json?print=pretty
interface HackerNewsService

@Parcelize
data class Item(
    val id: Int,
    val title: String,
    val text: String?,
    val time: Int,
    val type: String,
    val by: String?,
    val descendants: Int?,
    val kids: List<Int>?,
    val score: Int?,
    val url: String?
) : Parcelable
