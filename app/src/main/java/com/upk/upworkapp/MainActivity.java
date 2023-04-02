package com.upk.upworkapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation_1;
    TextView general_text, product_design_text, mobile_ux_design;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        general_text = findViewById(R.id.general_text);
        product_design_text = findViewById(R.id.product_design_text);
        mobile_ux_design = findViewById(R.id.mobile_ux_design);

        bottom_navigation_1 = findViewById(R.id.bottom_navigation_1);
        bottom_navigation_1.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {


                    case R.id.option_jobs:
                        Toast.makeText(MainActivity.this, "Jobs selected ", Toast.LENGTH_SHORT).show();
                        break;







                        case R.id.option_proposals:
                        Toast.makeText(MainActivity.this, "Proposals selected ", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.option_messages:
                        Toast.makeText(MainActivity.this, "Messages selected ", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.option_notifications:
                        Toast.makeText(MainActivity.this, "Notifications selected ", Toast.LENGTH_SHORT).show();
                        break;



                    case R.id.option_profiles:
                        Toast.makeText(MainActivity.this, "Profiles selected ", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                }

                return true;
            }
        });


        general_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                product_design_text.setBackground(getResources().getDrawable(R.drawable.round_corner_buttons_2));
                product_design_text.setTextColor(getResources().getColor(R.color.black));

                mobile_ux_design.setBackground(getResources().getDrawable(R.drawable.round_corner_buttons_2));
                mobile_ux_design.setTextColor(getResources().getColor(R.color.black));

                general_text.setBackground(getResources().getDrawable(R.drawable.round_corner_buttons));
                general_text.setTextColor(getResources().getColor(R.color.white));
            }
        });

        product_design_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                product_design_text.setBackground(getResources().getDrawable(R.drawable.round_corner_buttons));
                product_design_text.setTextColor(getResources().getColor(R.color.white));

                mobile_ux_design.setBackground(getResources().getDrawable(R.drawable.round_corner_buttons_2));
                mobile_ux_design.setTextColor(getResources().getColor(R.color.black));

                general_text.setBackground(getResources().getDrawable(R.drawable.round_corner_buttons_2));
                general_text.setTextColor(getResources().getColor(R.color.black));
            }
        });



        mobile_ux_design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                product_design_text.setBackground(getResources().getDrawable(R.drawable.round_corner_buttons_2));
                product_design_text.setTextColor(getResources().getColor(R.color.black));

                mobile_ux_design.setBackground(getResources().getDrawable(R.drawable.round_corner_buttons));
                mobile_ux_design.setTextColor(getResources().getColor(R.color.white));

                general_text.setBackground(getResources().getDrawable(R.drawable.round_corner_buttons_2));
                general_text.setTextColor(getResources().getColor(R.color.black));




            }
        });

    }
}







