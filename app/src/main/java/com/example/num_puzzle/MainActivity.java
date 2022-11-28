package com.example.num_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b[] = new Button[9];
    TextView t1;
    ArrayList arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i=0 ; i<b.length ; i++)
        {
            int id = getResources().getIdentifier("b"+i,"id",getPackageName());
            b[i] = findViewById(id);
            b[i].setOnClickListener(this);
            b[i].setTextColor(getResources().getColor(android.R.color.white));
        }
        t1=findViewById(R.id.t1);

        int min=0;
        int mex=9;
        int random;
        for (int i=0 ; i<9 ; i++)
        {
            while (true)
            {
                random = new Random().nextInt(mex-min)+min;
                System.out.println("random"+random);
                if(!arrayList.contains(random))
                {
                    arrayList.add(random);
                    b[i].setText(""+arrayList.get(i));
                    break;
                }
            }
        }
        for(int i=0 ; i<b.length ; i++)
        {
            b[i].setText(arrayList.get(i).toString());
            if (arrayList.get(i).toString().equals("0"))
            {
                b[i].setTextColor(getResources().getColor(android.R.color.transparent));
            }
        }
    }

    void win()
    {
        if(b[0].getText().toString().equals("1") && b[1].getText().toString().equals("2") && b[2].getText().toString().equals("3") && b[3].getText().toString().equals("4") && b[4].getText().toString().equals("5") && b[5].getText().toString().equals("6") && b[6].getText().toString().equals("7") && b[7].getText().toString().equals("8") && b[8].getText().toString().equals("0"))
        {
            t1.setText("win");
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.b0)
        {
            if(b[1].getText().toString().equals("0"))
            {
                b[1].setText(b[0].getText().toString());
                b[0].setText("0");
                b[0].setTextColor(getResources().getColor(android.R.color.transparent));
                b[1].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[3].getText().toString().equals("0"))
            {
                b[3].setText(b[0].getText().toString());
                b[0].setText("0");
                b[0].setTextColor(getResources().getColor(android.R.color.transparent));
                b[3].setTextColor(getResources().getColor(R.color.white));
            }
            win();
        }
        if (v.getId()==R.id.b1)
        {
            if(b[0].getText().toString().equals("0"))
            {
                b[0].setText(b[1].getText().toString());
                b[1].setText("0");
                b[1].setTextColor(getResources().getColor(android.R.color.transparent));
                b[0].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[2].getText().toString().equals("0"))
            {
                b[2].setText(b[1].getText().toString());
                b[1].setText("0");
                b[1].setTextColor(getResources().getColor(android.R.color.transparent));
                b[2].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[4].getText().toString().equals("0"))
            {
                b[4].setText(b[1].getText().toString());
                b[1].setText("0");
                b[1].setTextColor(getResources().getColor(android.R.color.transparent));
                b[4].setTextColor(getResources().getColor(R.color.white));
            }
            win();
        }

        if (v.getId()==R.id.b2)
        {
            if(b[1].getText().toString().equals("0"))
            {
                b[1].setText(b[2].getText().toString());
                b[2].setText("0");
                b[2].setTextColor(getResources().getColor(android.R.color.transparent));
                b[1].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[5].getText().toString().equals("0"))
            {
                b[5].setText(b[2].getText().toString());
                b[2].setText("0");
                b[2].setTextColor(getResources().getColor(android.R.color.transparent));
                b[5].setTextColor(getResources().getColor(R.color.white));
            }
            win();
        }

        if (v.getId()==R.id.b3)
        {
            if(b[0].getText().toString().equals("0"))
            {
                b[0].setText(b[3].getText().toString());
                b[3].setText("0");
                b[3].setTextColor(getResources().getColor(android.R.color.transparent));
                b[0].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[4].getText().toString().equals("0"))
            {
                b[4].setText(b[3].getText().toString());
                b[3].setText("0");
                b[3].setTextColor(getResources().getColor(android.R.color.transparent));
                b[4].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[6].getText().toString().equals("0"))
            {
                b[6].setText(b[3].getText().toString());
                b[3].setText("0");
                b[3].setTextColor(getResources().getColor(android.R.color.transparent));
                b[6].setTextColor(getResources().getColor(R.color.white));
            }
            win();
        }

        if (v.getId()==R.id.b4)
        {
            if(b[1].getText().toString().equals("0"))
            {
                b[1].setText(b[4].getText().toString());
                b[4].setText("0");
                b[4].setTextColor(getResources().getColor(android.R.color.transparent));
                b[1].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[3].getText().toString().equals("0"))
            {
                b[3].setText(b[4].getText().toString());
                b[4].setText("0");
                b[4].setTextColor(getResources().getColor(android.R.color.transparent));
                b[3].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[5].getText().toString().equals("0"))
            {
                b[5].setText(b[4].getText().toString());
                b[4].setText("0");
                b[4].setTextColor(getResources().getColor(android.R.color.transparent));
                b[5].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[7].getText().toString().equals("0"))
            {
                b[7].setText(b[4].getText().toString());
                b[4].setText("0");
                b[4].setTextColor(getResources().getColor(android.R.color.transparent));
                b[7].setTextColor(getResources().getColor(R.color.white));
            }
            win();
        }

        if (v.getId()==R.id.b5)
        {
            if(b[2].getText().toString().equals("0"))
            {
                b[2].setText(b[5].getText().toString());
                b[5].setText("0");
                b[5].setTextColor(getResources().getColor(android.R.color.transparent));
                b[2].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[4].getText().toString().equals("0"))
            {
                b[4].setText(b[5].getText().toString());
                b[5].setText("0");
                b[5].setTextColor(getResources().getColor(android.R.color.transparent));
                b[4].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[8].getText().toString().equals("0"))
            {
                b[8].setText(b[5].getText().toString());
                b[5].setText("0");
                b[5].setTextColor(getResources().getColor(android.R.color.transparent));
                b[8].setTextColor(getResources().getColor(R.color.white));
            }
            win();
        }

        if (v.getId()==R.id.b6)
        {
            if(b[3].getText().toString().equals("0"))
            {
                b[3].setText(b[6].getText().toString());
                b[6].setText("0");
                b[6].setTextColor(getResources().getColor(android.R.color.transparent));
                b[3].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[7].getText().toString().equals("0"))
            {
                b[7].setText(b[6].getText().toString());
                b[6].setText("0");
                b[6].setTextColor(getResources().getColor(android.R.color.transparent));
                b[7].setTextColor(getResources().getColor(R.color.white));
            }
            win();
        }

        if (v.getId()==R.id.b7)
        {
            if(b[4].getText().toString().equals("0"))
            {
                b[4].setText(b[7].getText().toString());
                b[7].setText("0");
                b[7].setTextColor(getResources().getColor(android.R.color.transparent));
                b[4].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[6].getText().toString().equals("0"))
            {
                b[6].setText(b[7].getText().toString());
                b[7].setText("0");
                b[7].setTextColor(getResources().getColor(android.R.color.transparent));
                b[6].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[8].getText().toString().equals("0"))
            {
                b[8].setText(b[7].getText().toString());
                b[7].setText("0");
                b[7].setTextColor(getResources().getColor(android.R.color.transparent));
                b[8].setTextColor(getResources().getColor(R.color.white));
            }
            win();
        }
        if (v.getId()==R.id.b8)
        {
            if(b[5].getText().toString().equals("0"))
            {
                b[5].setText(b[8].getText().toString());
                b[8].setText("0");
                b[8].setTextColor(getResources().getColor(android.R.color.transparent));
                b[5].setTextColor(getResources().getColor(R.color.white));
            }
            if(b[7].getText().toString().equals("0"))
            {
                b[7].setText(b[8].getText().toString());
                b[8].setText("0");
                b[8].setTextColor(getResources().getColor(android.R.color.transparent));
                b[7].setTextColor(getResources().getColor(R.color.white));
            }
            win();
        }
    }
}