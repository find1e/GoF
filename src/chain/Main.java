/**
 * 
 */
package chain;

/**
 *  责任链设计模式测试类
 * 	@author fubaokui
 */
public class Main {

	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger();
		AbstractLogger infoLogger = new InfoLogger();
		AbstractLogger debugLogger = new DebugLogger();
		errorLogger.setNextLogger(infoLogger);
		infoLogger.setNextLogger(debugLogger);
		return errorLogger;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.LEVEL_INFO, "This is an information.");
		loggerChain.logMessage(AbstractLogger.LEVEL_DEBUG, "This is an debug level information.");
		loggerChain.logMessage(AbstractLogger.LEVEL_ERROR, "This is an error information.");
	}

}
