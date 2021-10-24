package goodmorning.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String arr[] = {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7","Item 8","Item 9","Item 10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       listView = findViewById(R.id.list_view);


//       // android.R.layout.......
//
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//
//        listView.setAdapter(arrayAdapter);


        AmitAdapter ad = new AmitAdapter(this,R.layout.my_layout,arr);
        listView.setAdapter(ad);




    }
}