/**
 * 
 */
package chain;

/**
 * @author fubaokui
 *
 */
public abstract class AbstractLogger {

	public static final int LEVEL_ERROR = 3;
	public static final int LEVEL_INFO 	= 2;
	public static final int LEVEL_DEBUG = 1;
	
	protected AbstractLogger nextLogger;

	protected int level;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level,String message){
		if(this.level <= level){
			write(message);
		}
		if(nextLogger != null){
			nextLogger.logMessage(level, message);
		}
	}
	
	abstract protected void write(String message);
}
