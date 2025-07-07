package ErrorAndLogging;

public class CustomException extends Exception
{
	private CustomException(String message) {
        super(message);
    }
  
	static public CustomException errorValidating(String message)
	{
		return new CustomException(message);
	}
	
	static public CustomException userIdNotFound(String userType,int id)   
  {
     return new CustomException(userType+" not found for id: "+id );
  }
  static public CustomException userNameNotFound(String userType,String name)   
  {
	  return new CustomException(userType+" not found for name: "+name);
  }
  
}