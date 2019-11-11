package com.example.sweetcamera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        GridView gridView = (GridView) findViewById(R.id.gridView);
    }

    public void proximaTela(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
