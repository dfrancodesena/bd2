package br.ufv.daniel.medcap.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.ufv.daniel.medcap.R;

public class EscolhaCadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_cadastro);
    }

    public void onMedicoClick(View view){
        Intent it = new Intent(this, CadastroMedicoActivity.class);
        startActivity(it);
        finish();
    }

    public void onClienteClick(View view){
        Intent it = new Intent(this, CadastroClienteActivity.class);
        startActivity(it);
        finish();
    }

}
