package com.example.indivisualloanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.indivisualloanapp.databinding.ActivityLocationBinding;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class LocationActivity extends AppCompatActivity {
private ActivityLocationBinding binding;
private final static int REQUEST_CODE =100;
 FusedLocationProviderClient fusedLocationProviderclient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityLocationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fusedLocationProviderclient = LocationServices.getFusedLocationProviderClient(this);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getLastLocaton();
            }
        });
    }

    private void getLastLocaton() {
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)== PackageManager.PERMISSION_GRANTED){
            fusedLocationProviderclient.getLastLocation()
                    .addOnSuccessListener(new OnSuccessListener<Location>() {
                        @Override
                        public void onSuccess(Location location) {
                         if (location!=null){
                             Geocoder geocoder = new Geocoder(LocationActivity.this, Locale.getDefault());
                             List<Address> addresses = null;
                             try {
                                 addresses = geocoder.getFromLocation(location.getLatitude(),location.getLongitude(),1);
                                 binding.latitute.setText("Latitude :"+addresses.get(0).getLatitude());
                                 binding.logitute.setText("Logitute :"+addresses.get(0).getLongitude());
                                 binding.address.setText("Address :"+addresses.get(0).getAddressLine(0));
                                 binding.city.setText("City :"+addresses.get(0).getLocality());
                                 binding.country.setText("Country :"+addresses.get(0).getCountryName());

                             } catch (IOException e) {
                                 throw new RuntimeException(e);
                             }

                         }
                        }
                    });
        }else {
           askPermision();
        }

    }

    private void askPermision() {
        ActivityCompat.requestPermissions(LocationActivity.this,new String[]
                {Manifest.permission.ACCESS_FINE_LOCATION},REQUEST_CODE);
        }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode==REQUEST_CODE){
            if (grantResults.length>0 & grantResults[0] ==PackageManager.PERMISSION_GRANTED){
                getLastLocaton();
            }else {
                Toast.makeText(this, "Required Permission", Toast.LENGTH_SHORT).show();
            }
        }



        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}