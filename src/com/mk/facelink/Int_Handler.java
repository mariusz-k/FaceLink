package com.mk.facelink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;

public class Int_Handler extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Uri adress = intent.getData();


        UrlQuerySanitizer sanitizer = new UrlQuerySanitizer(adress.toString());
        String name = sanitizer.getValue("u");

        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse(name));
        startActivity(i);
        finish();
    }
}