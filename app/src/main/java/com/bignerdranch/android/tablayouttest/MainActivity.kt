package com.bignerdranch.android.tablayouttest

 import androidx.appcompat.app.AppCompatActivity
 import android.os.Bundle
 import android.widget.Toast
 import com.bignerdranch.android.tablayouttest.databinding.ActivityMainBinding
 import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                //элемент который мы сдесь выбрали по позициям отчет с 0-1-2 и тд или по названию
                Toast.makeText(
                    this@MainActivity,
                    "выбран элемент ${tab?.text} по позиции ${tab?.position}",
                    Toast.LENGTH_SHORT
                ).show()
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