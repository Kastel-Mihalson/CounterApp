package com.demo.app;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View bouncingBox;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bouncingBox = findViewById(R.id.bouncing_box);
        Button changeColorButton = findViewById(R.id.change_color_button);

        // Start bounce animation
        Animation bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        bouncingBox.startAnimation(bounceAnimation);

        // Set up color change button
        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeBoxColor();
            }
        });
    }

    private void changeBoxColor() {
        // Generate random RGB color
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        int color = android.graphics.Color.rgb(red, green, blue);

        bouncingBox.setBackgroundColor(color);
    }
}
