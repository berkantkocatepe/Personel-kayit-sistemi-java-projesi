package MezunDurum;

import Egitimler.Egitim;

import java.util.ArrayList;
import java.util.List;

public class MezunDurumIslem {

    List<MezunDurum> mezunDurumList= new  ArrayList<MezunDurum>();

    public boolean MezunDurumEkle(MezunDurum mezunDurum) {
        if (mezunDurum.getMezunDurumAd() != null && mezunDurum.getMezunDurumId() != 0) {
            mezunDurumList.add(mezunDurum);
            return true;
        } else {
            return false;
        }

    }
    public List<MezunDurum> MezunDurumlariListele() {

        return mezunDurumList != null ? mezunDurumList : null;
    }
    public String mezunIdyeGoreAdGörüntüle(int gelenMezunId) {

        for (int i = 0; i < mezunDurumList.size(); i++) {

            if (mezunDurumList.get(i).getMezunDurumId() == gelenMezunId) {

                String mezunAdi = mezunDurumList.get(i).getMezunDurumAd();
                return mezunAdi;

            }
        }
        return null;
    }

}
