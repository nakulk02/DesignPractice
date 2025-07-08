package ErrorAndLogging;

import Utils.LogType;

public class Warning extends Logger{
	Warning(Logger nextProcessor)
	{
		super(nextProcessor);
	}

	@Override
	void log(LogType type,String message) {
		if(type==LogType.WARNING && message!=null)
		{
			System.out.println("warning:"+message);
		}
		else if(nextProcessor!=null)
		{
			nextProcessor.log(type, message);
		}
	}
}