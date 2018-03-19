package itesm.mx.pruebas_cliente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Boton1evento();
        Boton2evento();
        Boton3evento();
        Boton4evento();
        //BotonAnimales();
    }


    void Boton1evento(){
        Button boton1 = (Button)findViewById(R.id.b1);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup mainGroup = (ViewGroup)findViewById(R.id.layout_image);
                View viewObject = getLayoutInflater().inflate(R.layout.diccionario, null);
                mainGroup.removeAllViewsInLayout();
                mainGroup.addView(viewObject,0);

            }
        });



    }
    void Boton2evento(){
        Button boton1 = (Button)findViewById(R.id.b2);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup mainGroup = (ViewGroup)findViewById(R.id.layout_image);
                View viewObject = getLayoutInflater().inflate(R.layout.juego, null);
                mainGroup.removeAllViewsInLayout();
                mainGroup.addView(viewObject,0);

            }
        });



    }
    void Boton3evento(){
        Button boton1 = (Button)findViewById(R.id.b3);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup mainGroup = (ViewGroup)findViewById(R.id.layout_image);
                View viewObject = getLayoutInflater().inflate(R.layout.p2p, null);
                mainGroup.removeAllViewsInLayout();
                mainGroup.addView(viewObject,0);

            }
        });



    }
    void Boton4evento(){
        Button boton1 = (Button)findViewById(R.id.b4);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup mainGroup = (ViewGroup)findViewById(R.id.layout_image);
                View viewObject = getLayoutInflater().inflate(R.layout.perfil, null);
                mainGroup.removeAllViewsInLayout();
                mainGroup.addView(viewObject,0);

            }
        });



    }
    void BotonAnimales(){
        Button boton1 = (Button)findViewById(R.id.boton_animales);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup mainGroup = (ViewGroup)findViewById(R.id.layout_image);
                View viewObject = getLayoutInflater().inflate(R.layout.animales, null);
                mainGroup.removeAllViewsInLayout();
                mainGroup.addView(viewObject,0);

            }
        });

    }


}
