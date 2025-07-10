package Logging;

import Utils.LogType;

public class Info extends Logger {
	Info(Logger nextProcessor) {
		super(nextProcessor);
	}

	@Override
	void log(LogType type, String message) {
		if (type == LogType.INFO && message != null) {
			System.out.println("info:" + message);
		} else if (nextProcessor != null) {
			nextProcessor.log(type, message);
		}
	}
}