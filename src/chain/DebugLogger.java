/**
 * 
 */
package chain;

/**
 * @author fubaokui
 *
 */
public class DebugLogger extends AbstractLogger {
	
	public DebugLogger(){
		this.level = AbstractLogger.LEVEL_ERROR;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}

}
