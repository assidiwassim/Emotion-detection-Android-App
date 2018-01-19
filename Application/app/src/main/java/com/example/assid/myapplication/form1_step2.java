package com.example.assid.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Assid on 19/01/2018.
 */

public class form1_step2  extends AppCompatActivity {
    String Gender,Occupation,From,To;
    Spinner Ingeneral,Happy,Sad,Surprised;
    String  Name,LastName,Age ,OtherOccupation;
    String IngeneralCode,HappyCode,SadCode,SurprisedCode;
    private static final String PREFS = "PREFS";
    private static final String IngeneralCodeStore = "Empty";
    private static final String HappyCodeStore = "Empty";
    private static final String SadCodeStore = "Empty";
    private static final String SurprisedCodeStore = "Empty";

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form1_step2);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        Intent intent =getIntent();

        Name = intent.getStringExtra("Name");
        LastName = intent.getStringExtra("LastName");
        Age = intent.getStringExtra("Age");
        Gender= intent.getStringExtra("Gender");
        Occupation= intent.getStringExtra("Occupation");
        OtherOccupation = intent.getStringExtra("OtherOccupation");
        From= intent.getStringExtra("From");
        To= intent.getStringExtra("To");

        Ingeneral= (Spinner)findViewById(R.id.Ingeneral);
        Happy= (Spinner)findViewById(R.id.Happy);
        Sad= (Spinner)findViewById(R.id.Sad);
        Surprised= (Spinner)findViewById(R.id.Surprised);




    }

    public void nextz(View view) {
        /****************** Ingeneral *******************/
        if(Ingeneral.getSelectedItem().toString().matches("Classical Music")){
            IngeneralCode="Uf6h_IFTM5E";}
        else if(Ingeneral.getSelectedItem().toString().matches("Blues")){
            IngeneralCode="JL9fmQh0MSw";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Dance Music")) {
            IngeneralCode="PhUi3UUUVv4";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Dance Music")) {
            IngeneralCode="PhUi3UUUVv4";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Electro Music")) {
            IngeneralCode="2ZC3rM2Y8jQ";}
        else  if(Ingeneral.getSelectedItem().toString().matches("European Music")) {
            IngeneralCode="pojy5d7lwtY";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Hip Hop / Rap")) {
            IngeneralCode="qGmSTlvnTGI";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Indie Pop")) {
            IngeneralCode="X5xYHj77jxs";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Inspirational")) {
            IngeneralCode="S3AGRyIVJjk";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Asian Pop")) {
            IngeneralCode="l_g9isyKAM0";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Jazz")) {
            IngeneralCode="k3_tw44QsZQ";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Latin Music")) {
            IngeneralCode="76cH_n5w_P8";}
        else  if(Ingeneral.getSelectedItem().toString().matches("New Age")) {
            IngeneralCode="Ymr28yy2_E";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Opera")) {
            IngeneralCode="maezrqgQVpE";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Pop")) {
            IngeneralCode="ftJYyevC6Us";}
        else  if(Ingeneral.getSelectedItem().toString().matches("R and B")) {
            IngeneralCode="pMBOeWVLMdw";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Reggae")) {
            IngeneralCode="Sqh5xas7_TY";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Rock")) {
            IngeneralCode="yh6uflovx7s";}
        else  if(Ingeneral.getSelectedItem().toString().matches("Singer")) {
            IngeneralCode="YQHsXMglC9A";}
        else  if(Ingeneral.getSelectedItem().toString().matches("World Music")) {
            IngeneralCode="tp_y1B1eQeo";}
        else {
            IngeneralCode="YQHsXMglC9A";
        }

        /****************** Happy *******************/
        if(Happy.getSelectedItem().toString().matches("Classical Music")){
            HappyCode="Uf6h_IFTM5E";}
        else if(Happy.getSelectedItem().toString().matches("Blues")){
            HappyCode="JL9fmQh0MSw";}
        else  if(Happy.getSelectedItem().toString().matches("Dance Music")) {
            HappyCode="PhUi3UUUVv4";}
        else  if(Happy.getSelectedItem().toString().matches("Dance Music")) {
            HappyCode="PhUi3UUUVv4";}
        else  if(Happy.getSelectedItem().toString().matches("Electro Music")) {
            HappyCode="2ZC3rM2Y8jQ";}
        else  if(Happy.getSelectedItem().toString().matches("European Music")) {
            HappyCode="pojy5d7lwtY";}
        else  if(Happy.getSelectedItem().toString().matches("Hip Hop / Rap")) {
            HappyCode="qGmSTlvnTGI";}
        else  if(Happy.getSelectedItem().toString().matches("Indie Pop")) {
            HappyCode="X5xYHj77jxs";}
        else  if(Happy.getSelectedItem().toString().matches("Inspirational")) {
            HappyCode="S3AGRyIVJjk";}
        else  if(Happy.getSelectedItem().toString().matches("Asian Pop")) {
            HappyCode="l_g9isyKAM0";}
        else  if(Happy.getSelectedItem().toString().matches("Jazz")) {
            HappyCode="k3_tw44QsZQ";}
        else  if(Happy.getSelectedItem().toString().matches("Latin Music")) {
            HappyCode="76cH_n5w_P8";}
        else  if(Happy.getSelectedItem().toString().matches("New Age")) {
            HappyCode="Ymr28yy2_E";}
        else  if(Happy.getSelectedItem().toString().matches("Opera")) {
            HappyCode="maezrqgQVpE";}
        else  if(Happy.getSelectedItem().toString().matches("Pop")) {
            HappyCode="ftJYyevC6Us";}
        else  if(Happy.getSelectedItem().toString().matches("R and B")) {
            HappyCode="pMBOeWVLMdw";}
        else  if(Happy.getSelectedItem().toString().matches("Reggae")) {
            HappyCode="Sqh5xas7_TY";}
        else  if(Happy.getSelectedItem().toString().matches("Rock")) {
            HappyCode="yh6uflovx7s";}
        else  if(Happy.getSelectedItem().toString().matches("Singer")) {
            HappyCode="YQHsXMglC9A";}
        else  if(Happy.getSelectedItem().toString().matches("World Music")) {
            HappyCode="tp_y1B1eQeo";}
        else {
            HappyCode="YQHsXMglC9A";
        }

        /****************** Sad *******************/
        if(Sad.getSelectedItem().toString().matches("Classical Music")){
            SadCode="Uf6h_IFTM5E";}
        else if(Sad.getSelectedItem().toString().matches("Blues")){
            SadCode="JL9fmQh0MSw";}
        else  if(Sad.getSelectedItem().toString().matches("Dance Music")) {
            SadCode="PhUi3UUUVv4";}
        else  if(Sad.getSelectedItem().toString().matches("Dance Music")) {
            SadCode="PhUi3UUUVv4";}
        else  if(Sad.getSelectedItem().toString().matches("Electro Music")) {
            SadCode="2ZC3rM2Y8jQ";}
        else  if(Sad.getSelectedItem().toString().matches("European Music")) {
            SadCode="pojy5d7lwtY";}
        else  if(Sad.getSelectedItem().toString().matches("Hip Hop / Rap")) {
            SadCode="qGmSTlvnTGI";}
        else  if(Sad.getSelectedItem().toString().matches("Indie Pop")) {
            SadCode="X5xYHj77jxs";}
        else  if(Sad.getSelectedItem().toString().matches("Inspirational")) {
            SadCode="S3AGRyIVJjk";}
        else  if(Sad.getSelectedItem().toString().matches("Asian Pop")) {
            SadCode="l_g9isyKAM0";}
        else  if(Sad.getSelectedItem().toString().matches("Jazz")) {
            SadCode="k3_tw44QsZQ";}
        else  if(Sad.getSelectedItem().toString().matches("Latin Music")) {
            SadCode="76cH_n5w_P8";}
        else  if(Sad.getSelectedItem().toString().matches("New Age")) {
            SadCode="Ymr28yy2_E";}
        else  if(Sad.getSelectedItem().toString().matches("Opera")) {
            SadCode="maezrqgQVpE";}
        else  if(Sad.getSelectedItem().toString().matches("Pop")) {
            SadCode="ftJYyevC6Us";}
        else  if(Sad.getSelectedItem().toString().matches("R and B")) {
            SadCode="pMBOeWVLMdw";}
        else  if(Sad.getSelectedItem().toString().matches("Reggae")) {
            SadCode="Sqh5xas7_TY";}
        else  if(Sad.getSelectedItem().toString().matches("Rock")) {
            SadCode="yh6uflovx7s";}
        else  if(Sad.getSelectedItem().toString().matches("Singer")) {
            SadCode="YQHsXMglC9A";}
        else  if(Sad.getSelectedItem().toString().matches("World Music")) {
            SadCode="tp_y1B1eQeo";}
        else {
            SadCode="YQHsXMglC9A";
        }

        /****************** Surprised *******************/
        if(Surprised.getSelectedItem().toString().matches("Classical Music")){
            SurprisedCode="Uf6h_IFTM5E";}
        else if(Surprised.getSelectedItem().toString().matches("Blues")){
            SurprisedCode="JL9fmQh0MSw";}
        else  if(Surprised.getSelectedItem().toString().matches("Dance Music")) {
            SurprisedCode="PhUi3UUUVv4";}
        else  if(Surprised.getSelectedItem().toString().matches("Dance Music")) {
            SurprisedCode="PhUi3UUUVv4";}
        else  if(Surprised.getSelectedItem().toString().matches("Electro Music")) {
            SurprisedCode="2ZC3rM2Y8jQ";}
        else  if(Surprised.getSelectedItem().toString().matches("European Music")) {
            SurprisedCode="pojy5d7lwtY";}
        else  if(Surprised.getSelectedItem().toString().matches("Hip Hop / Rap")) {
            SurprisedCode="qGmSTlvnTGI";}
        else  if(Surprised.getSelectedItem().toString().matches("Indie Pop")) {
            SurprisedCode="X5xYHj77jxs";}
        else  if(Surprised.getSelectedItem().toString().matches("Inspirational")) {
            SurprisedCode="S3AGRyIVJjk";}
        else  if(Surprised.getSelectedItem().toString().matches("Asian Pop")) {
            SurprisedCode="l_g9isyKAM0";}
        else  if(Surprised.getSelectedItem().toString().matches("Jazz")) {
            SurprisedCode="k3_tw44QsZQ";}
        else  if(Surprised.getSelectedItem().toString().matches("Latin Music")) {
            SurprisedCode="76cH_n5w_P8";}
        else  if(Surprised.getSelectedItem().toString().matches("New Age")) {
            SurprisedCode="Ymr28yy2_E";}
        else  if(Surprised.getSelectedItem().toString().matches("Opera")) {
            SurprisedCode="maezrqgQVpE";}
        else  if(Surprised.getSelectedItem().toString().matches("Pop")) {
            SurprisedCode="ftJYyevC6Us";}
        else  if(Surprised.getSelectedItem().toString().matches("R and B")) {
            SurprisedCode="pMBOeWVLMdw";}
        else  if(Surprised.getSelectedItem().toString().matches("Reggae")) {
            SurprisedCode="Sqh5xas7_TY";}
        else  if(Surprised.getSelectedItem().toString().matches("Rock")) {
            SurprisedCode="yh6uflovx7s";}
        else  if(Surprised.getSelectedItem().toString().matches("Singer")) {
            SurprisedCode="YQHsXMglC9A";}
        else  if(Surprised.getSelectedItem().toString().matches("World Music")) {
            SurprisedCode="tp_y1B1eQeo";}
        else {
            SurprisedCode="YQHsXMglC9A";
        }



        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);
        if (sharedPreferences.contains("IngeneralCodeStore")) {




        } else {
            //si aucun utilisateur n'est sauvegardé
            sharedPreferences
                    .edit()
                    .putString("IngeneralCodeStore", IngeneralCode)
                    .putString("HappyCodeStore", HappyCode)
                    .putString("SadCodeStore", SadCode)
                    .putString("SurprisedCodeStore", SurprisedCode)
                    .apply();


            /**************Fire base store***********/
            // Write a message to the database
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("UsersProfiles").push();
            Person p = new Person();

            p.Name=Name;
            p.LastName=LastName;
            p.Age=Age;
            p.Gender=Gender;

            p.Occupation=Occupation;
            p.OtherOccupation=OtherOccupation;
            p.Work_From=From;
            p.Work_To=To;

            p.InGeneral=Ingeneral.getSelectedItem().toString();
            p.Happy=Happy.getSelectedItem().toString();
            p.Sad=Sad.getSelectedItem().toString();
            p.Surprised=Surprised.getSelectedItem().toString();
            myRef.setValue(p);



            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
        }

        Intent i = new Intent(this,Form2.class);
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
