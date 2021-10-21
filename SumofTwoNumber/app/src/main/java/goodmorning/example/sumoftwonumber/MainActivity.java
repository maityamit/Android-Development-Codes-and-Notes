package goodmorning.example.sumoftwonumber;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1,editText2;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.num1);
        editText2=findViewById(R.id.num2);
        button = findViewById(R.id.button);
        textView=findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(editText1.getText().toString());
                int n2 = Integer.parseInt(editText2.getText().toString());
                int sum = n1+n2;
                textView.setText(n1+" + "+n2+" = "+sum);
            }
        });
    }
}