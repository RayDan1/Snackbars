package com.example.snackbars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button mSnackbarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSnackbarBtn = findViewById(R.id.snack_btn);

        mSnackbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v, "Snackbar 3", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAction("OK", new View.OnClickListener() {
                    public void onClick(View v) {
                        //
                    }
                });
                snackbar.show();
            }
        });
    }
}