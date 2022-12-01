public class Temp {

    public final static String[] temp_units = {"C", "K", "F"};
    private String base_temp;
    private float base_value, target_value;

    public Temp(String base_temp, float base_value) {
        this.base_temp = base_temp;
        this.base_value = base_value;
        this.target_value = 0;
    }

    // Getters
    public String getBase_temp() {
        return base_temp;
    }

    public float getBase_value() {
        return base_value;
    }

    public float getTarget_value() {
        return target_value;
    }

    // Setters
    public void setBase_temp(String base_temp) {
        this.base_temp = base_temp;
    }

    public void setBase_value(int base_value) {
        this.base_value = base_value;
    }

    public void setTarget_value(int target_value) {
        this.target_value = target_value;
    }

    public static float convertToCelsius(Temp temp) {
        float target_value = 0f;
        switch (temp.getBase_temp()) {
            case "C" -> target_value = temp.getBase_value();
            case "K" -> target_value = temp.getBase_value()-273.15f;
            case "F" -> target_value = ((temp.getBase_value()-32f)*5f)/9f;
            default -> System.out.print("Error, temperature unit has not been recognized!\n");
        }
        return target_value;
    }

    public static float convertToKelvin(Temp temp) {
        float target_value = 0f;
        switch (temp.getBase_temp()) {
            case "C" -> target_value = temp.getBase_value()+273.15f;
            case "K" -> target_value = temp.getBase_value();
            case "F" -> target_value = ((temp.getBase_value()-32f)/1.8f)+273.15f;
            default -> System.out.print("Error, temperature unit has not been recognized!\n");
        }
        return target_value;
    }

    public static float convertToFahrenheit(Temp temp) {
        float target_value = 0f;
        switch (temp.getBase_temp()) {
            case "C" -> target_value = ((9f/5f)* temp.getBase_value())+32f;
            case "K" -> target_value = 1.8f*(temp.getBase_value()-273.15f)+32f;
            case "F" -> target_value = temp.getBase_value();
            default -> System.out.print("Error, temperature unit has not been recognized!\n");
        }
        return target_value;
    }
}
