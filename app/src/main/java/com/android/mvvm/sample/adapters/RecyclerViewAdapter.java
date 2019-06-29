package com.android.mvvm.sample.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.mvvm.sample.R;
import com.android.mvvm.sample.models.Places;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PlacesViewHolder> {

    private List<Places> mPlacesList;
    private Context context;

    public RecyclerViewAdapter(List<Places> mPlacesList, Context context) {
        this.mPlacesList = mPlacesList;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return this.mPlacesList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesViewHolder placesViewHolder, int i) {
        placesViewHolder.txtView.setText(mPlacesList.get(i).getmPlaceName());

        // Set the image
        RequestOptions defaultOptions = new RequestOptions()
                .error(R.drawable.ic_launcher_background);
        Glide.with(context)
                .setDefaultRequestOptions(defaultOptions)
                .load(mPlacesList.get(i).getmPlaceImgUrl())
                .into(placesViewHolder.imgView);
    }

    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.main_list_item,viewGroup,false);
        PlacesViewHolder placesViewHolder = new PlacesViewHolder(view);
        return placesViewHolder;
    }

    public class PlacesViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgView;
        private TextView  txtView;

        public PlacesViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.image);
            txtView = itemView.findViewById(R.id.image_name);
        }
    }
}
