package goodmorning.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText1;
    Button textView,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        textView = findViewById(R.id.button);
        editText1 = findViewById(R.id.edittext1);
        button1 = findViewById(R.id.button1);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editText.getText().toString();
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(intent);

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText1.getText().toString();

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
// The intent does not have a URI, so declare the "text/plain" MIME type
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"maityamit308@outlook.com"}); // recipients
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "This is Email Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, message);
// You can also attach multiple items by passing an ArrayList of Uris

                startActivity(emailIntent);

            }
        });
    }
}