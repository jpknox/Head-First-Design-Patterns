import beverage.AbstractBeverage;
import beverage.Espresso;
import beverage.PrettyFormatter;
import condiment.Mocha;
import condiment.ExtraShot;
import stream.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created by joaok on 25/12/2017.
 */
public class Main {

	public static void main(String[] args) {
		int c;
		String text = "HELLO, I AM WRITTEN ENTIRELY OUT OF CAPITAL LETTERS.";
		byte[] bytes = text.getBytes();
		LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(
													new BufferedInputStream(
													new ByteArrayInputStream(bytes)));
		try {
			while ((c = lowerCaseInputStream.read()) != -1) {
				System.out.printf("%c", (char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("\n");


		AbstractBeverage beverage0 = new Espresso();
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());
		beverage0 = new Mocha(beverage0);
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());
		beverage0 = new Mocha(beverage0);
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());
		beverage0 = new ExtraShot(beverage0);
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());
		beverage0 = new ExtraShot(beverage0);
		System.out.printf("%s, %.2f\n", PrettyFormatter.format(beverage0.getDescription()), beverage0.getPrice());
	}

}
