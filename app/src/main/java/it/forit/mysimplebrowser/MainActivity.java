package it.forit.mysimplebrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textUrl = findViewById(R.id.text_url);
        Intent intent = getIntent();
        Uri uri = intent.getData();
        if (uri != null) {
            String url = uri.toString();
            textUrl.setText(url);
        }
    }
}
