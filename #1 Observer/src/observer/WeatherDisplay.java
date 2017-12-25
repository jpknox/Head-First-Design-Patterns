package observer;

/**
 * Created by joaok on 25/12/2017.
 */
public class WeatherDisplay implements Observer {

	private String name;

	public WeatherDisplay(String n) {
		name = n;
	}

	@Override
	public void update(int data) {
		System.out.printf("Weather Display %s has information %d\n", name, data);
	}

	@Override
	public String getName() {
		return name;
	}
}
