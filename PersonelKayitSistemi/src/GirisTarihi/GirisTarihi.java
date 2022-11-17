package GirisTarihi;

public class GirisTarihi {

    private int girisTarihiId;
    private int girisyili;

    public GirisTarihi(int girisTarihiId, int girisyili){
        this.girisTarihiId=girisTarihiId;
        this.girisyili=girisyili;

    }

    public int getGirisTarihiId() {
        return girisTarihiId;
    }

    public void setGirisTarihiId(int girisTarihiId) {
        this.girisTarihiId = girisTarihiId;
    }
    public int getGirisYili() {
        return girisyili;
    }

    public void setGirisYili(int girisSaati) {
        this.girisyili = girisSaati;
    }



}
