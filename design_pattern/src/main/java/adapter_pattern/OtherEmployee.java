package adapter_pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.maven_designpattern_task.design_pattern_task.Client;

public class OtherEmployee {
	private static Logger Logger = LogManager.getLogger(Client.class);
	public void doEmployee(String str) {
		Logger.info(str);
	}
}
