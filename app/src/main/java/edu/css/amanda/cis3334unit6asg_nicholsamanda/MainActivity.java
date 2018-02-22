package edu.css.amanda.cis3334unit6asg_nicholsamanda;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btn1Call, btn1Text, btn2Call, btn2Text, btn3Call, btn3Text;
    Spinner spinner1Messages, spinner2Messages, spinner3Messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up the message spinners
        spinner1Messages = (Spinner) findViewById(R.id.spinner1Messages);
        spinner2Messages = (Spinner) findViewById(R.id.spinner2Messages);
        spinner3Messages = (Spinner) findViewById(R.id.spinner3Messages);

        // set up the button click events
        setupButtonClickEvents();
        setupButton2ClickEvents();
        setupButton3ClickEvents();
    }

    // ONE------------------------------------------------------------------------------------------

    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the CALL button for the first performance
         */
        btn1Call = (Button) findViewById(R.id.button1Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:2185137899"));
                // check if there is an app to make phone call
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the TEXT button for the first performance
         */
        btn1Text = (Button) findViewById(R.id.button1Text);
        btn1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                // set phone number for contact1
                sendIntent.setData(Uri.parse("sms:2185137899"));
                // get selected message choice from spinner1
                sendIntent.putExtra("sms_body", spinner1Messages.getSelectedItem().toString());
                startActivity(sendIntent);
            }



        });
    }

    // TWO------------------------------------------------------------------------------------------

    private void setupButton2ClickEvents() {
        /**
         *   Set up button click event listener for the CALL button for the first performance
         */
        btn2Call = (Button) findViewById(R.id.button2Call);
        btn2Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:2188211995"));
                // check if there is an app to make phone call
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the TEXT button for the first performance
         */
        btn2Text = (Button) findViewById(R.id.button2Text);
        btn2Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                // set phone number for contact2
                sendIntent.setData(Uri.parse("sms:2188211995"));
                // get selected message from spinner2
                sendIntent.putExtra("sms_body", spinner2Messages.getSelectedItem().toString());
                startActivity(sendIntent);
            }


        });
    }

    // THREE----------------------------------------------------------------------------------------

    private void setupButton3ClickEvents() {
        /**
         *   Set up button click event listener for the CALL button for the first performance
         */
        btn3Call = (Button) findViewById(R.id.button3Call);
        btn3Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:2188210712"));
                // check if there is an app to make phone call
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the TEXT button for the first performance
         */
        btn3Text = (Button) findViewById(R.id.button3Text);
        btn3Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                // set phone number for contact3
                sendIntent.setData(Uri.parse("sms:2188210712"));
                // get selected message from spinner3
                sendIntent.putExtra("sms_body", spinner3Messages.getSelectedItem().toString());
                startActivity(sendIntent);
            }


        });
    }

}
