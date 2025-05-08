/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.grillo.entities;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import mx.itson.grillo.enums.WeatherStatus;

/**
 *
 * @author alumnog
 */
public class Forecast {
    
    private Date day;
    private WeatherStatus status;
    @SerializedName("max_temperature")
    private int maxTemperature;
    @SerializedName("min_temperature")
    private int minTemperature;
    
    
    
    
}
