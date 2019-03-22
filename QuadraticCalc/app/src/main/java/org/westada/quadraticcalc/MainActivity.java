package org.westada.quadraticcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.westada.quadraticcalc.R;

public class MainActivity extends AppCompatActivity {
    double aValue;
    double bValue;
    double cValue;
    double aTop;
    double aBottom;
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
                EditText x3 = findViewById(R.id.X3);
                EditText y1 = findViewById(R.id.Y1);
                EditText y2 = findViewById(R.id.Y2);
                EditText y3 = findViewById(R.id.Y3);
                TextView aVal = findViewById(R.id.aVal);
                TextView bVal = findViewById(R.id.bVal);
                TextView cVal = findViewById(R.id.cVal);
                double x1val = Double.parseDouble(x1.getText().toString());
                double x2val = Double.parseDouble(x2.getText().toString());
                double x3val = Double.parseDouble(x3.getText().toString());
                double y1val = Double.parseDouble(y1.getText().toString());
                double y2val = Double.parseDouble(y2.getText().toString());
                double y3val = Double.parseDouble(y3.getText().toString());

                aValue = calcA(x1val,x2val,x3val,y1val,y2val,y3val);
                bValue = calcB(x1val,x2val,y1val,y2val, aValue);
                cValue = calcC(x1val,y1val,aValue,bValue);

                aVal.setText(aValue+"");
                bVal.setText(bValue+"");
                cVal.setText(cValue+"");
            }
        });
    }
    private double calcA (double x1, double x2, double x3, double y1, double y2, double y3){
        aTop = x1*(y3-y2) + x2*(y1-y3) + x3*(y2-y1);
        aBottom = (x1-x2)*(x1-x3)*(x2-x3);

        aValue = aTop/aBottom;

        return aValue;
    }
    private double calcB (double x1, double x2, double y1, double y2, double a){
        bValue = ((y2-y1)/(x2-x1))-a*(x1+x2);
        return bValue;
    }
    private double calcC(double x1, double y1, double a, double b){
        cValue = y1 -a*Math.pow(x1,2) - b*x1;
        return cValue;
    }
}
