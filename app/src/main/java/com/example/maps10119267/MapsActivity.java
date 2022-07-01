package com.example.maps10119267;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    LatLng Lokasi_Pengguna = new LatLng(-6.500584672312044, 106.65102413491503);
    LatLng tempat1 = new LatLng(-6.453631144707426, 106.64693503329924);
    LatLng tempat2 = new LatLng(-6.503814598662776, 106.65512329378372);
    LatLng tempat3 = new LatLng(-6.513268661171122, 106.65158026999593);
    LatLng tempat4 = new LatLng(-6.504839333239781, 106.65477445550981);
    LatLng tempat5 = new LatLng(-6.510931622770998, 106.65063790983147);

    ArrayList<LatLng> daftarLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);

        daftarLokasi = new ArrayList<>();
        daftarLokasi.add(Lokasi_Pengguna);
        daftarLokasi.add(tempat1);
        daftarLokasi.add(tempat2);
        daftarLokasi.add(tempat3);
        daftarLokasi.add(tempat4);
        daftarLokasi.add(tempat5);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        for (int i = 0; i < daftarLokasi.size(); i++) {
            googleMap.addMarker(new MarkerOptions().position(daftarLokasi.get(i)).title("Lokasi"));
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(10));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(daftarLokasi.get(i)));
        }
    }
}

/***
 * NIM      :10119267
 * Nama     :Neti Febriyani
 * Kelas    :IF7
 */