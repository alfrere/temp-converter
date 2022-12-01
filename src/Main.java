public class Main {

    public static void main(String[] args) {
        Temp temp = new Temp("C", 20);
        System.out.println("Converting 20°C :\n"+
                "K -> "+Temp.convertToKelvin(temp)+"\n"+
                "C -> "+Temp.convertToCelsius(temp)+"\n"+
                "F -> "+Temp.convertToFahrenheit(temp));
    }

}
