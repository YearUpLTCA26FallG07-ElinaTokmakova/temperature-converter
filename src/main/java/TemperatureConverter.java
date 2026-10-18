import java.util.Scanner;

public class TemperatureConverter {

    public static void main (String[] args) {
        double celsius = 23.7;
        double fahrenheit = 98.6;
        double kelvin = 300.15;

        System.out.println("=== Temperature Converter ===" +
                "\n\nStarting Temperature: 23.7°C" +
                "\n\nConversion Results:" +

                //celcius to fahrenheit
                "\n" + celsius + "°C" + " = " + Math.round(convertCtoF(celsius)) + "°F " + "(rounded)" +
                "\n" + celsius + "°C" + " = " + Math.round(convertCtoF(celsius) * 10.0) / 10.0 + "°F " + "(one decimal)" +
                "\n" + celsius + "°C" + " = " + Math.round(convertCtoF(celsius) * 100.0) / 100.0 + "°F " + "(two decimals)" +

                //celcius to kelvin
                "\n\n" + celsius + "°C" + " = " + Math.round(convertCtoK(celsius)) + "°K " + "(rounded)" +
                "\n" + celsius + "°C" + " = " + Math.round(convertCtoK(celsius) * 10.0) / 10.0 + "°K " + "(one decimal)" +
                "\n" + celsius + "°C" + " = " + Math.round(convertCtoK(celsius) * 100.0) / 100.0 + "°K " + "(two decimals)" +

                //reverse conversions
                "\n\n=== Reverse Conversions ===" +
                "\n" + fahrenheit + "°F" + " = " + Math.round(convertFtoC(fahrenheit)) + "°C" + " (rounded)" +
                "\n" + kelvin + "°K" + " = " + Math.round(convertKtoC(kelvin)) + "°C" + " (rounded)");

        Scanner myScanner = new Scanner(System.in);

        System.out.print("\nEnter a temperature in Celcius: ");
        celsius = myScanner.nextDouble();

        System.out.println(Math.round(celsius * 100.0) / 100.0 + " = " + Math.round(convertCtoF(celsius)) + "°F" +
                "\n" + Math.round(celsius * 100.0) / 100.0 + " = " + Math.round(convertCtoK(celsius)) + "°K");

    }
    public static double convertCtoF (double celsius) {
        return celsius * 9.0 / 5 + 32;
    }

    public static double convertFtoC (double fahrenheit) {
        return (fahrenheit - 32)  * 5.0 / 9;
    }

    public static double convertCtoK (double celsius) {
        return celsius + 273.15;
    }

    public static double convertKtoC (double kelvin) {
        return kelvin - 273.15;
    }
}
