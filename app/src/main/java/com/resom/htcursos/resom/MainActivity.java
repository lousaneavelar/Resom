package com.resom.htcursos.resom;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

    @Bind(R.id.titulo)
    TextView titulo;
    @Bind(R.)
    Button

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    @OnClick()
    public void click(){
        titulo.setText("Ola Mundo!");
    }
}
