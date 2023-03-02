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

## Anyline License

Use the following Anyline License (valid until 2023-04-01):

```
ewogICJsaWNlbnNlS2V5VmVyc2lvbiI6ICIzLjAiLAogICJkZWJ1Z1JlcG9ydGluZyI6ICJwaW5nIiwKICAibWFqb3JWZXJzaW9uIjogIjM3IiwKICAic2NvcGUiOiBbCiAgICAiQUxMIgogIF0sCiAgIm1heERheXNOb3RSZXBvcnRlZCI6IDAsCiAgImFkdmFuY2VkQmFyY29kZSI6IHRydWUsCiAgIm11bHRpQmFyY29kZSI6IHRydWUsCiAgInN1cHBvcnRlZEJhcmNvZGVGb3JtYXRzIjogWwogICAgIkFMTCIKICBdLAogICJwbGF0Zm9ybSI6IFsKICAgICJBbmRyb2lkIgogIF0sCiAgInNob3dXYXRlcm1hcmsiOiB0cnVlLAogICJ0b2xlcmFuY2VEYXlzIjogMzAsCiAgInZhbGlkIjogIjIwMjMtMDQtMDEiLAogICJhbmRyb2lkSWRlbnRpZmllciI6IFsKICAgICJpby5hbnlsaW5lLmV4YW1wbGVzLmxpdmVjb2RpbmciCiAgXQp9CnlzWVJMQnVWdmZoQURmVnlLcWtaZkJTU1JjdGJjZVd0WmFOVGZlbGxZK2ljelJXclRuanNpYmFJMDJuUFZQTEhETENPNm5RTnVSNGVtWUUwQ21VTnk2Sk83dWt2UndMR0h6VTBCTStzbHVTYjE3SEYranlIamEwRVpZVEx4M3ZreDFjZm1QL1FmNW55UWZ4OHRlRkNxaG9LbXJYamdSdHFOVXh0bzdMMVVxczZIRGVNcGdBK0FXNU1pdjBXRHJRZGc1aFJ6cmg1ZXVyUTNrNzVRMUhROThodDVtTlA2VDlDclFIM0VxZWN5U2s1TlY2TjE2VE4xS250MHplakt6QnlDOFBXZWN3Sk5oN0tFWjBNbDAxZ1dUSkpGWHgwRW0yRkxiUjBrZVlKS1J3MC83VUxWVlorOGUrMXNBUTFvYWhTOVBQVE0xZERRenJmc1E3clVlKzd4Zz09
```

## Hints

- Use the newest available version of Anyline (At the time of writing: 43.1.0)
- Use the documentation: https://documentation-preview.anyline.com/
- Use the Anyline Examples App: https://github.com/Anyline/anyline-ocr-examples-android/blob/master/AnylineSDK-Examples/AnylineSDK-Examples-Source/app/src/main/java/io/anyline/examples/barcode/ScanBarcodeActivity.kt
- Insert the Anyline License into `anyline_license_key` within app/res/values/strings.xml. You can either [request](https://anyline.com/request/sdk) one or your Interviewers will provide one.
- Ignore requesting Permissions (already implemented in CameraPermissionActivity.kt)
- For easier Logging, Timber can be used: Timber.d("This is Log Output")
- To access views, ViewBinding can be used: binding.[Widget]
- View Configuration is available in assets/barcode_view_config.json
- Talk to your interviewers! They can't read your mind. Tell them your thoughts and let them know if you're stuck. Asking the right questions is considered part of the exercise.

## License

[Apache License 2.0](https://choosealicense.com/licenses/apache-2.0/)
