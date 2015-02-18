package com.example.davidstanley.test1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Kelly
 * A place to play around with some extra stuff!
 */
public class SecondActivity extends ActionBarActivity{

    LinearLayout mRocketShipLayout;
    EditText mUserInputEditText;
    TextView mUserText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        // Rocket ship layout stuff
        mRocketShipLayout = (LinearLayout) findViewById(R.id.layout_rocketships);

        Button clickMeButton = (Button) findViewById(R.id.button_click_me);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Toggle the visibility of the rocketships when the user clicks the button
                if( mRocketShipLayout.getVisibility() == View.VISIBLE){
                    mRocketShipLayout.setVisibility(View.INVISIBLE);
                }
                else {
                    mRocketShipLayout.setVisibility(View.VISIBLE);
                }
            }
        });


        // User input stuff
        mUserInputEditText = (EditText) findViewById(R.id.edit_user_input);
        mUserText = (TextView) findViewById(R.id.text_users_input);

        Button enterButton = (Button) findViewById(R.id.button_enter);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = mUserInputEditText.getText().toString();
                mUserText.setText(userText);
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
}
