package my.edu.utar.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
//        String string = intent.getStringExtra("message");
        String string = intent.getStringExtra("EXTRA_MESSAGE");
//        String string = intent.getExtras().getString("message");

        TextView textView = (TextView) findViewById(R.id.message2);
        textView.setText(string);

    }


}