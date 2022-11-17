package Pozisyon;



import java.util.ArrayList;
import java.util.List;

public class PozisyonIslem {

    List<Pozisyon> pozisyonList = new ArrayList<Pozisyon>();

    public boolean PozisyonEkle(Pozisyon pozisyon) {
        if (pozisyon.getAd() != null &&
                pozisyon.getPozisyonId() != 0 ) {
            pozisyonList.add(pozisyon);
            return true;
        } else {
            return false;
        }
    }

    public boolean PozisyonSil(int pozisyonId) {
        int PozisyonIndexi = 0;
        for(int i = 0; i < pozisyonList.size(); i++){
            if(pozisyonList.get(i).getPozisyonId() == pozisyonId){
                PozisyonIndexi = i;
            }
        }
        if (PozisyonIndexi >= 0){
            pozisyonList.remove(PozisyonIndexi);
            return true;
        }
        else{
            return false;
        }
    }
    public List<Pozisyon> PozisyonleriListele() {

        return pozisyonList != null ? pozisyonList : null;
    }

    public  String  PozisyonIdyeGoreAdGörüntüle(int gelenPozisyonId){

        for (int i = 0; i < pozisyonList.size(); i++){

            if (pozisyonList.get(i).getPozisyonId()==gelenPozisyonId){

               String pozisyonadi = pozisyonList.get(i).getAd();
                return pozisyonadi;

            }
        }
        return null;
    }
}
