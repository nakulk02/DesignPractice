package Users;
import Utils.PNR;

public class Passenger extends User {
    private int bagId;
    private PNR pnr;

    Passenger(String name, String phone, String email, int id) {
        super(name,phone,email,id,1);
    }
    
    Passenger(String name, String phone, String email, int id, int level) {
        super(name,phone,email,id,level);
    }

    public void setBagId(int bagId) {
        this.bagId = bagId;
    }

    public void setPNR(PNR pnr) {
        this.pnr = pnr;
    }

    public int getBagId() {
        return bagId;
    }

    public PNR getPNR() {
        return pnr;
    }

    public int getLevel() {
        return level;
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

    public String getName() {
        return name;
    }
}
