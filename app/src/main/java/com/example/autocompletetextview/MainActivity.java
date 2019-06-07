package com.example.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView auto;
    String data[]={"ram","Syam","Mohan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auto=(AutoCompleteTextView)findViewById(R.id.auto);
        ArrayAdapter adapter =new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,data);
        auto.setAdapter(adapter);
    }
}
