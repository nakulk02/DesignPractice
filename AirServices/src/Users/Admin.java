package Users;

public class Admin extends User{
   private String password;
   private String dateOfJoining;

   Admin(String name,String phone,String email,int id,String password,String dateOfJoining)
   {
       super(name,phone,email,id,4);
       this.password=password;
       this.dateOfJoining=dateOfJoining;
   }
   // setter for flightNumber
   // getter for all except password
   public boolean checkPassword(String password)
   {
     return this.password.equals(password);
   }
  
};
