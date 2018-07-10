package br.ufv.daniel.medcap.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.ufv.daniel.medcap.R;
import br.ufv.daniel.medcap.view.fragment.EspecialidadeFragment;

public class ListadeMedicosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listade_medicos);

    }

    public void openFragment(){
        getSupportFragmentManager().beginTransaction().add(R.id.frameListaDeMedicos,new EspecialidadeFragment()).commit();
    }
}
