package br.ufv.daniel.medcap.view.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.ufv.daniel.medcap.R;
import br.ufv.daniel.medcap.view.fragment.EnderecoFragment;
import br.ufv.daniel.medcap.view.fragment.EspecialidadeFragment;
import br.ufv.daniel.medcap.view.fragment.MetodoPagamentoFragment;
import br.ufv.daniel.medcap.view.fragment.PessoaFragment;
import br.ufv.daniel.medcap.view.fragment.UsuarioFragment;

public class CadastroClienteActivity extends AppCompatActivity implements EnderecoFragment.OnFragmentInteractionListener,PessoaFragment.OnFragmentInteractionListener, UsuarioFragment.OnFragmentInteractionListener, MetodoPagamentoFragment.OnFragmentInteractionListener{

    private Button botaoAnterior;
    private Button botaoProximo;
    private Spinner spinner;
    private List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        fragmentList.add(PessoaFragment.newInstance());
        fragmentList.add(new UsuarioFragment());
        fragmentList.add(new EnderecoFragment());
        fragmentList.add(new MetodoPagamentoFragment());
        fragmentList.add(new MetodoPagamentoFragment());

        botaoAnterior = findViewById(R.id.botao_anterior);
        botaoProximo = findViewById(R.id.botao_proximo);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Setup spinner
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(new MyAdapter(
                toolbar.getContext(),
                new String[]{
                        "Dados Pessoais",
                        "Dados de Login",
                        "Endereço",
                        "Dependentes",
                        "Métodos de Pagamento"
                }));

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // When the given dropdown item is selected, show its contents in the
                // container view.
                switch (position){
                    case 0:
                        botaoAnterior.setText(R.string.cancelar_button);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, fragmentList.get(position))
                                .commit();
                        break;
                    case 1:
                        botaoAnterior.setText(R.string.anterior_button);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, fragmentList.get(position))
                                .commit();
                        break;
                    case 2:
                        botaoProximo.setText(R.string.proximo_button);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, fragmentList.get(position))
                                .commit();
                        break;
                    case 3:
                        botaoProximo.setText(R.string.concluir_button);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, fragmentList.get(position))
                                .commit();
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }


    public void onAnteriorClick(View view){
        int pos = spinner.getSelectedItemPosition();
        if(pos>0){
            spinner.setSelection(pos-1);
        }else{
            new AlertDialog.Builder(this).setMessage(R.string.mensagem_cancelar_cadastro).setPositiveButton(R.string.sim_button, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            }).setNegativeButton(R.string.nao_button, null).show();
        }

    }

    public void onProximoClick(View view){
        int pos = spinner.getSelectedItemPosition();
        if(pos< fragmentList.size()-1){
            spinner.setSelection(pos+1);
        }
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    private static class MyAdapter extends ArrayAdapter<String> implements ThemedSpinnerAdapter {
        private final Helper mDropDownHelper;

        public MyAdapter(Context context, String[] objects) {
            super(context, android.R.layout.simple_list_item_1, objects);
            mDropDownHelper = new Helper(context);
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            View view;

            if (convertView == null) {
                // Inflate the drop down using the helper's LayoutInflater
                LayoutInflater inflater = mDropDownHelper.getDropDownViewInflater();
                view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            } else {
                view = convertView;
            }

            TextView textView = (TextView) view.findViewById(android.R.id.text1);
            textView.setText(getItem(position));

            return view;
        }

        @Override
        public Theme getDropDownViewTheme() {
            return mDropDownHelper.getDropDownViewTheme();
        }

        @Override
        public void setDropDownViewTheme(Theme theme) {
            mDropDownHelper.setDropDownViewTheme(theme);
        }
    }


}
