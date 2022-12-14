package com.example.sintomapp.ui.PEncuasta;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.sintomapp.databinding.FragmentProfesorEncuestaBinding;

public class EncuestaFragment extends Fragment {

    private FragmentProfesorEncuestaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EncuestaViewModel encuestaViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(EncuestaViewModel.class);

        binding = FragmentProfesorEncuestaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        encuestaViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}