package com.kroger.android.interview.hackernews.test

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TestViewModel(private val testRepo: TestRepo) : ViewModel() {

    private val mutableUiStateFlow: MutableStateFlow<UiState> = MutableStateFlow(UiState.Loading)
    val uiStateFlow = mutableUiStateFlow.asStateFlow()

    fun getSomeData(useCachedData: Boolean) {
        viewModelScope.launch {
            val repoData = kotlin.runCatching {
                UiState.ShowUi(
                    when (testRepo.getData(useCachedData)) {
                        is TestRepo.TestRepoResponse.NotCached -> false
                        is TestRepo.TestRepoResponse.Cached -> true
                    }
                )
            }.getOrElse {
                UiState.Error(it.message.orEmpty())
            }

            mutableUiStateFlow.tryEmit(repoData)
        }

    }

    sealed class UiState {
        object Loading : UiState()
        data class ShowUi(val wasCacheData: Boolean) : UiState()
        data class Error(val errorMessage: String) : UiState()
    }
}