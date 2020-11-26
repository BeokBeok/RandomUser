package com.beok.randomuser.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.beok.randomuser.BR
import com.beok.randomuser.R
import com.beok.randomuser.base.BaseAdapter
import com.beok.randomuser.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupRecyclerView()
        showContent()
    }

    private fun showContent() {
        viewModel.fetchUsers(30)
    }

    private fun setupRecyclerView() {
        binding.rvMainContent.adapter = BaseAdapter<UserItem>(
            layoutResourceId = R.layout.rv_main_item,
            bindingId = BR.item,
            viewModel = mapOf(BR.viewModel to viewModel)
        )
    }

    private fun setupBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}
