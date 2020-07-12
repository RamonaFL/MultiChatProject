/**
 * 
 */
package edu.bbq.u18.chat.client;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

import edu.bbq.u18.chat.common.helpers.ConsolePrint;
import edu.bbq.u18.chat.common.helpers.Debug;
import edu.bbq.u18.chat.common.knowledge.DataTypes;
import edu.bbq.u18.chat.common.lib.PropertiesHandler;
import edu.bbq.u18.chat.common.logging.LOGGER;

/**
 * @author debian
 */
public class Start 
{
	/**********************************************************************************/
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/* Für lange Zeit Kommentar! */
		
		
		SETTINGS.load();
		Configurations.load();
		Arguments.load();
		
		ConsolePrint.showln(new StringBuilder("Bin gestartet! Version: ").append(SETTINGS.APP_VERSION).append("\n*********************************************************************"));
		//handleArguments(args);
		PropertiesHandler.showProperties(System.getProperties(), PropertiesHandler.SHOW_WHILE_WIDTH_ITERATOR_STYLE);
		
		//SystemInfos.showProperties();
		
	

	}
	/**********************************************************************************/
	
}