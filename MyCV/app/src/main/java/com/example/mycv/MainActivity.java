package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


      private EditText nm1 ;
    private EditText ag1 ;
    private EditText ph1 ;
    private EditText jop1 ;
    private EditText em1 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





                TextView tit = findViewById(R.id.tit) ;

                EditText nm1 =findViewById(R.id.nm1) ;
                EditText ag1 =findViewById(R.id.ag1) ;
                EditText ph1 =findViewById(R.id.ph1) ;
                EditText jop1 =findViewById(R.id.job1) ;
                EditText em1 =findViewById(R.id.em1) ;

                Button butt1 = findViewById(R.id.butt1) ;








        butt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        String name = nm1.getText().toString() ;
                        String jop = jop1.getText().toString() ;
                        int age = Integer.parseInt(ag1.getText().toString()) ;
                        int phone = Integer.parseInt(ph1.getText().toString()) ;
                        String email = em1.getText().toString() ;


                        Intent intent = new Intent(MainActivity.this , MainActivity2.class) ;

                intent.putExtra("namee" , name ) ;
                intent.putExtra("agee" , age ) ;
                intent.putExtra("emaill" , email ) ;
                intent.putExtra("phonee" , phone ) ;
                intent.putExtra("jopp" , jop ) ;




                startActivity(intent);

                Bundle bundle = getIntent().getExtras() ;


                    }

                });


            };
        }
