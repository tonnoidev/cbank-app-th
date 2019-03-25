package th.co.cbank.project.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {

    public static Logger write = Logger.getLogger(Log.class);

    static {
        PropertyConfigurator.configure("log4j.properties");
    }
}
