/**
 * 
 */
package chain;

/**
 * @author fubaokui
 *
 */
public class InfoLogger extends AbstractLogger {
	
	public InfoLogger(){
		this.level = AbstractLogger.LEVEL_INFO;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Info Console::Logger: " + message);
	}

}
