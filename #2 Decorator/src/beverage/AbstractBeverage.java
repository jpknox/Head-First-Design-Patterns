package beverage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joaok on 25/12/2017.
 * This class represents the abstract beverage held by the
 * abstract condiment decorator.
 */
public abstract class AbstractBeverage {

	protected List<String> description = new ArrayList<String>();

	public AbstractBeverage() {
	}

	public List<String> getDescription() {
		return description;
	}

	public abstract double getPrice();
}
