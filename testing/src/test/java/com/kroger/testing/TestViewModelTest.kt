package com.kroger.testing

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(
    CoroutineTestExtension::class,
)
internal class TestViewModelTest {

    /**
     * Fill in the following unit tests for the class {TestViewModel}
     * Use the mocking library MockK for your dependency mocking (https://mockk.io/)
     * Use any assertion library you like. Google Truth is currently available.
     */

    @Test
    fun `Default value for the ui state flow should be UiState Loading`() {
    }

    @Test
    fun `When calling for cached data, should update the ui state flow with ShowUi and wasCacheData is true`() {
    }

    @Test
    fun `When calling for none cached data, should update the ui state flow with ShowUi and wasCacheData is false`() {
    }

    @Test
    fun `When calling for data and there is an exception, should update the ui state flow with Error with the error message`() {
    }
}
