package com.kroger.android.interview.hackernews.test

class TestRepo() {

    fun getData(useCache: Boolean): TestRepoResponse {
        return if(useCache) TestRepoResponse.Cached else TestRepoResponse.NotCached
    }

    sealed class TestRepoResponse {
        object Cached: TestRepoResponse()
        object NotCached: TestRepoResponse()
    }
}