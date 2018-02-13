package application.api.controller;

import application.fx.LightStatus;

import static spark.Spark.*;

public class LightsController {
    public LightsController() {
        get("/lights", (request, response) ->
                LightStatus.getLightStatus().stream()
                .map(light -> light.getLightName() + " " + light.getLightState().tts())
                .reduce("", (x, y) -> x + ", " + y)
                .replaceFirst(", ", ""));
    }
}
