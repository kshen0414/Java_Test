package my.edu.utar.practical1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
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
//        setContentView(R.layout.activity_main);

//        create params for views
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

//        create a layout
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

//        create a TextView
        TextView textView = new TextView(this);

        textView.setText("Hello World");
//        we try adjusting the text size
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,30);
//        textView.setLayoutParams(params);

//        create an EditText
//        Also create TextView for name prompt
        TextView text2 = new TextView(this);
        text2.setText("Please enter a name");

        text2.setLayoutParams(params);
        EditText editText = new EditText(this);

//        editText.setLayoutParams(params);

//        create a checkbox
        CheckBox checkBox = new CheckBox(this);
        CheckBox checkBox2 = new CheckBox(this);
        CheckBox checkBox3 = new CheckBox(this);

        checkBox.setText("Internet");
        checkBox2.setText("Books");
        checkBox3.setText("Newspaper");


//        checkBox.setLayoutParams(params);


//        create a RadioButton
        RadioButton radioButton = new RadioButton(this);
        RadioButton radioButton2 = new RadioButton(this);
        RadioButton radioButton3 = new RadioButton(this);

        radioButton.setText("Apple");
        radioButton2.setText("Pear");
        radioButton3.setText("Grape");

        //        create a RadioGroup
        RadioGroup radioGroup = new RadioGroup(this);
        radioGroup.addView(radioButton);
        radioGroup.addView(radioButton2);
        radioGroup.addView(radioButton3);
//        radioGroup.setLayoutParams(params);

//        radioButton.setLayoutParams(params);


//        create a button
        Button button = new Button(this);
        button.setText("Submit");
//        button.setLayoutParams(params);

//        Add all elements to the layout
        linearLayout.addView(textView);
        linearLayout.addView(text2);


        linearLayout.addView(editText);
        linearLayout.addView(checkBox);
        linearLayout.addView(checkBox2);
        linearLayout.addView(checkBox3);

//      linearLayout.addView(radioButton);
        linearLayout.addView(radioGroup);

        linearLayout.addView(button);

//        Create a layout param for the layout
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
        this.addContentView(linearLayout, layoutParams);


    }

}