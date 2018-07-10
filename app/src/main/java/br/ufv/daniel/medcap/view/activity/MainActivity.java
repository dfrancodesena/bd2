package br.ufv.daniel.medcap.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.ufv.daniel.medcap.R;
import br.ufv.daniel.medcap.view.activity.CadastrarTipoEspecialidadeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cadastroEspecialidade(View v){
        Intent it = new Intent(this,CadastrarTipoEspecialidadeActivity.class);
        this.startActivity(it);
    }
}