package com.example.mapp2;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

     Button buttonHappy;

    Button buttonangry;
    Button buttonsad;

    Button buttonlovely;
        Button buttoncrazy;
    Button buttonfunny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHappy = findViewById(R.id.buttonHappy);
        buttonangry=findViewById(R.id.buttonangry);
        buttonfunny = findViewById(R.id.buttonfunny);
      buttonsad = findViewById(R.id.buttonsad);
        buttoncrazy = findViewById(R.id.buttoncrazy);
       buttonlovely = findViewById(R.id.buttonlovely);
//
//
//
        buttonlovely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToGifActivity("lovely");
            }
        });

        buttoncrazy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToGifActivity("crazy");
            }
        });

        buttonfunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToGifActivity("funny");
            }
        });
//


        buttonsad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToGifActivity("sad");

            }
        });

        buttonangry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToGifActivity("angry");

            }
        });

        buttonHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the GifActivity passing the mood
                navigateToGifActivity("happy");
            }
        });


    }

    private void navigateToGifActivity(String mood) {
        Intent intent = new Intent(this, GifActivity.class);
        intent.putExtra("mood", mood);
        startActivity(intent);
    }
}
