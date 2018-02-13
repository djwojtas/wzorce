package external.lights;

import external.lights.states.LightState;

public class Light {
    private LightState lightState;

    private String LightName;

    public String getLightName() {
        return LightName;
    }

    public void setLightName(String lightName) {
        LightName = lightName;
    }

    public LightState getLightState() {
        return lightState;
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }
}
