package my.edu.utar.test;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView txtHello = findViewById(R.id.msg);
//        txtHello.setText("Hello");

//        EditText editTxtName = findViewById(R.id.editTxtName);
//        editTxtName.getText().toString();

    }

//    our objective is to create a method, that when we click the button it changes the text of hello world
    public void onBtnClick (View view) {
        TextView txtHello = findViewById(R.id.msg);
//        txtHello.setText("Hello");

        EditText editTxtName = findViewById(R.id.editTxtName);
        txtHello.setText("Hello" + editTxtName.getText().toString());

    }

}