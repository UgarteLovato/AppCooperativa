package app.tecsup.com.appcooperativa.DashboardActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import app.tecsup.com.appcooperativa.R;

public class ActivityDashboard extends AppCompatActivity {

    RelativeLayout rellay_coop, rellay_servicios, rellay_socios, rellay_estaditicas, rellay_tablas, rellay_mapa, rellay_productos,rellay_bazar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);



        rellay_coop = (RelativeLayout) findViewById(R.id.rellay_coop);
        rellay_servicios = (RelativeLayout) findViewById(R.id.rellay_servicios);
        rellay_socios = (RelativeLayout) findViewById(R.id.rellay_socios);
        rellay_estaditicas = (RelativeLayout) findViewById(R.id.rellay_estadisticas);
        rellay_tablas = (RelativeLayout) findViewById(R.id.rellay_tablas);
        rellay_mapa = (RelativeLayout) findViewById(R.id.rellay_mapa);
        rellay_productos = (RelativeLayout) findViewById(R.id.rellay_productos);
        rellay_bazar = (RelativeLayout) findViewById(R.id.rellay_bazar);

        rellay_coop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDashboard.this, Activity_coop.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });

        rellay_servicios.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDashboard.this, Activity_servicios.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });

        rellay_socios.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDashboard.this, Activity_socios.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });
        rellay_estaditicas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDashboard.this, Activity_estadisticas.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });
        rellay_tablas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDashboard.this, Activity_tablas.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });

        rellay_mapa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDashboard.this, Activity_mapa.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });
        rellay_productos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDashboard.this, Activity_productos.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });
        rellay_bazar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDashboard.this, Activity_bazar.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });


    }
}
