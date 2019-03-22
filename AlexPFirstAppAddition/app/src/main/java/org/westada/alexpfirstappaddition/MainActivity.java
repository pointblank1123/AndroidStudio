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
        Button PowBtn = (Button) findViewById(R.id.PowBtn);
        Button SQRTBtn = (Button) findViewById(R.id.SQRTBtn);



        addBtn.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){

               double[] nums = getNums();
               double result = nums[0] + nums[1];

               setResult(result);

           }
        });
        subBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double[] nums = getNums();
                double result = nums[0]-nums[1];

                setResult(result);
            }
        });
        multBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double[] nums = getNums();
                double result = nums[0]*nums[1];

                setResult(result);
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double[] nums = getNums();
                double result = nums[0]/nums[1];

                setResult(result);
            }
        });
        PowBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double[] nums = getNums();
                double result = Math.pow(nums[0],nums[1]);

                setResult(result);
            }
        });
        SQRTBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double[] nums = getNums();
                double result = Math.pow(nums[0],1/nums[1]);

                setResult(result);
            }
        });
    }
    private double[] getNums(){
        EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
        double num1 = Double.parseDouble(firstNumEditText.getText().toString());
        double num2 = Double.parseDouble(secondNumEditText.getText().toString());
        double[] nums ={num1,num2};
        return nums;
    }
    private void setResult(double result){
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        resultTextView.setText(result+"");
    }

}
