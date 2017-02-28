package com.example.charul.suhanaasafar;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
public void button(View view){


    EditText num1 = (EditText) findViewById(R.id.editText) ;
    int val1 = Integer.parseInt( num1.getText().toString() );
    EditText num = (EditText) findViewById(R.id.editText2) ;
    int val = Integer.parseInt( num.getText().toString() );
    if ((val == 123 ||val==456||val==789)&&(val1==9876||val1==6543)){
        Intent intent=new Intent(this, Main2Activity.class);
        startActivity(intent);}
    else {
        error();
    }
}
    public void error(){
        TextView quantityTextView =(TextView) findViewById(R.id.coming_);        //coming_ is the name of the id of the respective
        quantityTextView.setText(String.valueOf("Enter valid username and password"));     //textview which we want to display corresponding
    }
}