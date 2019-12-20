package app.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Advertisement {

    @Id
    private int aid;
    private String aname;
    private String aprice;
    private String adescription;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAprice() {
        return aprice;
    }

    public void setAprice(String aprice) {
        this.aprice = aprice;
    }

    public String getAdescription() {
        return adescription;
    }

    public void setAdescription(String adescription) {
        this.adescription = adescription;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", aprice='" + aprice + '\'' +
                ", adescription='" + adescription + '\'' +
                '}';
    }
}
