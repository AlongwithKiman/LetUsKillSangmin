package com.example.killthesangmin3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Main4Activity extends AppCompatActivity {
    private static final int sub=100;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        mListView= (ListView)findViewById(R.id.footprintlist);

        dataSetting();

        Button button1= (Button) findViewById(R.id.goback_4);
        button1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivityForResult(intent,sub);
            }

        });

    }

    private void dataSetting() {

        Adapter1 adapter1= new Adapter1();

        adapter1.addItem("aa","bb","cc");
        adapter1.addItem("aa","bb","cc");
        adapter1.addItem("aa","bb","cc");

        mListView.setAdapter(adapter1);
    }
}
