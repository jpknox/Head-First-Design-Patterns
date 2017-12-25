package condiment;

import beverage.AbstractBeverage;

import java.util.List;

/**
 * Created by joaok on 25/12/2017.
 */
public class ExtraShot extends AbstractCondimentDecorator {

	public ExtraShot(AbstractBeverage component) {
		super(component);
		component.getDescription().add("extra shot");
	}

	@Override
	public double getPrice() {
		return component.getPrice() + 0.30;
	}

	public List<String> getDescription() {
		return component.getDescription();
	}
}
