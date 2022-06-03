package com.example.applicationmvvm.ui.fragment.main

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.example.applicationmvvm.R
import com.example.applicationmvvm.databinding.FragmentMainBinding
import com.example.applicationmvvm.ui.fragment.base.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>(contentLayoutID = R.layout.fragment_main) {

    private val navArgs: MainFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mainLabel.text = navArgs.login
    }

}