package java.Examples;

import org.apache.logging.log4j.*;

//import jdk.internal.org.jline.utils.Log;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message = "Hi Good Morning";
    	LOG.debug(message+" Debug");
    	LOG.warn(message+" warn");
    	LOG.info(message+" info");
    	LOG.error( message+" Error");
    	LOG.fatal( message+" fatal");
    	LOG.info("Appending string: {}.",message);
    	System.out.println(message);
    	System.out.println("Hello Ganesh");
    }
}
