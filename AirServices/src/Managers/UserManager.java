package Managers;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import ErrorAndLogging.CustomException;
import Users.*;
import Utils.PNR;


public class UserManager {
    ConcurrentHashMap<Integer,Crew> crews;
    ConcurrentHashMap<Integer,Pilot> pilots;
    ConcurrentHashMap<Integer,Admin> admins;
    ConcurrentHashMap<Integer,PNR> pnrs;

    public List<Passenger> getPassengerObjects(int pnrNumber,String name) throws Exception
    {
         if(pnrs.contains(pnrNumber))
         {
            PNR pnr=pnrs.get(pnrNumber);
            if(pnr.checkPassenger(name))
            {
               return pnr.getPassengersByName(name);
            }
         }
      throw CustomException.userNameNotFound("Passenger",name);
    }

    public Crew getCrewObject(int id,String password) throws Exception
    {
      if(crews.contains(id))
      {
         Crew crew=crews.get(id);
         if(crew.checkPassword(password))
         {
            return crew;
         }
      }
      throw CustomException.userIdNotFound("Crew",id);
    } 

    public Pilot getPilotObject(int id,String password) throws Exception
    {
      if(pilots.contains(id))
      {
         Pilot pilot=pilots.get(id);
         if(pilot.checkPassword(password))
         {
            return pilot;
         }
      }
      throw CustomException.userIdNotFound("Pilot",id);
    } 

    public Admin getAdminObject(int id,String password) throws Exception
    {
      if(admins.contains(id))
      {
         Admin admin=admins.get(id);
         if(admin.checkPassword(password))
         {
            return admin;
         }
      }
      throw CustomException.userIdNotFound("Admin",id);
    }
    
    public User createUser(String name,String phone,String email,int id) {
    	
    	
//    	User user=new User(name,phone,email,id);
    	return null;
    }
};
