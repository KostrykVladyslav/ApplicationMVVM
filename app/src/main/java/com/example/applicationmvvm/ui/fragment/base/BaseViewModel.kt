package com.example.applicationmvvm.ui.fragment.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    protected fun launch(block: suspend CoroutineScope.() -> Unit) =
        viewModelScope.launch(errorHandler) {
            block.invoke(this)
        }

    private val errorHandler by lazy {
        CoroutineExceptionHandler { _, exception ->
            exception.printStackTrace()
        }
    }

}