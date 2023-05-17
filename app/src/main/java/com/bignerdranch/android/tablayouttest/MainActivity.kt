package com.bignerdranch.android.tablayouttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bignerdranch.android.tablayouttest.adapter.ViewPagerAdapter
import com.bignerdranch.android.tablayouttest.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val fragmentsList = listOf<Fragment>(
        Fragment1.newInstance(),
        Fragment2.newInstance(),
        Fragment3.newInstance())

    private val fragmentsListTitles = listOf("Элемент 1","Элемент 2","Элемент 3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(this, fragmentsList)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, pos ->
        tab.text = fragmentsListTitles[pos]
        }.attach()
    }
}


//   private val viewModel : MainViewModel by viewModels(
//    viewModel = ViewModelProvider(this).get(viewModel::class.java)