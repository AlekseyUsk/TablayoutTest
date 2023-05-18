package com.bignerdranch.android.tablayouttest

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.tablayouttest.databinding.ActivityMainBinding
import com.bignerdranch.android.tablayouttest.databinding.FragmentMaimBinding
import com.bignerdranch.android.tablayouttest.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_activity, MainFragment.newInstance()).commit()
    }
}