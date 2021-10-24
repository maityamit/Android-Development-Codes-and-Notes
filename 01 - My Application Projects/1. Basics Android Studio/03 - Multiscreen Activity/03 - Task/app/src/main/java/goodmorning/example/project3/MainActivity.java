package goodmorning.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] questions = {"Is your name is Amit ?", "Are you a school student ?", "Are you study GL Bajaj ?"};
    private Boolean[] answers = {true, false, true};

    private TextView question;
    private Button yes, no;

    private int score = 0;
    private int index = 0;

    private TextView scoretext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = findViewById(R.id.question);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        scoretext = findViewById(R.id.score);

        question.setText(questions[index]);


        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index <= questions.length - 1){
                    if (answers[index]) {
                        score += 5;
                    }
                    index++;
                    if (index <= questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else {
                        scoretext.setText("Your Score : "+ score + " / "+((questions.length)*5));
                    }
                }else {
                    scoretext.setText("Your Score : "+ score + " / "+((questions.length)*5));
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index <= questions.length - 1){
                    if (!answers[index]) {
                        score += 5;
                    }
                    index++;
                    if (index <= questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else {
                        scoretext.setText("Your Score : "+ score + " / "+((questions.length)*5));
                    }
                }else {
                    scoretext.setText("Your Score : "+ score + " / "+((questions.length)*5));
                }
            }
        });





    }


}