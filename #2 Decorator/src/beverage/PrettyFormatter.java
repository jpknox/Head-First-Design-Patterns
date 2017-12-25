package beverage;

import java.util.*;

/**
 * Created by joaok on 25/12/2017.
 */
public class PrettyFormatter {

	public static String format(AbstractBeverage b) {
		List<String> beverageDescription = b.getDescription();
		String beverage = beverageDescription.remove(0);

		Set<String> uniqueSet = new HashSet<String>(beverageDescription);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(b.getSize() + " ");
		stringBuilder.append(beverage);
		for (String uniqueCondiment : uniqueSet) {
			int quantity = Collections.frequency(beverageDescription, uniqueCondiment);
			if (quantity == 1) stringBuilder.append(", " + uniqueCondiment);
			if (quantity == 2) stringBuilder.append(", double " + uniqueCondiment);
			if (quantity == 3) stringBuilder.append(", triple " + uniqueCondiment);
		}
		beverageDescription.add(0, beverage);
		return stringBuilder.toString();
	}

}
