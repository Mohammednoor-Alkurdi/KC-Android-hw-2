package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tit2 = findViewById(R.id.tit2) ;
        TextView nmv = findViewById(R.id.nmv) ;
        TextView agv = findViewById(R.id.agv) ;
        TextView phv = findViewById(R.id.phv) ;
        TextView jopv = findViewById(R.id.jopv) ;
        TextView emv = findViewById(R.id.emv) ;


        TextView nm2 =findViewById(R.id.nm2) ;
        TextView ag2 =findViewById(R.id.ag2) ;
        TextView ph2 =findViewById(R.id.ph2) ;
        TextView jop2 =findViewById(R.id.job2) ;
        TextView em2 =findViewById(R.id.em2) ;

        Bundle bundle = getIntent().getExtras() ;

        String name = bundle.getString("namee") ;
        nmv.setText(name);

        String jop = bundle.getString("jopp") ;
        jopv.setText(jop);

        String email = bundle.getString("emaill") ;
        emv.setText(email);

        int age = bundle.getInt("agee") ;
        agv.setText(String.valueOf(age));

        int phone = bundle.getInt("phonee") ;
        phv.setText(String.valueOf(phone));

        Button butt2 = findViewById(R.id.butt2) ;

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this , MainActivity.class) ;

                startActivity(intent);

            }
        });







    }

}