package com.android.mvvm.sample.repositories;

import android.arch.lifecycle.MutableLiveData;

import com.android.mvvm.sample.models.Places;

import java.util.ArrayList;
import java.util.List;

public class PlacesRepository {

    private static PlacesRepository placeRepoInstance;
    private List<Places> placesDataSet = new ArrayList<>();

    private PlacesRepository() { }

    public static PlacesRepository getPlaceRepoInstance(){
        if (placeRepoInstance == null)
            placeRepoInstance = new PlacesRepository();

        return placeRepoInstance;
    }

    //pretend data coming from webservice
    public MutableLiveData<List<Places>> getPlaces(){
        addPlaces();

        MutableLiveData<List<Places>> places = new MutableLiveData<>();
        places.setValue(placesDataSet);
        return places;
    }

    private void addPlaces(){

        placesDataSet.add(
                new Places("Rocky Mountain National Park","https://i.redd.it/j6myfqglup501.jpg")
        );

        placesDataSet.add(
                new Places(
                        "Havasu Falls","https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg")
        );
        placesDataSet.add(
                new Places("Trondheim","https://i.redd.it/tpsnoz5bzo501.jpg")
        );
        placesDataSet.add(
                new Places("Portugal","https://i.redd.it/qn7f9oqu7o501.jpg")
        );
        placesDataSet.add(
                new Places("Havasu Falls","https://i.redd.it/0h2gm1ix6p501.jpg")
        );
        placesDataSet.add(
                new Places("Mahahual","https://i.redd.it/k98uzl68eh501.jpg")
        );
        placesDataSet.add(
                new Places("Frozen Lake","https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg")
        );
        placesDataSet.add(
                new Places("Austrailia","https://i.redd.it/obx4zydshg601.jpg")
        );
    }
}
