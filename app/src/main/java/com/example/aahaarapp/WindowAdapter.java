package com.example.aahaarapp;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class WindowAdapter implements GoogleMap.InfoWindowAdapter {

    private final View mWindow;

    public WindowAdapter(Context context) {
        mWindow = LayoutInflater.from(context).inflate(R.layout.window, null);
    }

    private void renderWindowText(Marker marker, View view) {
        TextView title = view.findViewById(R.id.title);
        TextView snippet = view.findViewById(R.id.snippet);

        title.setText(marker.getTitle());
        snippet.setText(marker.getSnippet());
    }

    @Override
    public View getInfoWindow(@NonNull Marker marker) {
        renderWindowText(marker, mWindow);
        return mWindow;
    }

    @Override
    public View getInfoContents(@NonNull Marker marker) {
        renderWindowText(marker, mWindow);
        return mWindow;
    }
}
