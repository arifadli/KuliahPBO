package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void tambahsensor(){
    	render();
    }
    
    public static void letaksensor(){
    	render();
    }
    
    public static void monitor(){
    	render();
    }
    
    public static void hasilsensor(SensorType sensorBaru){
    	sensorBaru.jumlah = sensorBaru.jumlah;
    	sensorBaru.input = sensorBaru.input;
    	sensorBaru.output = sensorBaru.output;
    	sensorBaru.price = sensorBaru.price; 
    	sensorBaru.type = sensorBaru.type;
    	render(sensorBaru);
    }
    
    public static void informasiposisi(SensorPosition sensor){
    	sensor.latitude = sensor.latitude;
    	sensor.longitude = sensor.longitude;
    	sensor.distfromserver = sensor.distfromserver;
    	render(sensor);
    }

}