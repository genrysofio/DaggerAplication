package com.genrysofionet.daggeraplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.genrysofionet.daggeraplication.dagger.TipoAplication;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    TextView uno,dos;
    @Named("mamifero")@Inject
    Tipo tipo;

    @Inject
    Animal animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uno=findViewById(R.id.text);
        dos=findViewById(R.id.text2);

        ((TipoAplication)getApplication()).getTipoComponent() .inject(this);
        uno.setText("Leon "+ tipo.getTipoAnimal());

        dos.setText("serpiente "+animal.getTipo());

    }
}
