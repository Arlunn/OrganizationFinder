package com.example.singyboiz.organizationfinder;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import link.fls.swipestack.SwipeStack;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGe = "example.com";
    ImageAdapter adapter;
    List<String> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mData = new ArrayList<String>();
        mData.add("test1");
        mData.add("test2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwipeStack swipeStack = (SwipeStack) findViewById(R.id.swipeStack);
        swipeStack.setAdapter(new SwipeStackAdapter(mData,this));

    }


    public void SetClubNameText() {
        TextView clubName = (TextView) findViewById(R.id.clubName);
        clubName.setText("Club Name" + adapter.getPos());
    }

    /*
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
    */
    public void sendMessage(View view) {
    }
}

