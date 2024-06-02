package my.edu.utar.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view){

//        retrieve text from <EditText>
        EditText editText = (EditText) findViewById(R.id.message);
        String text = String.valueOf(editText.getText());
//        String text = editText.getText().toString();
//        this refers to current activity
//        Intent intent = new Intent(this,ReceiveMessageActivity.class);

//        intent.putExtra("message",text);
//        instead we use a constant, this allows us to know that both
//        CreateMessageActivity and ReceiveMessageActivity are using the same String
//        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,text);

//        let's try using implicit intent instead
//        we have create an implicit intent that uses a send action
//        android helps us deal with the logic of finding activities that can handle ACTION_SEND and
//        of data type text/plain
        Intent intent = new Intent (Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,text);

//        now for a createChoose() method
//        R.string is used to retrieve the value of a string resource from strings.xml
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent,chooserTitle);

//        startActivity(intent);

        startActivity(chosenIntent);

    }
}