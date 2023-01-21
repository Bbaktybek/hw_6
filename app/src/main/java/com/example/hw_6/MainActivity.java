package com.example.hw_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView vxod = findViewById(R.id.tv_dr);
        EditText parol = findViewById(R.id.bt_ch);
        EditText pochta = findViewById(R.id.et_ht);
        TextView register = findViewById(R.id.tv_gr);
        TextView zabyli = findViewById(R.id.tv_ds);
        TextView dabro = findViewById(R.id.tv_yt);
        TextView vypolnite = findViewById(R.id.tv_fr);
        Button voiti = findViewById(R.id.button_mt);

        pochta.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (pochta.getText().toString().isEmpty()){
                    voiti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.w));
                }else{
                    voiti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });
        parol.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {}

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if (parol.getText().toString().isEmpty()){
                    voiti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.w));
                }else{
                    voiti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }
        });














        voiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pochta.getText().toString().equals("admin") && parol.getText().toString().equals("admin")){
                    pochta.setVisibility(View.GONE);
                    vxod.setVisibility(View.GONE);
                    parol.setVisibility(View.GONE);
                    register.setVisibility(View.GONE);
                    zabyli.setVisibility(View.GONE);
                    vypolnite.setVisibility(View.GONE);
                    voiti.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистририволись в аккаунт. " , Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Неверно ввели пароль или логин. ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}