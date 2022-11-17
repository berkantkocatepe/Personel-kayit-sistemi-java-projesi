package Egitimler;

public class Egitim {
    private int egitimId;
    private int personelId;
    private String ad;


    public Egitim(int egitimId, String ad) {
        this.egitimId = egitimId;
        this.ad = ad;

    }

    public int getEgitimId() {
        return egitimId;
    }

    public void setEgitimId(int egitimId) {
        this.egitimId = egitimId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

}
