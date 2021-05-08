package com.packtpub.microservices.weather;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configuration of the Weather services REST API context path.
 *
 */
@ApplicationPath("/weather")
public class WeatherMicroService extends Application {
    //Intentionally kept blank
}
