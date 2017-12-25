package stream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by joaok on 25/12/2017.
 */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();
		if (c == -1) return c;
		if (65 <= c && c <= 90) c += 32;
		return c;
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i < off+result; i++) {
			if (31 <= b[i] && b[i] <= 90) b[i] += 32;
		}
		return result;
	}
}
