package SenelikIzinHakki;
import java.util.ArrayList;
import java.util.List;

public class SenelikIzinHakkiIslem {
    List<SenelikIzinHakki> senelikIzinHakkiList = new ArrayList<SenelikIzinHakki>();


    public boolean SenelikIzinHakkiEkle(SenelikIzinHakki senelikIzinHakki) {
        if (senelikIzinHakki.getSenelikIzinHakkiId() != 0 && senelikIzinHakki.getisIzınHakki() == true || senelikIzinHakki.getisIzınHakki() == false  ) {
            senelikIzinHakkiList.add(senelikIzinHakki);
            return true;
        } else {
            return false;
        }
    }


    public List<SenelikIzinHakki> SenelikIzinHakkiListele() {

        return senelikIzinHakkiList != null ? senelikIzinHakkiList : null;
    }


    public  String  IzinIdyeGoreAdGörüntüle(int gelenizinId){

        for (int i = 0; i < senelikIzinHakkiList.size(); i++){

            if (senelikIzinHakkiList.get(i).getSenelikIzinHakkiId()==gelenizinId){

                boolean pozisyonadi = senelikIzinHakkiList.get(i).getisIzınHakki();
                if (pozisyonadi==true){
                    return "var";
                }


            }
        }
        return "yok";
    }

}
