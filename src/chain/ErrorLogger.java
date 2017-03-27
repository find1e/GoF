/**
 * 
 */
package chain;

/**
 * @author fubaokui
 *
 */
public class ErrorLogger extends AbstractLogger {
	
	public ErrorLogger(){
		this.level = AbstractLogger.LEVEL_DEBUG;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Debug Console::Logger: " + message);
	}

}
