package com.anyline.anylinelivecoding

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anyline.anylinelivecoding.databinding.ActivityScanBinding
import io.anyline.AnylineSDK

class ScanActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /**
         * TODO: Implement Barcode Scanning using the Anyline SDK.
         * Expected Result: Scan a Barcode and return the scanned value to the User.
         * Hints:
         * - Use the documentation: https://documentation.anyline.com/toc/platforms/android/getting_started.html
         * - Use the Anyline Examples App: https://github.com/Anyline/anyline-ocr-examples-android/blob/master/AnylineSDK-Examples/AnylineSDK-Examples-Source/app/src/main/java/io/anyline/examples/barcode/ScanBarcodeActivity.kt
         * - Ignore anything License-related (this part is solved!)
         * - Ignore requesting Permissions (already implemented in CameraPermissionActivity.kt)
         * - For easier Logging, Timber can be used: Timber.d("This is Log Output")
         * - To access views, ViewBinding can be used: binding.[Widget]
         * - View Configuration is available in assets/barcode_view_config.json
         * - Getting a result: Use (both works) ScanViewPlugin or ScanPlugin and attach (both works
         *   again) a ScannedBarcodesListener or a ScanResultListener. Extract the required value
         *   from the returned result and display it to the user.
         */

        AnylineSDK.init(getString(R.string.anyline_license_key), this)
    }

    companion object {
        fun buildIntent(context: Context): Intent {
            return Intent(context, ScanActivity::class.java)
        }
    }
}