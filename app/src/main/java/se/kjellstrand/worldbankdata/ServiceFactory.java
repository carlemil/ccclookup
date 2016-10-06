package se.kjellstrand.worldbankdata;

import android.support.annotation.NonNull;

import retrofit2.Retrofit;


/**
 * Created by carl-emil on 9/19/16.
 */

public class ServiceFactory {
    /**
     * Creates a retrofit service from an arbitrary class (clazz)
     * @param clazz Java interface of the retrofit service
     * @param endPoint REST endpoint url
     * @return retrofit service with defined endpoint
     */
    public static <T> T createRetrofitService(@NonNull final Class<T> clazz, @NonNull final String endPoint) {
        final Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl(endPoint)
                .build();
        T service = restAdapter.create(clazz);

        return service;
    }
}
