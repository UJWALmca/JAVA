package com.exam.lab01;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    // widgets declaration
    ImageButton imgBtn;
    Switch btnStateSwitch;
    ConstraintLayout innerClayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_layout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // typecast widgets
        imgBtn = (ImageButton) findViewById(R.id.img_btn);
        btnStateSwitch = (Switch) findViewById(R.id.btn_state_switch);
        innerClayout = (ConstraintLayout) findViewById(R.id.inner_clayout);

        btnStateSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton cBtn, boolean isChecked){
                if(isChecked){
                    imgBtn.setEnabled(true);
                    btnStateSwitch.setText("Enabled");
                }
                else{
                    imgBtn.setEnabled(false);
                    btnStateSwitch.setText("Disabled");
                }

                /* set the onClick behaviour of the ImageButton */
                imgBtn.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Snackbar.make(v, "Button Clicked", Snackbar.LENGTH_LONG).show();
                    }
                });

                // create a new view for calendar view
                CalendarView calendarView = new CalendarView(getApplicationContext());

                // create an objects of Layout parameters
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        ConstraintLayout.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                );

                innerClayout.addView(calendarView, layoutParams);
            }
        });

    }
}