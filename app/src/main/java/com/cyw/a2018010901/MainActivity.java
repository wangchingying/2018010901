package com.cyw.a2018010901;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//在res開一個叫做menu的資料夾, 並新增一個檔案mymenu.xml(檔名隨便取),拉兩個menu item到畫面,並定義id及Title
// icon與 showAsAction 可以選擇按鈕圖檔並勾選是否常駐在action bar,有五種顯示方法
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater=getMenuInflater();
//        inflater.inflate(R.menu.mymenu,menu);
        //寫成一行
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_add:
                Toast.makeText(MainActivity.this, "你按了ADDx", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_edit:
                Toast.makeText(MainActivity.this, "你按了EDITx", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //直接打option就會出現method讓你選, 這個option是手機右上角三個點
/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"ADD");
        menu.add(0,2,0,"EDIT");
        //老師沒講Group是幹嘛用的也沒講order
        menu.add(1,1,0,"ADD1");
        menu.add(1,2,0,"EDIT1");

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
*/


}
