package beverage;

/**
 * Created by joaok on 25/12/2017.
 */
public class Espresso extends AbstractBeverage {

	private double standardPrice = 1.50;

	public Espresso() {
		super.description.add("Espresso");
	}

	@Override
	public double getPrice() {
		switch (getSize()) {
			case AbstractBeverage.VENTI : return standardPrice + 0.40;
			case AbstractBeverage.GRANDE : return standardPrice + 0.35;
			case AbstractBeverage.TALL : return standardPrice + 0.30;
			default : return standardPrice + 0.30;
		}
	}
}
