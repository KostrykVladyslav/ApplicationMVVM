package com.example.applicationmvvm.ui.fragment.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavDirections
import com.example.applicationmvvm.ui.fragment.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class SplashViewModel : BaseViewModel() {

    private val _navigate = MutableLiveData<NavDirections>()
    val navigate: LiveData<NavDirections> = _navigate

    init {
        launch {
            delay(NAVIGATION_DELAY)
            withContext(Dispatchers.Main) {
                _navigate.value = SplashFragmentDirections.actionSplashFragmentToLoginFragment()
            }
        }
    }

    companion object {
        private const val NAVIGATION_DELAY = 5000L
    }
}