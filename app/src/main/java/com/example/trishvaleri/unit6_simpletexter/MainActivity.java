//====================================================
//Title: Unit6_SimpleTexter
//Author: Trish Valeri
//Contributor: CIS 3334
//Date: 2/26/16 - 2/28/16
//Purpose: To create an app that allows the user to text three different people. (Intent to open the
//         predefined messages, and Intent to open the built in text app.
//====================================================

package com.example.trishvaleri.unit6_simpletexter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void btn1onClick (View view) {
        // create an intent for the second activity
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("msgNum","1");         // pass the message number 1 to the second activity
        startActivity(i);                   // start up the second activity
    }

    public void btn2onClick (View view) {
        // create an intent for the second activity
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("msgNum","2");         // pass the message number 2 to the second activity
        startActivity(i);                   // start up the second activity
    }

    public void btn3onClick (View view) {
        // create an intent for the second activity
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("msgNum","3");         // pass the message number 3 to the second activity
        startActivity(i);                   // start up the second activity
    }
}
