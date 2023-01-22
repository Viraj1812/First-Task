package com.hvdevs.firsttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.hvdevs.firsttask.databinding.ActivityMainBinding
import com.hvdevs.firsttask.fragments.CertificatesFragment
import com.hvdevs.firsttask.fragments.HomeFragment
import com.hvdevs.firsttask.fragments.ReportFragment
import com.hvdevs.firsttask.fragments.ResidentsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val homeFragment = HomeFragment()
        val reportFragment = ReportFragment()
        val residentsFragment = ResidentsFragment()
        val certificatesFragment = CertificatesFragment()

        setCurrentFragment(homeFragment)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.Home -> setCurrentFragment(homeFragment)
                R.id.Report -> setCurrentFragment(reportFragment)
                R.id.Residents -> setCurrentFragment(residentsFragment)
                R.id.Certificates -> setCurrentFragment(certificatesFragment)

            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}