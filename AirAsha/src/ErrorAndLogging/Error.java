package ErrorAndLogging;

import Utils.LogType;

public class Error extends Logger {
	Error(Logger nextProcessor) {
		super(nextProcessor);
	}

	@Override
	void log(LogType type, String message) {
		if (type == LogType.ERROR && message != null) {
			System.out.println("error:" + message);
		} else if (nextProcessor != null) {
			nextProcessor.log(type, message);
		}
	}
}