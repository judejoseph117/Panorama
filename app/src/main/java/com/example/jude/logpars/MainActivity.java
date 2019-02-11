package com.example.jude.logpars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class MainActivity extends AppCompatActivity {
    private GyroscopeObserver gyroscopeObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PanoramaImageView panoramaImageView;
        panoramaImageView=findViewById(R.id.pano);
        gyroscopeObserver=new GyroscopeObserver();
//        panoramaImageView.setEnablePanoramaMode(true);
//        panoramaImageView.setEnableScrollbar(false);
//        panoramaImageView.setInvertScrollDirection(false);
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver);

    }

    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver.unregister();
    }
}
