package stream;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by joaok on 25/12/2017.
 */
public class LowerCaseInputStreamTest {

	@Test
	public void testAllPrintableAsciiCharacters() {
		String printableAsciiCharacters = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
		String lowercase = " !\"#$%&'()*+,-./0123456789:;<=>?@abcdefghijklmnopqrstuvwxyz[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
		LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(
													new BufferedInputStream(
													new ByteArrayInputStream(
														printableAsciiCharacters.getBytes())));
		StringBuilder convertedAscii = new StringBuilder();
		int c;
		try {
			while ((c = lowerCaseInputStream.read()) != -1) {
				convertedAscii.append((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertEquals(lowercase, convertedAscii.toString());
	}

}
