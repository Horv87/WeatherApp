package Service;

import model.WeatherModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by martin on 14.12.16.
 */
public interface WeatherService {

    @GET("weather")
    Call<WeatherModel> weather(@Query("q") String city,@Query("APPID") String id);
}
