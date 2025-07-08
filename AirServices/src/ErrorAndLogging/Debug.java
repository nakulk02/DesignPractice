package ErrorAndLogging;

import Utils.LogType;

public class Debug extends Logger{
	Debug(Logger nextProcessor)
	{
		super(nextProcessor);
	}

	@Override
	void log(LogType type,String message) {
		if(type==LogType.DEBUG && message!=null)
		{
			System.out.println("debug:"+message);
		}
		else if(nextProcessor!=null)
		{
			nextProcessor.log(type, message);
		}
	}
}