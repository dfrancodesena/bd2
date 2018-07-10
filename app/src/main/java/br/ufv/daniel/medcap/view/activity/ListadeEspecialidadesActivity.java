package br.ufv.daniel.medcap.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import br.ufv.daniel.medcap.adapter.AdapterEspecialidade;
import br.ufv.daniel.medcap.R;

public class ListadeEspecialidadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listade_especialidades);
        ListView lv = findViewById(R.id.listViewEspec);
        AdapterEspecialidade a;
       // lv.setAdapter(a);
    }
}
