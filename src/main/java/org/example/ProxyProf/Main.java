package org.example.ProxyProf;

import retrofit2.Call;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Call<List<Meal>> req=Service.getInstance()
                .getApi()
                .getMeals("2023-05-12");

        List<Meal> ms=req.execute().body();
        System.out.println(ms);


    }
}
