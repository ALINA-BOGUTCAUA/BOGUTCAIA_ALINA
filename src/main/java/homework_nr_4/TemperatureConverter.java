package homework_nr_4;

public class TemperatureConverter {
    float celsius;
    float fahrenheit;
    public static void main(String[] args) {

        TemperatureConverter temperature1 = new TemperatureConverter(32, 340) ;
        toFahrenheit(temperature1.celsius);
        toCelsius(temperature1.fahrenheit);

        TemperatureConverter temperature2 = new TemperatureConverter(171, 89);
        toFahrenheit(temperature2.celsius);
        toCelsius(temperature2.fahrenheit);
    }
    static  void  toCelsius(float fahrenheit){
        float celsius;
        celsius = ( fahrenheit - 32 ) * 5 / 9 ;
        System.out.println(fahrenheit + "  Fahrenheit to Celsius =" + celsius);
    }
    static void toFahrenheit(float celsius){
        float fahrenheit;
        fahrenheit = celsius * 9 / 5 + 32 ;
        System.out.println(celsius + "  Celsius to Fahrenheit = " + fahrenheit);
    }

    public TemperatureConverter(float celsius, float fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }
}

