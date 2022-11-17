package Egitimler;

import java.util.ArrayList;
import java.util.List;

public class EgitimIslem {

    List<Egitim> egitimList = new ArrayList<Egitim>();


    public boolean EgitimEkle(Egitim egitim) {
        if (egitim.getAd() != null && egitim.getEgitimId() != 0) {
            egitimList.add(egitim);
            return true;
        } else {
            return false;
        }

    }


    public boolean EgitimSil(int egitimId) {
        int EgitimIndex = 0;
        for (int i = 0; i < egitimList.size(); i++) {
            if (egitimList.get(i).getEgitimId() == egitimId) {
                EgitimIndex = i;
            }
        }
        if (EgitimIndex >= 0) {
            egitimList.remove(EgitimIndex);
            return true;
        } else {
            return false;
        }
    }


    public List<Egitim> EgitimleriListele() {
        return egitimList != null ? egitimList : null;
    }

    public String EgitimIdyeGoreAdGörüntüle(int gelenEgitimId) {

        for (int i = 0; i < egitimList.size(); i++) {

            if (egitimList.get(i).getEgitimId() == gelenEgitimId) {

                String egitimAdi = egitimList.get(i).getAd();
                return egitimAdi;

            }
        }
        return null;
    }

}
