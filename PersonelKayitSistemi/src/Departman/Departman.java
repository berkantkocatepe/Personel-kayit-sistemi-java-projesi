package Departman;

public class Departman {

    private int departmanId;
    private int personelId;
    private String ad;

    public Departman(int departmanId, String ad) {
        this.departmanId = departmanId;
        this.ad = ad;
    }

    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public int getDepartmanId() {
        return departmanId;
    }

    public void setDepartmanId(int departmanId) {
        this.departmanId = departmanId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
