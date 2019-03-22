package org.westada.multipleactivities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculator = findViewById(R.id.CalculatorBtn);
        // Button secondActivity = (button)findViewById(R.id.SecondActivityBtn); (button) = typecast
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = getPackageManager().getLaunchIntentForPackage("org.westada.alexpfirstappaddition");
                //startIntent.setData();
                startActivity(startIntent);
            }
            });

        Button slopeCalc = findViewById(R.id.SlopeCalcBtn);
        slopeCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent slopeIntent = getPackageManager().getLaunchIntentForPackage("org.westada.slopecalculator");
                startActivity(slopeIntent);

            }
        });

        Button quadCalc = findViewById(R.id.quadCalc);
        quadCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent slopeIntent = getPackageManager().getLaunchIntentForPackage("org.westada.quadraticcalc");
                startActivity(slopeIntent);
            }
        });

        Button fruitList = findViewById(R.id.fruitList);
        fruitList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent slopeIntent = getPackageManager().getLaunchIntentForPackage("org.westada.listappo");
                startActivity(slopeIntent);
            }
        });

        Button creaList = findViewById(R.id.creaList);
        creaList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent slopeIntent = getPackageManager().getLaunchIntentForPackage("org.westada.listapp");
                startActivity(slopeIntent);
            }
        });


        Button portfolioBtn = (Button)findViewById(R.id.portfolioBtn);
            portfolioBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String portfolio="https://www.westada.tech/a4/alexp";
                Uri webaddress = Uri.parse(portfolio);

                Intent goTo = new Intent(Intent.ACTION_VIEW, webaddress);
                if(goTo.resolveActivity(getPackageManager()) != null){
                    startActivity(goTo);
                }
            }

        });
    }
}