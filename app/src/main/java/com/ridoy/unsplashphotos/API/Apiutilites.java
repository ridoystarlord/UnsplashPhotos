package com.ridoy.unsplashphotos.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiutilites {

    public static final String BASE_URL="https://api.unsplash.com/";
    public static final String API_KEY="pfsDpaClwGJuRkLIC-4vRuZO_9jd8Bfn2QRFQYhizGU";

    public static Retrofit retrofit=null;
    public static Apis getinterface(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(Apis.class);
    }
}
