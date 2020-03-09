package state_pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.maven_designpattern_task.design_pattern_task.Client;

public class Silent implements MobileAlertState {

	private static Logger Logger = LogManager.getLogger(Client.class);
	public void alert(AlertStateContext ctx) {
		// TODO Auto-generated method stub
		Logger.info("Silent!!!!!");
	}

}
