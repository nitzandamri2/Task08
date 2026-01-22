package com.example.task08;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView2;
    ImageButton btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView2 = findViewById(R.id.imageView2);
        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = (int) (Math.random() * 3) + 1;

                if (num == 1) {
                    imageView2.setImageResource(R.drawable.img_3);
                    btnClick.setImageResource(R.drawable.img);
                }
                else if (num == 2) {
                    imageView2.setImageResource(R.drawable.img_4);
                    btnClick.setImageResource(R.drawable.img_2);
                }
                else {
                    imageView2.setImageResource(R.drawable.img_5);
                    btnClick.setImageResource(R.drawable.img_1);
                }
            }
        });
    }
}