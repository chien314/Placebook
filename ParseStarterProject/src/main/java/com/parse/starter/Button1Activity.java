package com.parse.starter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.parse.ParseUser;

public class Button1Activity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();

        menuInflater.inflate(R.menu.share_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.logout) {
            ParseUser.logOut();
            //Log.i("you're logged out", )
            Toast.makeText(this, "you're logged out!",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void callButton3(View view){
        Intent intent = new Intent(getApplicationContext(), Button2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);
        setTitle("Placebook");
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_type);
//        setTitle("Placebook");
//
//        ListView listView1 = findViewById(R.id.listView1);
//        //places.add("Add a new place...");
//        locations.add(new LatLng(0,0));
//
//        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, places);
//
//        listView1.setAdapter(arrayAdapter);
//
//        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
//                intent.putExtra("placeNumber",i);
//
//                //   startActivity(intent);
//            }
//        });
//    }
}
