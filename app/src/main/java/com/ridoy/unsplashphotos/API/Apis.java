package com.ridoy.unsplashphotos.API;

import com.ridoy.unsplashphotos.Models.ImageModel;
import com.ridoy.unsplashphotos.Models.SearchModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

import static com.ridoy.unsplashphotos.API.Apiutilites.API_KEY;

public interface Apis {

    @Headers("Authorization: client-ID "+ API_KEY)
    @GET("photos")
    Call<List<ImageModel>> getImages(
            @Query("page") int page,
            @Query("per_page") int perPage
    );

    @Headers("Authorization: client-ID "+ API_KEY)
    @GET("search/photos")
    Call<SearchModel> searchImages(
            @Query("quary") String quary
    );
}
