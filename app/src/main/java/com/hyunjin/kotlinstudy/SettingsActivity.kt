package com.hyunjin.kotlinstudy

import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.ListPreference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceManager
import com.hyunjin.kotlinstudy.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    private lateinit var activitySettingsBinding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySettingsBinding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(activitySettingsBinding.root)

        supportActionBar!!.title = getString(R.string.setting_name)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        supportFragmentManager.beginTransaction().apply {
            replace(
                android.R.id.content,
                SettingsFragment(intent.getStringExtra("textSize") ?: "small")
            )
            commit()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> {
            onBackPressed()
            true
        }

        else -> super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val textSize = sharedPreferences.getString("text_size", "small")
        val preference = getSharedPreferences("data", Context.MODE_PRIVATE)
        preference.edit().putString("textSize", textSize).apply()
        setResult(RESULT_OK, intent)
        finish()
    }

    class SettingsFragment(private val initSize: String) : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.fragment_settings, rootKey)
            findPreference<ListPreference>("text_size")!!.value = initSize
        }
    }
}