package my.edu.utar.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setTitle("Challenge Test");
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView view1 = findViewById(R.id.textView1);
        TextView view2 = findViewById(R.id.textView2);
        TextView view3 = findViewById(R.id.textView3);

        EditText editText1 = findViewById(R.id.editTextFname);
        EditText editText2 = findViewById(R.id.editTextLname);
        EditText editText3 = findViewById(R.id.editTextTextEmail);


        view1.setText("First Name: " + editText1.getText().toString());
        view2.setText("Last Name: " + editText2.getText());
        view3.setText("Email: "+ editText3.getText());
    }

}