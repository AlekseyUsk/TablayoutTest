package com.bignerdranch.android.tablayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.bignerdranch.android.tablayouttest.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragmentsList =
        listOf<Fragment>(Fragment1.newInstance(), Fragment2.newInstance(), Fragment3.newInstance())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                //элемент который мы сдесь выбрали по позициям отчет с 0-1-2 и тд или по названию
supportFragmentManager.beginTransaction().replace(R.id.placeHolder,fragmentsList[tab?.position!!]).commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //элемент который был выбран ранее
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                //элемент который мы перевыбрали еще раз
            }
        })
    }
}