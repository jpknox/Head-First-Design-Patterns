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
		switch (getSize()) {
			case AbstractBeverage.VENTI : return component.getPrice() + 0.40;
			case AbstractBeverage.GRANDE : return component.getPrice() + 0.35;
			case AbstractBeverage.TALL : return component.getPrice() + 0.30;
			default : return component.getPrice() + 0.30;
		}
	}

	@Override
	public String getSize() {
		return component.getSize();
	}

	public List<String> getDescription() {
		return component.getDescription();
	}
}
