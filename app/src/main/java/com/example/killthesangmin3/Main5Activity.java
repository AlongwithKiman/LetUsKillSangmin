package com.example.killthesangmin3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main5Activity extends AppCompatActivity {
    private final static int sub=100;
    private ListView listview=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final TextView hp=  findViewById(R.id.HP_int);
        final TextView title = findViewById(R.id.title_5);
        Button button1= (Button) findViewById(R.id.goback_5);
        button1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view)
            {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivityForResult(intent,sub);
            }

        });
        Button button2= (Button) findViewById(R.id.attackbutton);
        button2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view)
            {


                int hp_temp=Integer.parseInt((String) hp.getText());
                if(hp_temp>0) hp_temp-=300;

                hp.setText(Integer.toString(hp_temp));
                if(Integer.parseInt((String)hp.getText())<=0)
                {
                    title.setText("김상민을 죽였다!");
                }
            }

        });


        /*
        ArrayList<listviewformat5> attacklist= new ArrayList<>();
        attacklist.add(new listviewformat5("aaa"));
        attacklist.add(new listviewformat5("bbb"));
        listview=(ListView)findViewById(R.id.attacklistview);
        Adapter5 adapter=new Adapter5(attacklist);
        listview.setAdapter(adapter);
        */
    }
}
