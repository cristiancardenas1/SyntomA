package com.example.sintomapp.ui.PInicio;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class InicioViewModel extends ViewModel {


    private final MutableLiveData<String> mText;

    public InicioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Profesor");
    }


    public LiveData<String> getText() {
        return mText;
    }
}