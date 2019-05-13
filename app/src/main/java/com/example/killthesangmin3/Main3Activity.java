package com.example.killthesangmin3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    public static final int sub=101;    // 뒤로가기
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button1=(Button) findViewById(R.id.goback);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivityForResult(intent,sub);
            }

        });

    }
}
