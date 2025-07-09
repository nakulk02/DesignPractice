package ErrorAndLogging;

import Utils.LogType;

public abstract class Logger {

	protected final Logger nextProcessor;

	private static volatile Logger logger;

	public static Logger getLogger() {
		if (logger == null) {
			synchronized (Logger.class) {
				// This is an interesting thing. Here the lock is on the Whole class.Why?
				// because the function is static and hence has no this (context).
				// Therefore we need to lock the class itself

				if (logger == null) {
					// And this ones even more interesting. The reason for this double check is
					// because
					// two threads might still be able to make two objects.Why?
					// Assume Thread A enters first, acquires the lock and starts to make the object
					// Now B waits for the lock. When A finishes, B still enters the synchronized
					// and
					// creates a new object. Not ideal, hence the double check
					logger = new Info(new Debug(new Warning(new Error(null))));
				}
			}
		}
		return logger;
	}

	protected Logger(Logger nextProcessor) {
		this.nextProcessor = nextProcessor;
	}

	abstract void log(LogType type, String message);
}