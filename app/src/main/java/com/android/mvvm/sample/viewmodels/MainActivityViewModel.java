package com.android.mvvm.sample.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.android.mvvm.sample.models.Places;
import com.android.mvvm.sample.repositories.PlacesRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<Places>> mPlacesList;
    private PlacesRepository mRepo;

    public LiveData<List<Places>> getPlacesList(){
        return mPlacesList;
    }

    public void init(){
        if (mPlacesList!= null) return;

        mRepo = PlacesRepository.getPlaceRepoInstance();
        mPlacesList = mRepo.getPlaces();

    }

    public void addNewPlaces(final Places newPlace){
        List<Places> listOfPlaces = mPlacesList.getValue();
        listOfPlaces.add(newPlace);
        mPlacesList.postValue(listOfPlaces);
    }


}
