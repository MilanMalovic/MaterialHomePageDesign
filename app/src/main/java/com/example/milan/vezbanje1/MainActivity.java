package com.example.milan.vezbanje1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //! Add
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {



            case R.id.action_settings:

               Intent intent = new Intent(MainActivity.this,
                        PreferenceSettingsActivity.class);
                startActivity(intent);

                return true;

            case R.id.action_about:
                AlertDialog.Builder basicAlertDialogBuilder = new AlertDialog.Builder(this);
                basicAlertDialogBuilder.setMessage(R.string.alert_dialog);
                basicAlertDialogBuilder.setPositiveButton(R.string.alert_button_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Snackbar snackbar = Snackbar.make(findViewById(R.id.main_activity), "MM", Snackbar.LENGTH_LONG);
                        snackbar.show();
                    }
                });
                basicAlertDialogBuilder.create().show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

        }






}
