package condiment;

import beverage.AbstractBeverage;

import java.util.List;


/**
 * Created by joaok on 25/12/2017.
 */
public class Mocha extends AbstractCondimentDecorator {

	public Mocha(AbstractBeverage component) {
		super(component);
		component.getDescription().add("mocha");
	}

	@Override
	public double getPrice() {
		return component.getPrice() + 0.60;
	}

	public List<String> getDescription() {
		return component.getDescription();
	}
}
