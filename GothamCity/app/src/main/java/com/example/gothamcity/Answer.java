package com.example.gothamcity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class Answer extends AppCompatActivity {
    String Profit,Board,Deboard;
    private Button Main;
    private TextView t1,t2,t3;
    private Animation topAnim,bottomAdnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer);

        Main=findViewById(R.id.main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);

        Intent i1=getIntent();
        Profit=i1.getStringExtra("Profit");
        Board=i1.getStringExtra("Board");
        Deboard =i1.getStringExtra("Deboard");

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAdnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        topAnim.setStartOffset(1500);
        bottomAdnim.setStartOffset(3000);
        t1.setAnimation(topAnim);
        t2.setAnimation(topAnim);
        t3.setAnimation(topAnim);
        Main.setAnimation(bottomAdnim);



        t1.setText("Total Prize Winnings: "+Profit);
        t2.setText("Bus Stop Number to be Boarded: " +Board);
        t3.setText("Bus Stop Number to be Deboarded: " +Deboard);


        Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Answer.this,Input.class);
                startActivity(i1);
                finish();
            }
        });

    }
}
