package com.example.markito.appventacasas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button btnAddCasa;

    Button btnbtnListVecindario;

    Button btnVercasa;


    Button btnAddVecindario;



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

        btnAddCasa = (Button)findViewById(R.id.btnAddCasa);
        btnbtnListVecindario = (Button)findViewById(R.id.btnListVecindario);

        btnVercasa = (Button)findViewById(R.id.btnListarcasas);

        btnAddCasa.setOnClickListener(this);
        btnVercasa.setOnClickListener(this);

        btnAddVecindario = (Button)findViewById(R.id.btnAddVecindario);

        btnAddCasa.setOnClickListener(this);
        btnbtnListVecindario.setOnClickListener(this);

        btnAddVecindario.setOnClickListener(this);



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

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnAddCasa) {
            Intent intent = new Intent(MainActivity.this, AddCasa.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnListarcasas) {
            Intent intent = new Intent(MainActivity.this, listarcasas.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnAddVecindario) {
            Intent intent = new Intent(MainActivity.this, AddVecindario.class);
            startActivity(intent);
        } else{
            if (v.getId() == R.id.btnListVecindario){
                Intent intent = new Intent(MainActivity.this, vecindarios.class);
                startActivity(intent);
            }
        }

    }
}

