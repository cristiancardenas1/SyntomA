package com.example.sintomapp.ui.PCurso;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sintomapp.R;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private final CursoFragment Fragment_context;
    private int layout;
    private ArrayList<String> names;

    public Adaptador(CursoFragment context1, int layout1, ArrayList<String> names1){
        Fragment_context=context1;
        this.layout=layout1;
        this.names=names1;
    }


    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int i) {
        return this.names.get(i);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater layoutInflater=LayoutInflater.from(Fragment_context.getContext());
        v=layoutInflater.inflate(R.layout.lis_view_datos_cursosp, null);
        String currentName = names.get(i);

        TextView textView =(TextView) v.findViewById(R.id.txtPEstudiante);
        textView.setText(currentName);
        return v;
    }
}
