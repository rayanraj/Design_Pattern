package observer_pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.maven_designpattern_task.design_pattern_task.Client;


public class Subscriber {

	private static Logger Logger = LogManager.getLogger(Client.class);
	
	private String name;
	private Channel channel =new Channel();
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	public void update() {
		  Logger.warn("Hey " + name + " Video Uploaded : " + channel.title) ; 
	}
	public void subscribeChannel(Channel ch) {
		channel = ch; 
	}
	
	
}
