package org.westada.alexpfirstappaddition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button subBtn = (Button) findViewById(R.id.subBtn);
        Button multBtn = (Button) findViewById(R.id.multBtn);
        Button divBtn = (Button) findViewById(R.id.divBtn);
        addBtn.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
               EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
               TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

               double num1 = Double.parseDouble(firstNumEditText.getText().toString());
               double num2 = Double.parseDouble(secondNumEditText.getText().toString());
               double result = num1+num2;

               resultTextView.setText(result+"");
           }
        });
        subBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNumEditText.getText().toString());
                double result = num1-num2;

                resultTextView.setText(result+"");
            }
        });
        multBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNumEditText.getText().toString());
                double result = num1*num2;

                resultTextView.setText(result+"");
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNumEditText.getText().toString());
                double result = num1/num2;

                resultTextView.setText(result+"");
            }
        });
    }
}
