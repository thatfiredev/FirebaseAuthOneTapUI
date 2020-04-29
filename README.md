# Firebase Auth One Tap Demo

This is a sample android app to demonstrate how to integrate
[One Tap sign-in and sign-up](https://developers.google.com/identity/one-tap/android/overview) with
[Firebase Authentication](https://firebase.google.com/products/auth).
Find more details about the implementation on this
[blog post](https://medium.com/@rosariopfernandes/firebase-auth-one-tap-86ca80a80973).

# Running the app
To get the app up and running, you'll need to:
1. Open the [Firebase Console](https://console.firebase.google.com/), create a new project (or use an existing one) and add an android app.
1. When prompted, use the application ID "io.github.rosariopfernandes.firebaseauthonetap" and add your SHA-1 Key. The simplest way to get your SHA-1 key is to:
    1. Open your project in Android Studio.
    1. Click on Gradle Menu on the right side to expand it.
    1. Select app > Tasks > android and click on signingReport. Your SHA-1 will show up on the Run Tab at the bottom.
1. Download the `google-services.json` file from the Firebase Console.
1. Copy the `google-services.json` file to the FirebaseAuthOneTap/app directory.
1. Build the project

# License
This project is licensed under the MIT License. See [LICENSE](LICENSE) for more details.
