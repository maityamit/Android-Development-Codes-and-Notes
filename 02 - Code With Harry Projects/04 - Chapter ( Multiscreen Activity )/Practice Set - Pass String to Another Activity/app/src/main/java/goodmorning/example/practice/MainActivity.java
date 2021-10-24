  package goodmorning.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

  public class MainActivity extends AppCompatActivity {


    EditText editText;
    public static final String EXTRA_NAME = "Name";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.butoon);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra(EXTRA_NAME,string);
                startActivity(intent);
            }
        });
    }
}