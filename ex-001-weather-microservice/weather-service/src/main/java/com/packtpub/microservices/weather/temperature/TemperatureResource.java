package com.packtpub.microservices.weather.temperature;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * A restful resource providing the city's temperature
 */
@Path("/temperature")
public class TemperatureResource {
    /**
     * Provides the average temperature from all of the city's sensors.
     * This is a fictitious implementation.
     * @return {@link Response} with constant temperature
     */
    @GET
    public Response getAverageTemperature(){
        return Response.ok("35 Degrees Centigrade").build();
    }
}