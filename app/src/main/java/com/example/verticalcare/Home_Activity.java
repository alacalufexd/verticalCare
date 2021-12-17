package com.example.verticalcare;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Home_Activity extends AppCompatActivity {

        private VideoView videoP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        videoP = findViewById(R.id.videoView);

        String ruta = "android.resource://" +getPackageName() + "/"+ R.raw.video;
        Uri uri =  Uri.parse(ruta); //uri ayuda con inten implicitos, establece conexacion correctamente
        videoP.setVideoURI(uri);

        MediaController media = new MediaController(this);//controles
        videoP.setMediaController(media);

        videoP.start();//reproduccion solo
    }
}