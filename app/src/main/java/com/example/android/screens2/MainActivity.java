package com.example.android.screens2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    boolean Attend5 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "Home");
        adapter.addFragment(new Tab2Fragment(), "Events");
       // adapter.addFragment(new Tab3Fragment(), "Points");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        Event event0 = new Event("Midterms Study Session", 10, 20, 2019, 3);
        Event event1 = new Event("Conference Prep", 10, 22, 2019, 5);
        Event event2 = new Event("Pumpkin Carving", 10, 25, 2019, 3);
        Event event3 = new Event("SHPE Conference", 10, 30, 2019, 3);
        Event event4 = new Event("Trick or Treating", 10, 31, 2019, 3);
        Event event5 = new Event("Midterms Study Session", 11, 4, 2019, 3);
        Event event6 = new Event("Movie Night", 11, 8, 2019, 3);
        Event event7 = new Event("Build a Hovercraft", 11, 9, 2019, 3);

     //   TextView t1 = getView().findViewById(R.id.textView9);
     //   t1.setText( "Oct. 30    SHPE Conference     5 pts");
        TextView t2 = findViewById(R.id.textView10);
        t2.setText( "Nov.4      Midterms Study Session     3 pts");
        TextView t3 = findViewById(R.id.textView11);
        t3.setText( "Nov.8      Movie Night   3 pts");

        final TextView t5 = findViewById(R.id.textView8);

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Attend5 = !Attend5;
                if(Attend5 == true) {
                    t5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.clickheart, 0);
                }else{
                    t5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.emptyheart, 0);
                }
                t5.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.emptyheart, 0);
            }
            });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "You will earn 11 points", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
