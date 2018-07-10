package br.ufv.daniel.medcap.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import br.ufv.daniel.medcap.R;
import br.ufv.daniel.medcap.util.SessionManager;

public class LoginActivity extends AppCompatActivity {

    private EditText loginEdit;
    private EditText senhaEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginEdit = findViewById(R.id.userEditTextLogin);
        senhaEdit = findViewById(R.id.senhaEditTextLogin);
    }

    public void onLoginClick(View view){
        SessionManager sessionManager = new SessionManager(this);
        sessionManager.createLoginSession("Teste", loginEdit.getText().toString());
        if(sessionManager.checkLogin()){
            Intent it = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(it);
            finish();
        }
    }

    public void onCriarClick(View view){
        Intent it = new Intent(this,EscolhaCadastroActivity.class);
        startActivity(it);
    }
}
