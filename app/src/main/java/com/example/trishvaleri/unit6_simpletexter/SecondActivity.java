package com.example.trishvaleri.unit6_simpletexter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Spinner;

public class SecondActivity extends AppCompatActivity {

    String msgNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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

        // get the data passed from the main activity using extras
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // grab the message number as a string from the main activity using extras
            msgNum = extras.getString("msgNum");
        }

    }

    //gets the spinners predefined text and opens up the text app to send it to the number associated with each person.
    public void btnSendMsgOnClick (View view) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String text = spinner.getSelectedItem().toString();

        if (msgNum.equals("1")) {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:2183911863"));
            sendIntent.putExtra("sms_body", text);
            startActivity(sendIntent);
        }
        if (msgNum.equals("2")) {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:2189661234"));
            sendIntent.putExtra("sms_body", text);
            startActivity(sendIntent);
        }
        if (msgNum.equals("3")) {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:2181234567"));
            sendIntent.putExtra("sms_body", text);
            startActivity(sendIntent);
        }
    }
}
