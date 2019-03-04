package org.westada.slopecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcBtn = findViewById(R.id.calcBtn);

        calcBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText x1 = findViewById(R.id.X1);
                EditText x2 = findViewById(R.id.X2);
                EditText y1 = findViewById(R.id.Y1);
                EditText y2 = findViewById(R.id.Y2);
                TextView MFinal = findViewById(R.id.MFinal);
                TextView BFinal = findViewById(R.id.BFinal);
                double x1val = Double.parseDouble(x1.getText().toString());
                double x2val = Double.parseDouble(x2.getText().toString());
                double y1val = Double.parseDouble(y1.getText().toString());
                double y2val = Double.parseDouble(y2.getText().toString());

                double slope = (y2val-y1val)/(x2val-x1val);

                double b = y1val - (slope * x1val);

                MFinal.setText("M= "+slope+"");
                BFinal.setText("B= "+b+"");
            }
        });

    }
}
