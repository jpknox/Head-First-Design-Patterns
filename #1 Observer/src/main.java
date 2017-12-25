import observer.Observable;
import observer.WeatherData;
import observer.WeatherDisplay;

/**
 * Created by joaok on 25/12/2017.
 */
public class main {

	public static void main(String[] args) {
		Observable weatherData = new WeatherData();
		weatherData.setData(1);

		WeatherDisplay weatherDisplay0 = new WeatherDisplay("Delta");
		weatherData.register(weatherDisplay0);

		System.out.printf("Changing the weather data to 2\n");
		weatherData.setData(2);
		System.out.printf("\n");

		WeatherDisplay weatherDisplay1 = new WeatherDisplay("Gamma");
		weatherData.register(weatherDisplay1);
		System.out.printf("Changing the weather data to 5\n");
		weatherData.setData(5);
		System.out.printf("\n");

		System.out.printf("Changing the weather data to 6\n");
		weatherData.setData(6);

		System.out.printf("Changing the weather data to 7\n");
		weatherData.setData(7);

		System.out.printf("Changing the weather data to 10\n");
		weatherData.setData(10);

		System.out.printf("Changing the weather data to 20\n");
		weatherData.setData(20);
	}

}
