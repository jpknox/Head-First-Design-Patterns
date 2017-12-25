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
		switch (getSize()) {
			case AbstractBeverage.VENTI : return component.getPrice() + 0.40;
			case AbstractBeverage.GRANDE : return component.getPrice() + 0.35;
			case AbstractBeverage.TALL : return component.getPrice() + 0.30;
			default : return component.getPrice() + 0.30;
		}
	}

	public List<String> getDescription() {
		return component.getDescription();
	}

	@Override
	public String getSize() {
		return component.getSize();
	}
}
