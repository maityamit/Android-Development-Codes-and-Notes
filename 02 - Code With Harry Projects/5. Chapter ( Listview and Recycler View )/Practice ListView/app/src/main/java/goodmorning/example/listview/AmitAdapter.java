package goodmorning.example.listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AmitAdapter extends ArrayAdapter<String> {


    private String[] arr;

    public AmitAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr = arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }


    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_layout,parent,false);
        TextView textView = convertView.findViewById(R.id.custom_textview);
        textView.setText(getItem(position));

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), position+" \n"+getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
