package com.example.mapp2;



import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class GifActivity extends AppCompatActivity {

    private ImageView imageViewGif;
    private EditText editTextContact;

    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gifactivity);

        imageViewGif = findViewById(R.id.imageViewGif);
        editTextContact = findViewById(R.id.editTextContact);
        buttonSend = findViewById(R.id.buttonSend);


        // Get the mood passed from MainActivity
        String mood = getIntent().getStringExtra("mood");

        // Fetch and display GIFs based on the mood
        fetchAndDisplayGIFs(mood);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendGif();
            }
        });
    }

    private void fetchAndDisplayGIFs(String mood) {
        int gifResource;
        switch (mood) {
            case "happy":
                // Fetch the GIF resource for happy mood
                gifResource = R.drawable.happy_gif;
                break;
            case "sad":
                // Fetch the GIF resource for sad mood
                gifResource = R.drawable.sad_gif;
                break;
            case "angry":
                // Fetch the GIF resource for angry mood
                gifResource = R.drawable.angry_gif;
                break;
            case "funny":
                // Fetch the GIF resource for funny mood
                gifResource = R.drawable.funny_gif;
                break;
            case "lovely":
                // Fetch the GIF resource for lovely mood
                gifResource = R.drawable.lovely_gif;
                break;
            case "crazy":
                // Fetch the GIF resource for crazy mood
                gifResource = R.drawable.crazy_gif;
                break;
            default:
                // Default to a placeholder GIF if mood is unknown
                gifResource = R.drawable.placeholder_gif;
                break;
        }

        imageViewGif.setImageResource(gifResource);
    }

    private void sendGif() {

        String recipientNumber = editTextContact.getText().toString().trim();


        Uri gifUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.happy_gif);

        // Create an intent to share the GIF via messaging app
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_STREAM, gifUri);
        sendIntent.setType("image/gif");
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Your message goes here");
       // sendIntent.putExtra("address", recipientNumber);


        if (!recipientNumber.isEmpty()) {

            if (sendIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(sendIntent);
            } else {
                Toast.makeText(this, "No messaging app found on the device", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(this, "Please enter a recipient's contact number", Toast.LENGTH_LONG).show();
        }
    }
}
