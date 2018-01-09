package com.cyw.a2018010901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //直接打option就會出現method讓你選, 這個option是手機右上角三個點
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"ADD");
        menu.add(0,2,0,"EDIT");
        //老師沒講Group是幹嘛用的也沒講order
//        menu.add(1,1,0,"ADD1");
//        menu.add(1,2,0,"EDIT1");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Toast.makeText(MainActivity.this, "你按了ADD", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this, "你按了EDIT", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
