package br.ufv.daniel.medcap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

public class ListadeEspecialidadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listade_especialidades);
        ListView lv = findViewById(R.id.listViewEspec);
        AdapterEspecialidade a;
        lv.setAdapter(a);
    }
}
