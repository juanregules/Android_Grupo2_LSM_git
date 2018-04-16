package itesm.mx.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, PantallaUsuario.IMyUserScreen{

    Button btnA, btnB, btnC;

    @Override
    public void onStart(){
        super.onStart();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA = findViewById(R.id.a);
        btnB = findViewById(R.id.b);
        btnC = findViewById(R.id.c);
        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.c:
                cargarUsuario();
                break;
            case R.id.b:
                cargarDummy();
                break;
        }
    }
    private void cargarUsuario(){
        if(getFragmentManager().findFragmentById(R.id.pantalla) != null){
            getFragmentManager().beginTransaction().replace(R.id.pantalla, new PantallaUsuario()).commit();
        }
        else{
            getFragmentManager().beginTransaction().add(R.id.pantalla, new PantallaUsuario()).commit();
        }

    }
    private void cargarDummy(){
        if(getFragmentManager().findFragmentById(R.id.pantalla) != null){
            getFragmentManager().beginTransaction().replace(R.id.pantalla, new PantallaDummy()).commit();
        }
        else{
            getFragmentManager().beginTransaction().add(R.id.pantalla, new PantallaDummy()).commit();
        }
    }
    @Override
    public void endMyLife(){

    }


}
