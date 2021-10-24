package goodmorning.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.input);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(editText.getText().toString());

                String s = number+" X  1 =  "+(number*1)+"\n"+
                           number+" X  2 =  "+(number*2)+"\n"+
                           number+" X  3 =  "+(number*3)+"\n"+
                           number+" X  4 =  "+(number*4)+"\n"+
                           number+" X  5 =  "+(number*5)+"\n"+
                           number+" X  6 =  "+(number*6)+"\n"+
                           number+" X  7 =  "+(number*7)+"\n"+
                           number+" X  8 =  "+(number*8)+"\n"+
                           number+" X  9 =  "+(number*9)+"\n"+
                           number+" X 10 =  "+(number*10)+"\n";

                textView.setText(s);



            }
        });
    }
}