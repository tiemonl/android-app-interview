package com.kroger.android.interview.hackernews.test

import io.mockk.every
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext

@OptIn(ExperimentalCoroutinesApi::class)
open class CoroutineTestExtension(
    val testDispatcher: TestDispatcher = UnconfinedTestDispatcher(),
) : AfterEachCallback,
    BeforeEachCallback {
    override fun beforeEach(context: ExtensionContext?) = Dispatchers.setMain(testDispatcher)

    override fun afterEach(context: ExtensionContext?) {
        Dispatchers.resetMain()
    }
}
