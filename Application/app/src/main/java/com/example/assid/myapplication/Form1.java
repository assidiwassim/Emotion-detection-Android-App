package com.example.assid.myapplication;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


public class Form1 extends AppCompatActivity {

    Spinner Gender,Occupation,From,To;
    EditText Name,LastName,Age ,OtherOccupation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Name = (EditText) findViewById(R.id.Name);
        LastName = (EditText) findViewById(R.id.LastName);
        Age = (EditText) findViewById(R.id.Age);
        Gender= (Spinner)findViewById(R.id.Gender);
        Occupation= (Spinner)findViewById(R.id.Occupation);
        OtherOccupation = (EditText) findViewById(R.id.OtherOccupation);
        From= (Spinner)findViewById(R.id.From);
        To= (Spinner)findViewById(R.id.To);

    }

    public void nextz(View view) {

        Intent i ;
        i = new Intent(this,form1_step2.class);
        i.putExtra("Name",Name.getText().toString());
        i.putExtra("LastName",LastName.getText().toString());
        i.putExtra("Age",Age.getText().toString());
        i.putExtra("Gender",Gender.getSelectedItem().toString());
        i.putExtra("Occupation",Occupation.getSelectedItem().toString());
        i.putExtra("OtherOccupation",OtherOccupation.getText().toString());
        i.putExtra("From",From.getSelectedItem().toString());
        i.putExtra("To",To.getSelectedItem().toString());
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
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
