package condiment;

import beverage.AbstractBeverage;

import java.util.List;

/**
 * Created by joaok on 25/12/2017.
 */
public abstract class AbstractCondimentDecorator extends AbstractBeverage {

	protected AbstractBeverage component;

	public AbstractCondimentDecorator(AbstractBeverage component) {
		this.component = component;
	}



}
