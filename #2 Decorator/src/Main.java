import beverage.AbstractBeverage;
import beverage.Espresso;
import beverage.PrettyFormatter;
import condiment.Mocha;
import condiment.ExtraShot;

/**
 * Created by joaok on 25/12/2017.
 */
public class Main {

	public static void main(String[] args) {
		AbstractBeverage beverage0 = new Espresso();
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());
		beverage0 = new Mocha(beverage0);
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());
		beverage0 = new Mocha(beverage0);
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());
		beverage0 = new ExtraShot(beverage0);
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());
		beverage0 = new ExtraShot(beverage0);
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());

	}

}
