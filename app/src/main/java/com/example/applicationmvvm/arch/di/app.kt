package com.example.applicationmvvm.arch.di

import com.example.applicationmvvm.ui.fragment.login.LoginViewModel
import com.example.applicationmvvm.ui.fragment.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val app = module {

    viewModel<LoginViewModel> { LoginViewModel() }
    viewModel<SplashViewModel> { SplashViewModel() }
    
}