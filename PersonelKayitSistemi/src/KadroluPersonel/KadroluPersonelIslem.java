package KadroluPersonel;

import java.rmi.StubNotFoundException;
import java.util.*;

public class KadroluPersonelIslem {
    List<KadroluPersonel> kadroluPersonelList = new ArrayList<KadroluPersonel>();

    public boolean KadroluPersonelEkle(KadroluPersonel kadroluPersonel) {
        if ((kadroluPersonel.getKadroluPersonelId() != 0 && kadroluPersonel.getKadroluPersonel() == true || kadroluPersonel.getKadroluPersonel()) == false) {
            kadroluPersonelList.add(kadroluPersonel);
            return true;
        } else {
            return true;
        }
    }

    public List<KadroluPersonel> KadroluPersonelListele() {
        return kadroluPersonelList != null ? kadroluPersonelList : null;
    }

    public String KadroIdyeGoreAdGörüntüle(int gelenKadroId) {
        for (int i = 0; i < kadroluPersonelList.size(); i++) {
            if (kadroluPersonelList.get(i).getKadroluPersonelId() == gelenKadroId) {
                boolean kadroDurumu = kadroluPersonelList.get(i).getKadroluPersonel();
                if (kadroDurumu == true) {
                    return "Kadrolu";
                }

            }
        }
        return "Kadrosuz";
    }


}
