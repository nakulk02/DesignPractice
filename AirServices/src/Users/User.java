package Users;
	
	public class User {
		    protected int id;
		    public String name;
		    public String phone;
		    public String email;
		    public final int level;
		    
		    public User(String name, String phone, String email, int id,int level)
		    {
		    	this.id = id;
		        this.name = name;
		        this.phone = phone;
		        this.email = email;
		        this.level=level;
		    }

		    public String getName() {
		        return name;
		    }

		    public int getId() {
		        return id;
		    }

		    public String getPhone() {
		        return phone;
		    }

		    public String getEmail() {
		        return email;
		    }
		    
		    public int getLevel() {
		        return level;
		    }

	}
