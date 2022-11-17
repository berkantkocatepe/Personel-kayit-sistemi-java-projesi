package EngelDurumu;
import java.util.*;

public class EngelDurumuIslem {

    List<EngelDurumu> engelDurumuList = new ArrayList<EngelDurumu>();

    public boolean EngelDurumuEkle(EngelDurumu engelDurumu) {
        if (engelDurumu.getEngelDurumuId() != 0 && engelDurumu.getEngelDurumu() == true || engelDurumu.getEngelDurumu() == false  ) {
            engelDurumuList.add(engelDurumu);
            return true;
        } else {
            return false;
        }
    }

    public List<EngelDurumu> EngelDurumuListele() {

        return engelDurumuList != null ? engelDurumuList : null;
    }

    public  String  EngelIdyeGoreAdGörüntüle(int gelenEngelId){

        for (int i = 0; i < engelDurumuList.size(); i++){

            if (engelDurumuList.get(i).getEngelDurumuId()==gelenEngelId){

                boolean engeldurumu = engelDurumuList.get(i).getEngelDurumu();
                if (engeldurumu==true){
                    return "var";
                }


            }
        }
        return "yok";
    }
}
