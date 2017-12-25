package beverage;

/**
 * Created by joaok on 25/12/2017.
 */
public class Espresso extends AbstractBeverage {

	public Espresso() {
		super.description.add("Espresso");
	}

	@Override
	public double getPrice() {
		return 1.50;
	}
}
