public class Temp {

    public final static String[] temp_units = {"C", "K", "F"};

    public static float convertToCelsius(String base_unit, String target_unit, float base_value) {
        float target_value = 0f;
        switch (base_unit) {
            case "C" -> target_value = base_value;
            case "K" -> target_value =base_value-273.15f;
            case "F" -> target_value = ((base_value-32f)*5f)/9f;
            default -> System.out.print("Error, temperature unit has not been recognized!\n");
        }
        return target_value;
    }

    public static float convertToKelvin(String base_unit, String target_unit, float base_value) {
        float target_value = 0f;
        switch (base_unit) {
            case "C" -> target_value = base_value+273.15f;
            case "K" -> target_value = base_value;
            case "F" -> target_value = ((base_value-32f)/1.8f)+273.15f;
            default -> System.out.print("Error, temperature unit has not been recognized!\n");
        }
        return target_value;
    }

    public static float convertToFahrenheit(String base_unit, String target_unit, float base_value) {
        float target_value = 0f;
        switch (base_unit) {
            case "C" -> target_value = ((9f/5f)*base_value)+32f;
            case "K" -> target_value = 1.8f*(base_value-273.15f)+32f;
            case "F" -> target_value = base_value;
            default -> System.out.print("Error, temperature unit has not been recognized!\n");
        }
        return target_value;
    }
}
