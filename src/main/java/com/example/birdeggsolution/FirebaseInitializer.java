package com.example.birdeggsolution;

import java.io.FileInputStream;


public class FirebaseInitializer {

    FileInputStream serviceAccount =
            new FileInputStream("path/to/serviceAccountKey.json");

    FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .build();

FirebaseApp.initializeApp(options);

}

