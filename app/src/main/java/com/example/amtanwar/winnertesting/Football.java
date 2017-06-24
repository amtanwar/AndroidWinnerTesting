package com.example.amtanwar.winnertesting;

import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Football extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
        final Button score_sub = (Button) findViewById(R.id.score_sub);
        final EditText edit_barc = (EditText) findViewById(R.id.edit_barc);
        final EditText edit_mad = (EditText) findViewById(R.id.edit_mad);
        final TextView result_view = (TextView) findViewById(R.id.result_view);

        score_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String b = edit_barc.getText().toString();
                String m = edit_mad.getText().toString();

                if (b.equals("") || (m.equals(""))) {
                    Toast.makeText(getApplicationContext(), "Enter valid values.", Toast.LENGTH_LONG);
                } else {
                    Winner c = new Winner();
                    String s = c.winner(b, m);
                    result_view.setText(s);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_football, menu);
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
