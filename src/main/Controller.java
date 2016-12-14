package main;

import Service.WeatherService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import model.WeatherModel;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import utils.TempConversions;

import java.io.IOException;

public class Controller {
    private Retrofit retrofit;
    private final String APP_ID = "a8b7e0065d522fe805c65f640d711317";
    private WeatherService service;
    @FXML private Text actiontarget;
    @FXML private TextField city;
    @FXML private ToggleGroup degrees;
    @FXML private RadioButton celsius;
    @FXML private RadioButton kelvin;
    @FXML private RadioButton fahrenheit;

    public Controller () throws IOException {



        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(WeatherService.class);

    }

    public double getTempInKelvinFromCity(String city){
        Call<WeatherModel> call = service.weather(city,APP_ID);
        WeatherModel model = null;
        try {
            model = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model.getMain().getTemp();

    }

    public double getTempInCelsiusFromCity(String city){
        Call<WeatherModel> call = service.weather(city,APP_ID);
        WeatherModel model = null;
        try {
            model = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return TempConversions.kelvinToCel(model.getMain().getTemp());

    }

    public double getTempInFahrenheitFromCity (String city){
        Call<WeatherModel> call = service.weather(city,APP_ID);
        WeatherModel model = null;
        try {
            model = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return TempConversions.kelvinToFahrenheit(model.getMain().getTemp());
    }

    @FXML protected void handleSubmitButtonAction(ActionEvent event){
        String c = city.getText();
        String scale = "";
        String temp;
        if (celsius.isSelected()){
            temp = String.format("%.2f",getTempInCelsiusFromCity(c));
            scale = celsius.getText();

        } else if (kelvin.isSelected()){
            temp = String.format("%.2f",getTempInKelvinFromCity(c));
            scale = kelvin.getText();
        } else {
            temp = String.format("%.2f",getTempInFahrenheitFromCity(c));
            scale = fahrenheit.getText();
        }

        actiontarget.setText(c+" "+temp+" "+scale);

    }
}
