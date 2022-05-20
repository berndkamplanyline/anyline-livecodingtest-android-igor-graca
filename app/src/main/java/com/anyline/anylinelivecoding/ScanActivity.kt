package com.anyline.anylinelivecoding

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anyline.anylinelivecoding.databinding.ActivityScanBinding
import io.anyline.AnylineSDK

private lateinit var binding: ActivityScanBinding

class ScanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // TODO: continue here with setting up the examples stuff.

        AnylineSDK.init(getString(R.string.anyline_license_key), this)
    }

    companion object {
        fun buildIntent(context: Context): Intent {
            return Intent(context, ScanActivity::class.java)
        }
    }
}