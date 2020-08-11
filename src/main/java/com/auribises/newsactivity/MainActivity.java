package com.auribises.newsactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lRef;
   ArrayAdapter<String> adapter;

    void initViews() {
        lRef = findViewById(R.id.listView);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.add("Zee News");
        adapter.add("CNN");
        adapter.add("Aaj Tak");
        adapter.add("ABP");
        adapter.add("BBC");
        adapter.add("News18");
        adapter.add("Li News");
        lRef.setAdapter(adapter);
        lRef.setOnItemClickListener(this);


    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_one);

        getSupportActionBar().setTitle("News");
        initViews();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
        if (position ==0){
            String url = "https://zeenews.india.com";
            Intent intent = new Intent(MainActivity.this, NewsActivityone.class );
            intent.putExtra("KeyUrl",url);
            startActivity(intent);

        }else if (position==1){
            String url1 = "https://edition.cnn.com";
            Intent intent = new Intent(MainActivity.this, NewsActivityone.class );
            intent.putExtra("KeyUrl",url1);
            startActivity(intent);

        }else if (position==2){
            String url2 = "https://aajtak.intoday.in";
            Intent intent = new Intent(MainActivity.this, NewsActivityone.class );
            intent.putExtra("KeyUrl2",url2);
            startActivity(intent);

        }else if (position==3){
            String url3 = "https://abpnews.abplive.in";
            Intent intent = new Intent(MainActivity.this, NewsActivityone.class );
            intent.putExtra("KeyUrl3",url3);
            startActivity(intent);

        }else if (position==4){
            String url4 = "https://www.bbc.com";
            Intent intent = new Intent(MainActivity.this, NewsActivityone.class );
            intent.putExtra("KeyUrl4",url4);
            startActivity(intent);

        }else if (position==5){
            String url5 = "https://www.news18.com";
            Intent intent = new Intent(MainActivity.this, NewsActivityone.class );
            intent.putExtra("KeyUrl5",url5);
            startActivity(intent);

        }else if (position==6){
            String url6 = "http://www.livingindianews.co.in";
            Intent intent = new Intent(MainActivity.this, NewsActivityone.class );
            intent.putExtra("KeyUrl6",url6);
            startActivity(intent);

        }else{
            Toast.makeText(this, "Please Select an Item", Toast.LENGTH_SHORT).show();
        }
        String news = adapter.getItem(position);
        Toast.makeText(this, "You Clicked: "+position+" | "+news, Toast.LENGTH_LONG).show();
    }

}
