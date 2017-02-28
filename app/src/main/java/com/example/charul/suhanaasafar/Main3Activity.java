package com.example.charul.suhanaasafar;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



public class Main3Activity extends AppCompatActivity {
    int n=0;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void increament(View view){
        n++;
        display(n);
        displayPrice(n*20);
    }
    public void decreament(View view){
        n--;
        display(n);
        displayPrice(n*20);
    }

    public void submitOrder(View view){
        finalamount(n);
    }
    private void display(int number)
    {
        TextView quantityTextView=(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(number));
    }
    private void displayPrice(int number){
        TextView priceTextView=(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(String.valueOf(number));
    }

    public void finalamount(int number){
        TextView quantityTextView=(TextView) findViewById(R.id.final_price);
        quantityTextView.setText("total amount to pe paid is Rs "+(number*20));
        coolie(number);
    }
public void coolie(int n){
    if(n<=4){
        TextView quantityTextView =(TextView) findViewById(R.id.coming_);        //coming_ is the name of the id of the respective
        quantityTextView.setText(String.valueOf("coolie name:rakesh,phn no:901638899"));
    }
    else if(n>=5 && n<= 10){
        TextView quantityTextView =(TextView) findViewById(R.id.coming_);        //coming_ is the name of the id of the respective
        quantityTextView.setText(String.valueOf("coolie1 name:rakesh,phn no:901638899; coolie2 name:ram,phn no:7896146797"));
    }
}
}

