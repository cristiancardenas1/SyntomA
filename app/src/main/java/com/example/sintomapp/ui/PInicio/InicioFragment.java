package com.example.sintomapp.ui.PInicio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;
import com.example.sintomapp.R;
import com.example.sintomapp.databinding.FragmentProfesorInicioBinding;

public class InicioFragment extends Fragment {

    private ListView listViewDatB;
    private final String datos[] = {"Nombre: Juan", "Apellido: Perez", "Programa: Quimica", "Profesion: Instructor De Ciencias", "Curso: Q14, Q09, Q10"};

    private FragmentProfesorInicioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InicioViewModel inicioViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(InicioViewModel.class);

        binding = FragmentProfesorInicioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.TxtTprofesor;
        inicioViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        listViewDatB = (ListView)getView().findViewById(R.id.lv_InfoP);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getApplicationContext(), R.layout.list_view_datos_profesor, datos);
        listViewDatB.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}




