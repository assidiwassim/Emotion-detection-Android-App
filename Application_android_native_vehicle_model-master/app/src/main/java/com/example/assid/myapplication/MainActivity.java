package com.example.assid.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String PREFS = "PREFS";
    private static final String IngeneralCodeStore = "Empty";

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);
        setContentView(R.layout.activity_main);
            return;

    }

    public void next(View view) {

        Intent i;
        if (sharedPreferences.contains("IngeneralCodeStore")) {
            i = new Intent(this,Form2.class);
        } else {
            i = new Intent(this,Form1.class);
        }
        startActivity(i);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.item2:
                Intent ii=new  Intent(getApplicationContext(),About.class);
                startActivity(ii);
                return  true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.men,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
