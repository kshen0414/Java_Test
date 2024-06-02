package my.edu.utar.beeradvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //        Add a BeerExpert class to get beer recommendations
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){

//        Get a reference to the TextView
//        findViewById returns to us a view, we cast it to become a TextView
        TextView brands = (TextView) findViewById(R.id.brands);

//        Get a reference to the Spinner
//        note that spinner is also a view
        Spinner color = (Spinner) findViewById(R.id.color);

//        Get the selected item in the Spinner
//        String item = String.valueOf(color.getSelectedItem());
//        getSelectedItem() will return an object
//        note that we used string-array for the values
//        the actual value returned will be a string
        String beerType = String.valueOf(color.getSelectedItem());

//        Display the selected item
//        brands.setText(beerType);

//        this is stackoverflow method
//        Get recommendations from the BeerExpert class
//        suppose the below will return a brands object?
//        ArrayList<String> arr = (ArrayList<String>) expert.getBrands(beerType);
//        brands.setText(arr.toString().replace("[", "").replace("]", ""));
//        hmmm, i probably can't directly pass in an array list into my brandsTextView?
//        no,because TextView only accepts String as a parameter

        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand : brandsList){
//            to display beers on the next line
//            note that brand is just a dummy name
//            we can actually use any name we want
            brandsFormatted.append(brand).append('\n');
        }

//        Display the beers
        brands.setText(brandsFormatted);






    }
}