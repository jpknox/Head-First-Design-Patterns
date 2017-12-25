package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joaok on 25/12/2017.
 */
public abstract class Observable {

	protected List<Observer> observers = new ArrayList<Observer>();

	protected int data;

	public void register(Observer o) {
		observers.add(o);
	}

	public void deregister(Observer o) {
		observers.remove(o);
	}

	public void deregister(String name) {
		for (Observer o : observers) {
			if (o.getName().equals(name)) observers.remove(o);
		}
	}

	public void notifyChange() {
		for (Observer o : observers) {
			o.update(data);
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int d) {
		this.data = d;
		notifyChange();
	}
}
