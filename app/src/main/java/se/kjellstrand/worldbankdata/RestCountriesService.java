package se.kjellstrand.worldbankdata;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by carl-emil on 9/19/16.
 */

public interface RestCountriesService {
    String SERVICE_ENDPOINT = "https://restcountries.eu/";

    @GET("rest/v1/callingcode/{ccc}")
    Observable<List<CountryData>> getRestCountriesCallingCode(@Path("ccc") String ccc);
}

