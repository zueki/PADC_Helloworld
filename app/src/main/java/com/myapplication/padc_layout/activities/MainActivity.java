package com.myapplication.padc_layout.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.myapplication.padc_layout.R;
import com.myapplication.padc_layout.fragments.framelayoutfragment;
import com.myapplication.padc_layout.fragments.gridlayoutfragment;
import com.myapplication.padc_layout.fragments.linearlayoutfragment;
import com.myapplication.padc_layout.fragments.relativelayoutfragment;

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




        Button btnrelativelayout = (Button) findViewById(R.id.btnrelativelayout);
        btnrelativelayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                relativelayoutfragment fragment = new relativelayoutfragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }


            //condition checking
            //  if(savedInstanceState==null){


            // }
        });

        Button btnframelayout = (Button) findViewById(R.id.btnframelayout);
        btnframelayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                framelayoutfragment fragment = new framelayoutfragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }
        });


        Button btnlinearlayout = (Button) findViewById(R.id.btnlinearlayout);
        btnlinearlayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                linearlayoutfragment fragment = new linearlayoutfragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }
        });

        Button btngridlayout = (Button) findViewById(R.id.btngridlayoout);
        btngridlayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                gridlayoutfragment fragment = new gridlayoutfragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
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
