package com.example.gothamcity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Calculate extends AppCompatActivity {
    private EditText input;
    private Button Cal,Add;
    private TextView Num,Text;

    int number;
    int count=0;
    List<Integer> list_of_bus_stops=new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);
        input=findViewById(R.id.input);
        Cal=findViewById(R.id.cal);
        Add=findViewById(R.id.add);
        Num=findViewById(R.id.num);
        Text=findViewById(R.id.text);
        Intent i1=getIntent();
        number=Integer.parseInt(i1.getStringExtra("Input"));
        Add.setVisibility(View.VISIBLE);
        Num.setVisibility(View.VISIBLE);
        Text.setVisibility(View.VISIBLE);
        input.setVisibility(View.VISIBLE);
        Num.setText("1");

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=input.getText().toString().trim();

                if(n.length()==0)
                {
                    input.setError("Incomplete Field");
                    return;
                }
                int value=Integer.parseInt(n);
                if(value>100 || value<-100)
                {
                    input.setError("Profit Range 100 to -100");
                    input.setText("");
                    return;
                }
              /*  if(count>=number)
                {
                    Toast.makeText(getApplicationContext(),"Profit of All bus stop has been Added",Toast.LENGTH_LONG).show();
                    return;
                }*/
                else
                {
                    count=count+1;
                    list_of_bus_stops.add(value);
                    if(count==number)
                    {
                        Toast.makeText(getApplicationContext(),"Profit of All bus stop has been Added",Toast.LENGTH_LONG).show();
                        Add.setVisibility(View.GONE);
                        Num.setVisibility(View.GONE);
                        Text.setText("All the Bus Stop Profits Added\n Click on Calculate to find Max Profit");
                        input.setVisibility(View.GONE);
                        return;
                    }
                    else {
                        int x=count+1;
                        Num.setText(String.valueOf(x));
                        input.setText("");
                    }
                }

            }
        });

        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculateProfit();
            }
        });
    }

    private void CalculateProfit() {
        if(count<number)
        {
            Toast.makeText(getApplicationContext(),"Please Enter Profit of All the BusStop",Toast.LENGTH_LONG).show();
            return;
        }
        else
        {
            int bus_stop_prize=Integer.MIN_VALUE;
            int current_bus_stop_prize=0;
            int board_bus_stop=0;
            int deboard_bus_stop=0;
            int bus_stop_board=0;
            int index=0;
            for (int i=0;i<number;i++)
            {
                current_bus_stop_prize+=(Integer)list_of_bus_stops.get(index);
                if(bus_stop_prize<=current_bus_stop_prize)
                {
                    if(!(bus_stop_board==index && bus_stop_board!=0))
                    {
                        bus_stop_prize=current_bus_stop_prize;
                        board_bus_stop=bus_stop_board;
                        deboard_bus_stop=index;
                    }
                }
                if(current_bus_stop_prize<0)
                {
                    current_bus_stop_prize=0;
                    bus_stop_board=index+1;
                    board_bus_stop=index+1;
                }
                index++;
            }
            Intent i2=new Intent(Calculate.this,Answer.class);
            i2.putExtra("Profit",String.valueOf(bus_stop_prize));
            i2.putExtra("Board",String.valueOf(board_bus_stop+1));
            i2.putExtra("Deboard",String.valueOf(deboard_bus_stop+1));
            startActivity(i2);
           // Toast.makeText(getApplicationContext(),"Max Profit:"+bus_stop_prize,Toast.LENGTH_SHORT).show();
            //Toast.makeText(getApplicationContext(),"Bus Stop to be Boarded:"+String.valueOf(board_bus_stop+1),Toast.LENGTH_SHORT).show();
            //Toast.makeText(getApplicationContext(),"Bus Stop to be Deboarded:"+String.valueOf(deboard_bus_stop+1),Toast.LENGTH_SHORT).show();

            //   System.out.println("Total Prize Winnings: "+bus_stop_prize);
           // System.out.println("Bus Stop Number to be Boarded: " +(board_bus_stop+1));
            //System.out.println("Bus Stop Number to be Deboarded: " +(deboard_bus_stop+1));
        }
    }
}
/*
*
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.print("Please Enter Number of Bus Stops in Gotham City: ");
        n=sc.nextInt();
        List<Integer> list_of_bus_stops=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            System.out.print("Please Enter the Prize Received at Bus Stop "+(i+1)+": ");
            list_of_bus_stops.add(sc.nextInt());
        }
        System.out.println("----------------------------------------------------------------");
        Bus_Stop_Prize(list_of_bus_stops,n);
        System.out.println("----------------------------------------------------------------");

    }
    static void Bus_Stop_Prize(List list_of_bus_stops,int n)
    {
        int bus_stop_prize=Integer.MIN_VALUE;
        int current_bus_stop_prize=0;
        int board_bus_stop=0;
        int deboard_bus_stop=0;
        int bus_stop_board=0;
        int index=0;
        for (int i=0;i<n;i++)
        {
            current_bus_stop_prize+=(Integer)list_of_bus_stops.get(index);
            if(bus_stop_prize<current_bus_stop_prize)
            {
                if(!(bus_stop_board==index && bus_stop_board!=0))
                {
                    bus_stop_prize=current_bus_stop_prize;
                    board_bus_stop=bus_stop_board;
                    deboard_bus_stop=index;
                }
            }
            if(current_bus_stop_prize<0)
            {
                current_bus_stop_prize=0;
                bus_stop_board=index+1;
                board_bus_stop=index+1;
            }
            index++;
        }
        System.out.println("Total Prize Winnings: "+bus_stop_prize);
        System.out.println("Bus Stop Number to be Boarded: " +(board_bus_stop+1));
        System.out.println("Bus Stop Number to be Deboarded: " +(deboard_bus_stop+1)); */