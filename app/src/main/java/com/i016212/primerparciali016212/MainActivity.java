package com.i016212.primerparciali016212;


import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bnv_1);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_1:
                        UnoFragment unoFragment = new UnoFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, unoFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "ITEM 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_2:
                        LinearFragmen dosFragment = new LinearFragmen();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, dosFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "ITEM 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_3:
                        TresFragment tresFragment = new TresFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, tresFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "ITEM 3", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}

