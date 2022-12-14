package com.example.sintomapp.ui.PCurso;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.sintomapp.R;
import com.example.sintomapp.databinding.FragmentProfesorCursoBinding;

import java.util.ArrayList;

public class CursoFragment extends Fragment {


    private ListView  lvCn1, lvCn2, lvCn3;
    private ArrayList<String> Curso1;
    private ArrayList<String> Curso2;
    private ArrayList<String> Curso3;
    private FragmentProfesorCursoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CursoViewModel cursoViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(CursoViewModel.class);

        binding = FragmentProfesorCursoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.TxtTPCurso;
        cursoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        lvCn1 = (ListView)getView().findViewById(R.id.lv_Curso1);
        lvCn2 = (ListView)getView().findViewById(R.id.lv_Curso2);
        lvCn3 = (ListView)getView().findViewById(R.id.lv_Curso3);
        Curso1= new ArrayList<String>();
        Curso1.add("Narciso Espino");
        Curso1.add("Olivia Vidal");
        Curso1.add("Feliciano Segovia");
        Curso1.add("Zaira Belmonte");
        Curso1.add("Armando Blanco");

        Curso2= new ArrayList<String>();
        Curso2.add("Davinia Bello");
        Curso2.add("Hamid Menendez");
        Curso2.add("Faustina Alba");
        Curso2.add("Zaida Cabanillas");
        Curso2.add("Paulino Infante");

        Curso3= new ArrayList<String>();
        Curso3.add("Regina Salas");
        Curso3.add("Lia Fidalgo");
        Curso3.add("Erika Quesada");
        Curso3.add("Gemma Vilar");
        Curso3.add("Hugo Llanos");



        Adaptador adp = new Adaptador(this, R.layout.lis_view_datos_cursosp, Curso1);
        lvCn1.setAdapter((ListAdapter) adp);
        Adaptador adp2 = new Adaptador(this, R.layout.lis_view_datos_cursosp, Curso2);
        lvCn2.setAdapter((ListAdapter) adp2);
        Adaptador ad3 = new Adaptador(this, R.layout.lis_view_datos_cursosp, Curso3);
        lvCn3.setAdapter((ListAdapter) ad3);



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}