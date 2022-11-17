package Pozisyon;

public class Pozisyon {
    private int pozisyonId;
    public String pozisyonAd;


    public Pozisyon(int pozisyonId,String pozisyonAd){
        this.pozisyonId=pozisyonId;
        this.pozisyonAd=pozisyonAd;
    }
    public int getPozisyonId() {
        return pozisyonId;
    }

    public void setPozisyonId(int pozisyonId) {
        this.pozisyonId = pozisyonId;
    }

    public String getAd() {
        return pozisyonAd;
    }

    public void setAd(String ad) {
        this.pozisyonAd = pozisyonAd;
    }
}
