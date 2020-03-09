package composite_pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.maven_designpattern_task.design_pattern_task.Client;


public class Leaf implements Component{

	private static Logger Logger = LogManager.getLogger(Client.class);
	int price;
	String name;
	public void showPrice() {
		
		Logger.info(name + ":" + price);
	}
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

}
