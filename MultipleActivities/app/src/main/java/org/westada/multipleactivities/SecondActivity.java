package org.westada.multipleactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("org.westada.multipleactivities.SOMETHING")){
            TextView tv = findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("org.westada.multipleactivities.SOMETHING");
            tv.setText(text);
        }
    }
}
