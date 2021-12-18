package com.hyunjin.kotlinstudy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.GravityCompat
import androidx.core.view.forEach
import com.hyunjin.kotlinstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var explanationFragment: ExplanationFragment
    private val preference by lazy { getSharedPreferences("data", Context.MODE_PRIVATE) }
    private var key = "intro"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.activityMainContent.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_action_menu)
        supportActionBar!!.title = getString(R.string.intro_menu)

        for (i in 0 until binding.navigationView.menu.size()) {
            binding.navigationView.menu.getItem(i).subMenu.forEach {
                if (preference.getBoolean(it.title.toString(), false)) {
                    it.icon = ResourcesCompat.getDrawable(resources, R.drawable.checkbox_on_background, null)
                }
            }
        }

        binding.navigationView.setNavigationItemSelectedListener {
            explanationFragment = ExplanationFragment()
            val size = preference.getString("textSize", "small")!!

            when (it.itemId) {
                R.id.intro -> {
                    key = "intro"
                    supportActionBar!!.title = getString(R.string.intro_menu)
                }

                else -> {
                    when (it.itemId) {
                        R.id.menu_1_1 -> {
                            key = "menu_1_1"
                            supportActionBar!!.title = getString(R.string.menu_1_1)
                        }
                        R.id.menu_1_2 -> {
                            key = "menu_1_2"
                            supportActionBar!!.title = getString(R.string.menu_1_2)
                        }
                        R.id.menu_2_1 -> {
                            key = "menu_2_1"
                            supportActionBar!!.title = getString(R.string.menu_2_1)
                        }
                        R.id.menu_2_2 -> {
                            key = "menu_2_2"
                            supportActionBar!!.title = getString(R.string.menu_2_2)
                        }
                        R.id.menu_2_3 -> {
                            key = "menu_2_3"
                            supportActionBar!!.title = getString(R.string.menu_2_3)
                        }
                        R.id.menu_2_4 -> {
                            key = "menu_2_4"
                            supportActionBar!!.title = getString(R.string.menu_2_4)
                        }
                        R.id.menu_2_5 -> {
                            key = "menu_2_5"
                            supportActionBar!!.title = getString(R.string.menu_2_5)
                        }
                        R.id.menu_2_6 -> {
                            key = "menu_2_6"
                            supportActionBar!!.title = getString(R.string.menu_2_6)
                        }
                        R.id.menu_3_1 -> {
                            key = "menu_3_1"
                            supportActionBar!!.title = getString(R.string.menu_3_1)
                        }
                        R.id.menu_3_2 -> {
                            key = "menu_3_2"
                            supportActionBar!!.title = getString(R.string.menu_3_2)
                        }
                        R.id.menu_3_3 -> {
                            key = "menu_3_3"
                            supportActionBar!!.title = getString(R.string.menu_3_3)
                        }
                        R.id.menu_3_4 -> {
                            key = "menu_3_4"
                            supportActionBar!!.title = getString(R.string.menu_3_4)
                        }
                        R.id.menu_3_5 -> {
                            key = "menu_3_5"
                            supportActionBar!!.title = getString(R.string.menu_3_5)
                        }
                        R.id.menu_3_6 -> {
                            key = "menu_3_6"
                            supportActionBar!!.title = getString(R.string.menu_3_6)
                        }
                        R.id.menu_3_7 -> {
                            key = "menu_3_7"
                            supportActionBar!!.title = getString(R.string.menu_3_7)
                        }
                        R.id.menu_3_8 -> {
                            key = "menu_3_8"
                            supportActionBar!!.title = getString(R.string.menu_3_8)
                        }
                        R.id.menu_4_1 -> {
                            key = "menu_4_1"
                            supportActionBar!!.title = getString(R.string.menu_4_1)
                        }
                        R.id.menu_4_2 -> {
                            key = "menu_4_2"
                            supportActionBar!!.title = getString(R.string.menu_4_2)
                        }
                        R.id.menu_4_3 -> {
                            key = "menu_4_3"
                            supportActionBar!!.title = getString(R.string.menu_4_3)
                        }
                        R.id.menu_5_1 -> {
                            key = "menu_5_1"
                            supportActionBar!!.title = getString(R.string.menu_5_1)
                        }
                        R.id.menu_5_2 -> {
                            key = "menu_5_2"
                            supportActionBar!!.title = getString(R.string.menu_5_2)
                        }
                        R.id.menu_5_3 -> {
                            key = "menu_5_3"
                            supportActionBar!!.title = getString(R.string.menu_5_3)
                        }
                        R.id.menu_5_4 -> {
                            key = "menu_5_4"
                            supportActionBar!!.title = getString(R.string.menu_5_4)
                        }
                        R.id.menu_5_5 -> {
                            key = "menu_5_5"
                            supportActionBar!!.title = getString(R.string.menu_5_5)
                        }
                        R.id.menu_6_1 -> {
                            key = "menu_6_1"
                            supportActionBar!!.title = getString(R.string.menu_6_1)
                        }
                        R.id.menu_6_2 -> {
                            key = "menu_6_2"
                            supportActionBar!!.title = getString(R.string.menu_6_2)
                        }
                        R.id.menu_6_3 -> {
                            key = "menu_6_3"
                            supportActionBar!!.title = getString(R.string.menu_6_3)
                        }
                        R.id.menu_6_4 -> {
                            key = "menu_6_4"
                            supportActionBar!!.title = getString(R.string.menu_6_4)
                        }
                        R.id.menu_6_5 -> {
                            key = "menu_6_5"
                            supportActionBar!!.title = getString(R.string.menu_6_5)
                        }
                        R.id.menu_6_6 -> {
                            key = "menu_6_6"
                            supportActionBar!!.title = getString(R.string.menu_6_6)
                        }
                        R.id.menu_6_7 -> {
                            key = "menu_6_7"
                            supportActionBar!!.title = getString(R.string.menu_6_7)
                        }
                        R.id.menu_7_1 -> {
                            key = "menu_7_1"
                            supportActionBar!!.title = getString(R.string.menu_7_1)
                        }
                        R.id.menu_7_2 -> {
                            key = "menu_7_2"
                            supportActionBar!!.title = getString(R.string.menu_7_2)
                        }
                        R.id.menu_7_3 -> {
                            key = "menu_7_3"
                            supportActionBar!!.title = getString(R.string.menu_7_3)
                        }
                        R.id.menu_7_4 -> {
                            key = "menu_7_4"
                            supportActionBar!!.title = getString(R.string.menu_7_4)
                        }
                        R.id.menu_7_5 -> {
                            key = "menu_7_5"
                            supportActionBar!!.title = getString(R.string.menu_7_5)
                        }
                        R.id.menu_7_6 -> {
                            key = "menu_7_6"
                            supportActionBar!!.title = getString(R.string.menu_7_6)
                        }
                        R.id.menu_7_7 -> {
                            key = "menu_7_7"
                            supportActionBar!!.title = getString(R.string.menu_7_7)
                        }
                        R.id.menu_8_1 -> {
                            key = "menu_8_1"
                            supportActionBar!!.title = getString(R.string.menu_8_1)
                        }
                        R.id.menu_8_2 -> {
                            key = "menu_8_2"
                            supportActionBar!!.title = getString(R.string.menu_8_2)
                        }
                        R.id.menu_8_3 -> {
                            key = "menu_8_3"
                            supportActionBar!!.title = getString(R.string.menu_8_3)
                        }
                        R.id.menu_8_4 -> {
                            key = "menu_8_4"
                            supportActionBar!!.title = getString(R.string.menu_8_4)
                        }
                        R.id.menu_8_5 -> {
                            key = "menu_8_5"
                            supportActionBar!!.title = getString(R.string.menu_8_5)
                        }
                        R.id.menu_8_6 -> {
                            key = "menu_8_6"
                            supportActionBar!!.title = getString(R.string.menu_8_6)
                        }
                        R.id.menu_8_7 -> {
                            key = "menu_8_7"
                            supportActionBar!!.title = getString(R.string.menu_8_7)
                        }
                        R.id.menu_8_8 -> {
                            key = "menu_8_8"
                            supportActionBar!!.title = getString(R.string.menu_8_8)
                        }
                        R.id.menu_8_9 -> {
                            key = "menu_8_9"
                            supportActionBar!!.title = getString(R.string.menu_8_9)
                        }
                        R.id.menu_8_10 -> {
                            key = "menu_8_10"
                            supportActionBar!!.title = getString(R.string.menu_8_10)
                        }
                        R.id.menu_8_11 -> {
                            key = "menu_8_11"
                            supportActionBar!!.title = getString(R.string.menu_8_11)
                        }
                        R.id.menu_8_12 -> {
                            key = "menu_8_12"
                            supportActionBar!!.title = getString(R.string.menu_8_12)
                        }
                        R.id.menu_8_13 -> {
                            key = "menu_8_13"
                            supportActionBar!!.title = getString(R.string.menu_8_13)
                        }
                        R.id.menu_8_14 -> {
                            key = "menu_8_14"
                            supportActionBar!!.title = getString(R.string.menu_8_14)
                        }
                        R.id.menu_9_1 -> {
                            key = "menu_9_1"
                            supportActionBar!!.title = getString(R.string.menu_9_1)
                        }
                        R.id.menu_9_2 -> {
                            key = "menu_9_2"
                            supportActionBar!!.title = getString(R.string.menu_9_2)
                        }
                        R.id.menu_9_3 -> {
                            key = "menu_9_3"
                            supportActionBar!!.title = getString(R.string.menu_9_3)
                        }
                        R.id.menu_9_4 -> {
                            key = "menu_9_4"
                            supportActionBar!!.title = getString(R.string.menu_9_4)
                        }
                        R.id.menu_10_1 -> {
                            key = "menu_10_1"
                            supportActionBar!!.title = getString(R.string.menu_10_1)
                        }
                        R.id.menu_10_2 -> {
                            key = "menu_10_2"
                            supportActionBar!!.title = getString(R.string.menu_10_2)
                        }
                        R.id.menu_10_3 -> {
                            key = "menu_10_3"
                            supportActionBar!!.title = getString(R.string.menu_10_3)
                        }
                        R.id.menu_10_4 -> {
                            key = "menu_10_4"
                            supportActionBar!!.title = getString(R.string.menu_10_4)
                        }
                        R.id.menu_10_5 -> {
                            key = "menu_10_5"
                            supportActionBar!!.title = getString(R.string.menu_10_5)
                        }
                        R.id.menu_10_6 -> {
                            key = "menu_10_6"
                            supportActionBar!!.title = getString(R.string.menu_10_6)
                        }
                        R.id.menu_11_1 -> {
                            key = "menu_11_1"
                            supportActionBar!!.title = getString(R.string.menu_11_1)
                        }
                        R.id.menu_11_2 -> {
                            key = "menu_11_2"
                            supportActionBar!!.title = getString(R.string.menu_11_2)
                        }
                        R.id.menu_11_3 -> {
                            key = "menu_11_3"
                            supportActionBar!!.title = getString(R.string.menu_11_3)
                        }
                        R.id.menu_11_4 -> {
                            key = "menu_11_4"
                            supportActionBar!!.title = getString(R.string.menu_11_4)
                        }
                        R.id.menu_11_5 -> {
                            key = "menu_11_5"
                            supportActionBar!!.title = getString(R.string.menu_11_5)
                        }
                        R.id.menu_11_6 -> {
                            key = "menu_11_6"
                            supportActionBar!!.title = getString(R.string.menu_11_6)
                        }
                        R.id.menu_11_7 -> {
                            key = "menu_11_7"
                            supportActionBar!!.title = getString(R.string.menu_11_7)
                        }
                        R.id.menu_11_8 -> {
                            key = "menu_11_8"
                            supportActionBar!!.title = getString(R.string.menu_11_8)
                        }
                        R.id.menu_12_1 -> {
                            key = "menu_12_1"
                            supportActionBar!!.title = getString(R.string.menu_12_1)
                        }
                        R.id.menu_12_2 -> {
                            key = "menu_12_2"
                            supportActionBar!!.title = getString(R.string.menu_12_2)
                        }
                        R.id.menu_12_3 -> {
                            key = "menu_12_3"
                            supportActionBar!!.title = getString(R.string.menu_12_3)
                        }
                        R.id.menu_12_4 -> {
                            key = "menu_12_4"
                            supportActionBar!!.title = getString(R.string.menu_12_4)
                        }
                        R.id.menu_12_5 -> {
                            key = "menu_12_5"
                            supportActionBar!!.title = getString(R.string.menu_12_5)
                        }
                        R.id.menu_13_1 -> {
                            key = "menu_13_1"
                            supportActionBar!!.title = getString(R.string.menu_13_1)
                        }
                        R.id.menu_13_2 -> {
                            key = "menu_13_2"
                            supportActionBar!!.title = getString(R.string.menu_13_2)
                        }
                        R.id.menu_13_3 -> {
                            key = "menu_13_3"
                            supportActionBar!!.title = getString(R.string.menu_13_3)
                        }
                        R.id.menu_13_4 -> {
                            key = "menu_13_4"
                            supportActionBar!!.title = getString(R.string.menu_13_4)
                        }
                        R.id.menu_13_5 -> {
                            key = "menu_13_5"
                            supportActionBar!!.title = getString(R.string.menu_13_5)
                        }
                        R.id.menu_14_1 -> {
                            key = "menu_14_1"
                            supportActionBar!!.title = getString(R.string.menu_14_1)
                        }
                        R.id.menu_14_2 -> {
                            key = "menu_14_2"
                            supportActionBar!!.title = getString(R.string.menu_14_2)
                        }
                        R.id.menu_14_3 -> {
                            key = "menu_14_3"
                            supportActionBar!!.title = getString(R.string.menu_14_3)
                        }
                        R.id.menu_14_4 -> {
                            key = "menu_14_4"
                            supportActionBar!!.title = getString(R.string.menu_14_4)
                        }
                        R.id.menu_14_5 -> {
                            key = "menu_14_5"
                            supportActionBar!!.title = getString(R.string.menu_14_5)
                        }
                        R.id.menu_14_6 -> {
                            key = "menu_14_6"
                            supportActionBar!!.title = getString(R.string.menu_14_6)
                        }
                        R.id.menu_15_1 -> {
                            key = "menu_15_1"
                            supportActionBar!!.title = getString(R.string.menu_15_1)
                        }
                        R.id.menu_15_2 -> {
                            key = "menu_15_2"
                            supportActionBar!!.title = getString(R.string.menu_15_2)
                        }
                        R.id.menu_15_3 -> {
                            key = "menu_15_3"
                            supportActionBar!!.title = getString(R.string.menu_15_3)
                        }
                        R.id.menu_15_4 -> {
                            key = "menu_15_4"
                            supportActionBar!!.title = getString(R.string.menu_15_4)
                        }
                        R.id.menu_15_5 -> {
                            key = "menu_15_5"
                            supportActionBar!!.title = getString(R.string.menu_15_5)
                        }
                        R.id.menu_15_6 -> {
                            key = "menu_15_6"
                            supportActionBar!!.title = getString(R.string.menu_15_6)
                        }
                        R.id.menu_15_7 -> {
                            key = "menu_15_7"
                            supportActionBar!!.title = getString(R.string.menu_15_7)
                        }
                        R.id.menu_15_8 -> {
                            key = "menu_15_8"
                            supportActionBar!!.title = getString(R.string.menu_15_8)
                        }
                        R.id.menu_15_9 -> {
                            key = "menu_15_9"
                            supportActionBar!!.title = getString(R.string.menu_15_9)
                        }
                        else -> {}
                    }
                }
            }

            it.icon = ResourcesCompat.getDrawable(resources, R.drawable.checkbox_on_background, null)
            preference.edit().putBoolean(supportActionBar!!.title.toString(), true).apply()
            val bundle = Bundle().apply {
                putString("key", key)
                putString("size", size)
            }
            explanationFragment.arguments = bundle
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, explanationFragment)
                commit()
            }
            binding.drawerLayout.closeDrawer(GravityCompat.START)
            true
        }

        initExplanationFragment()
    }

    override fun onResume() {
        super.onResume()
        explanationFragment.textResize(preference.getString("textSize", "small")!!)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.appbar_action, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> {
            binding.drawerLayout.openDrawer(GravityCompat.START)
            true
        }

        R.id.action_settings -> {
            val intent = Intent(this, SettingsActivity::class.java).apply {
                putExtra("textSize", preference.getString("textSize", "small")!!)
            }
            startActivity(intent)
            true
        }

        else -> super.onOptionsItemSelected(item)
    }

    private fun initExplanationFragment() {
        explanationFragment = ExplanationFragment()
        val size = preference.getString("textSize", "small")!!
        val bundle = Bundle().apply {
            putString("key", key)
            putString("size", size)
        }
        explanationFragment.arguments = bundle
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, explanationFragment)
            commit()
        }
    }
}