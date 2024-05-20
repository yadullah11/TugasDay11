package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TopupActivity extends AppCompatActivity {

    ImageButton imbHome, imbStore,imbTopup,imbJoin,imbUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_topup);
        imbHome = findViewById(R.id.imbHome);
        imbStore = findViewById(R.id.imbStore);
        imbTopup = findViewById(R.id.imbTopup);
        imbJoin = findViewById(R.id.imbJoin);
        imbUser = findViewById(R.id.imbUser);
        klik();
    }
    void klik(){
        imbHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(TopupActivity.this, MainActivity.class);
                startActivity(intentHome);
            }
        });
        imbStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKategori = new Intent(TopupActivity.this, StoreActivity.class);
                startActivity(intentKategori);
            }
        });
        imbTopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTas = new Intent(TopupActivity.this, TopupActivity.class);
                startActivity(intentTas);
            }
        });
        imbJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWishlist = new Intent(TopupActivity.this, JoinActivity.class);
                startActivity(intentWishlist);
            }
        });
        imbUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWishlist = new Intent(TopupActivity.this, UserActivity.class);
                startActivity(intentWishlist);
            }
        });
    }
}