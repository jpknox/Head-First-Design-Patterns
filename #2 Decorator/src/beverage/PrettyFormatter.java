package beverage;

import java.util.*;

/**
 * Created by joaok on 25/12/2017.
 */
public class PrettyFormatter {

	public static String format(List<String> description) {

		String beverage = description.remove(0);

		Set<String> uniqueSet = new HashSet<String>(description);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(beverage);
		for (String uniqueCondiment : uniqueSet) {
			int quantity = Collections.frequency(description, uniqueCondiment);
			if (quantity == 1) stringBuilder.append(", " + uniqueCondiment);
			if (quantity == 2) stringBuilder.append(", double " + uniqueCondiment);
			if (quantity == 3) stringBuilder.append(", triple " + uniqueCondiment);
		}
		description.add(0, beverage);
		return stringBuilder.toString();
	}

}
