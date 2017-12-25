package beverage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joaok on 25/12/2017.
 * This class represents the abstract beverage held by the
 * abstract condiment decorator.
 */
public abstract class AbstractBeverage {

	public static final String TALL = "Tall";
	public static final String GRANDE = "Grande";
	public static final String VENTI = "Venti";

	public String size = TALL;

	protected List<String> description = new ArrayList<String>();

	public AbstractBeverage() {
	}

	public List<String> getDescription() {
		return description;
	}

	public abstract double getPrice();

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		String lowercase = size.toLowerCase();
		if (lowercase.equals(TALL.toLowerCase())) {
			this.size = TALL;
		} else if (lowercase.equals(GRANDE.toLowerCase())) {
			this.size = GRANDE;
		} else if (lowercase.equals(VENTI.toLowerCase())) {
			this.size = VENTI;
		} else {
			this.size = TALL;
		}
	}
}
