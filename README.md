# anyline-livecodingtest-android

Anyline Livecoding is a barebones scaffolded Android App to use as a starting point to integrate the Anyline SDK.

## Before the Interview

If you're given this task ahead of the Interview, please check out the repo and make sure that you can successfully build and run the app contained within. You are not required to implement the task ahead of the interview. If you decide to do so ahead of the Interview, we will review the code you implemented together. Otherwise we will implement the task during the Interview.

## Usage

Check out the repo and open with Android Studio.

## Task

Implement Barcode Scanning using (the latest version of) the Anyline SDK. Verbalize your thoughts and talk to your interviewer during this Pair Programming Exercise. Start by opening the project with Android Studio. When using Kotlin, you can use ScanActivity.kt as a starting point. If you want to use Java, create a new (Java) Activity and launch it from MainActivity.kt. Demonstrate your knowledge of working with Git, if possible.

## Expected Result

Scan a Barcode and display the scanned value of the Barcode to the User. Feel free to add suggestions/improvements during the exercise (such as Tests, MVVM, small git commits, etc: anything you consider good coding practice).

## Hints

- Use the documentation: https://documentation.anyline.com/toc/platforms/android/getting_started.html
- Use the Anyline Examples App: https://github.com/Anyline/anyline-ocr-examples-android/blob/master/AnylineSDK-Examples/AnylineSDK-Examples-Source/app/src/main/java/io/anyline/examples/barcode/ScanBarcodeActivity.kt
- Ignore anything License-related (this part is solved!)
- Ignore requesting Permissions (already implemented in CameraPermissionActivity.kt)
- For easier Logging, Timber can be used: Timber.d("This is Log Output")
- To access views, ViewBinding can be used: binding.[Widget]
- View Configuration is available in assets/barcode_view_config.json
- Getting a result: Use (both works) ScanViewPlugin or ScanPlugin and attach (both works again) a ScannedBarcodesListener or a ScanResultListener. Extract the required value from the returned result and display it to the user.
- Talk to your interviewers! They can't read your mind. Tell them your thoughts and let them know if you're stuck. Asking the right questions is considered part of the exercise.

## License

[Apache License 2.0](https://choosealicense.com/licenses/apache-2.0/)
