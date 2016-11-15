package Utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Utils {
	public static Boolean Log(Exception e)
	{
		
		return false;
	}
	
	public static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date(0));
    } // getTime
	
}
