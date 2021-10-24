package goodmorning.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.name_show);

        Intent intent = getIntent();
        String string1 = intent.getStringExtra(MainActivity.EXTRA_NAME);

        textView.setText(string1);

    }
}