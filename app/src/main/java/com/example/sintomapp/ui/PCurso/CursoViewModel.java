package com.example.sintomapp.ui.PCurso;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CursoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CursoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Cursos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}