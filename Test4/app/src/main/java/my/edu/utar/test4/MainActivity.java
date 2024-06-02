package my.edu.utar.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] fruits = {"Apple", "Orange", "Banana", "Kiwi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        for list_item, we have to create a listAdapter

//        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,fruits);

//        a different approach based on strings.xml
//        String[] fruits_string = getResources().getStringArray(R.array.list_view);
//        ListView listView = (ListView) findViewById(R.id.myListView);
//        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, fruits_string);

        

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,fruits);

//        declare a listview object
        ListView listView = (ListView) findViewById(R.id.myListView);
        listView.setAdapter(adapter);
    }
}