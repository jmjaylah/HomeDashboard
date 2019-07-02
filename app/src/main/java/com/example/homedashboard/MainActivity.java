package com.example.homedashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private CardView bankcard,ideascard,addcard, kinkcard,wificard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bankcard = findViewById(R.id.bank_acc);
        ideascard = findViewById(R.id.idea_card);
        addcard = findViewById(R.id.add_card);
        kinkcard = findViewById(R.id.link_card);
        wificard = findViewById(R.id.wifi_card);

        bankcard.setOnClickListener(this);
        ideascard.setOnClickListener(this);
        addcard.setOnClickListener(this);
        kinkcard.setOnClickListener(this);
        wificard.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.bank_acc: i = new Intent(this,bank.class); startActivity(i); break;

            case R.id.idea_card: i = new Intent(this,idea.class); startActivity(i); break;
            case R.id.add_card: i = new Intent(this,add.class); startActivity(i); break;
            case R.id.link_card: i = new Intent(this,link.class); startActivity(i); break;
            case R.id.wifi_card: i = new Intent(this,wifi.class); startActivity(i); break;
            default:break;
        }

    }
}
