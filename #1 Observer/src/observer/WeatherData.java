package observer;

/**
 * Created by joaok on 25/12/2017.
 */
public class WeatherData extends Observable {

	private boolean changed = false;

	protected int data = 0;

	@Override
	public void notifyChange() {
		if (!changed) return;
		for (Observer o : observers) {
			o.update(data);
		}
		setChanged(false);
	}

	@Override
	public void setData(int d) {
		if ((d - data) / 3 > 0 ) setChanged(true);
		this.data = d;
		notifyChange();
	}

	private void setChanged(boolean b) {
		changed = b;
	}
}
