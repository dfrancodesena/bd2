package br.ufv.daniel.medcap;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
