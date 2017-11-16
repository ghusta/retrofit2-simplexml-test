package fr.husta.test.api;

import fr.husta.test.xml.BreakfastMenu;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiService
{

    @GET("xml/simple.xml")
    @Headers({"Accept: application/xml",
            "User-Agent: Retrofit-Sample-App"})
    Call<BreakfastMenu> getBreakfastMenu();

}
