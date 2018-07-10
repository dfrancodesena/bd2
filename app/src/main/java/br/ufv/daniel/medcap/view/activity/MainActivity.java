package br.ufv.daniel.medcap.view.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.ufv.daniel.medcap.R;
import br.ufv.daniel.medcap.util.SessionManager;
import br.ufv.daniel.medcap.view.activity.CadastrarTipoEspecialidadeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                SessionManager sessionManager = new SessionManager(getApplicationContext());
                if(sessionManager.checkLogin()){
                    Intent it = new Intent(getApplicationContext(),MainActivity.class);
                    it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(it);
                }
                finish();
            }
        },1000);
    }
}
