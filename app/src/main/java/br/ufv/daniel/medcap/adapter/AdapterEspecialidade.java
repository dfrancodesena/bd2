package br.ufv.daniel.medcap.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

import br.ufv.daniel.medcap.R;
import br.ufv.daniel.medcap.model.Especialidade;

public class AdapterEspecialidade extends BaseAdapter {
    private final List<Especialidade> especialidades;
    private final Activity act;
    public AdapterEspecialidade(List<Especialidade> especialidades, Activity act){
        this.especialidades = especialidades;
        this.act = act;
    }



    @Override
    public int getCount() {
        return especialidades.size();
    }

    @Override
    public Object getItem(int i) {
        return especialidades.get(i);
    }

    @Override
    public long getItemId(int i) {
        return especialidades.get(i).getId();
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View v = act.getLayoutInflater().inflate(R.layout.item_especialidade_layout, parent, false);
        Especialidade especialidade = especialidades.get(position);

        TextView nEspecialidade = v.findViewById(R.id.textViewNomeEspec);
        RadioButton rb = v.findViewById(R.id.radioButton);
        nEspecialidade.setText(especialidade.getNome());
        if(especialidade.getEPrincipal()){
            rb.setChecked(true);
        }
        return v;
    }
}
