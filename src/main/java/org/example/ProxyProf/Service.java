package org.example.ProxyProf;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;
import java.util.List;

public class Service {
    private OpenMensaAPI api;


    Service() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://openmensa.org/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // create OpenMensaApi instance
        api = retrofit.create(OpenMensaAPI.class);
    }

    public OpenMensaAPI getApi(){return api;}

    private  static Service inst=new Service();
    public static Service getInstance(){return inst;}
}
