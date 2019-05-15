package com.example.killthesangmin3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    public static final int sub1=100;
    public static final int sub2=101;
    public static final int sub3=102;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.sangminexplain);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(getApplicationContext(),Main3Activity.class);
                startActivityForResult(intent,sub1);
            }
        });

        Button button2 = (Button)findViewById(R.id.sangmin2explain);
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),Main4Activity.class);
                startActivityForResult(intent,sub2);
            }

        });

        Button button3= (Button)findViewById(R.id.killsangminexplain);
        button3.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),Main5Activity.class);
                startActivityForResult(intent,sub3);
            }
        });


    }
}
