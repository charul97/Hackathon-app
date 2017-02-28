package com.example.charul.suhanaasafar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button btn = (Button) findViewById(R.id.radio);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("Intent", "On click called.");
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.indianrail.gov.in/dont_Know_Station_Code.html"));
                startActivity(i);


                //Log.d("Intent", "On click ended.");
            }
        });
        Button butn = (Button) findViewById(R.id.radio1);
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("Intent", "On click called.");
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.weather.com/en-IN"));
                startActivity(i);


                //Log.d("Intent", "On click ended.");
            }
        });}
        public void butn(View v){
            Intent intent=new Intent(this, Main3Activity.class);
            startActivity(intent);
        }

}
