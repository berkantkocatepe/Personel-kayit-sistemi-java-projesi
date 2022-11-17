package SenelikIzinHakki;

public class SenelikIzinHakki {
    private int SenelikIzinHakkiId;
    private boolean IzınHakki;

    public SenelikIzinHakki(int senelikIzinHakkiId,boolean izinHakki){
        this.SenelikIzinHakkiId=senelikIzinHakkiId;
        this.IzınHakki=izinHakki;
    }


    public int getSenelikIzinHakkiId() {
        return SenelikIzinHakkiId;
    }

    public void setSenelikIzinHakkiId(int senelikIzinHakkiId) {
        SenelikIzinHakkiId = senelikIzinHakkiId;
    }

    public boolean getisIzınHakki() {
        return IzınHakki;
    }

    public void setIzınHakki(boolean izınHakki) {
        IzınHakki = izınHakki;
    }




}
