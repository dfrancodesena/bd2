package br.ufv.daniel.medcap.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.ufv.daniel.medcap.model.Medico;
import br.ufv.daniel.medcap.R;

public class AdapterMedico extends BaseAdapter {
    private final List<Medico> medicos;
    private final Activity act;
    public AdapterMedico(List<Medico> medicos, Activity act){
        this.medicos = medicos;
        this.act = act;

    }

    @Override
    public int getCount() {
        return medicos.size();
    }

    @Override
    public Object getItem(int i) {
        return medicos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return medicos.get(i).getId();
    }
    public View getView(int position, View converView, ViewGroup parent) {
        View v = act.getLayoutInflater().inflate(R.layout.item_medico_layout, parent, false);
        Medico medico = medicos.get(position);

        TextView nome = v.findViewById(R.id.textViewNomeMedico);
        TextView nomeEspec = v.findViewById(R.id.textViewEspecialidade);
        nome.setText(medico.getNome());
        nomeEspec.setText(medico.getEspecialidade().getNome());
        return v;
    }

}
