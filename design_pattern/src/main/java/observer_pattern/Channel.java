package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	private List<Subscriber> subs = new ArrayList<Subscriber>();
	String title;
	
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySubscriber() {
		for(Subscriber sub : subs) {
			sub.update();
		}
	}
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}
}
