package com.example.sintomapp.ui.PEncuasta;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class EncuestaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EncuestaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}