package com.example.bth4_nguyentrungvu_191052244;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView txtMsg;
    ListView myListView;
    String [] items =  {"Cơ sở lập trình", "Cơ sở dữ liệu",
            "Cấu trúc dữ liệu", "Lập trình hướng đối tượng"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        myListView.setAdapter(aa);

        txtMsg = (TextView) findViewById(R.id.txtMsg);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = "Position: " + position + " " +
                        items[position];
                txtMsg.setText(text);
                Intent intent = new Intent(MainActivity.this, ManageActivty.class);
                startActivity(intent);

            }
        });
    }

}