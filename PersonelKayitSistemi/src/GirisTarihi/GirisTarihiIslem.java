package GirisTarihi;

import java.util.ArrayList;
import java.util.List;

public class GirisTarihiIslem{
    List<GirisTarihi> girisTarihiList = new ArrayList<GirisTarihi>();
    public boolean GirisSaatiEkle(GirisTarihi girisTarihi) {
        if (girisTarihi.getGirisTarihiId() != 0 &&
                girisTarihi.getGirisYili() != 0 ) {
            girisTarihiList.add(girisTarihi);
            return true;
        } else {
            return false;
        }
    }

    public boolean GirisTarihiSil(int girisTarihiId) {
        int GirisTarihiIndexi = 0;
        for(int i = 0; i < girisTarihiList.size(); i++){
            if(girisTarihiList.get(i).getGirisTarihiId() == girisTarihiId){
                GirisTarihiIndexi = i;
            }
        }
        if (GirisTarihiIndexi >= 0){
            girisTarihiList.remove(GirisTarihiIndexi);
            return true;
        }
        else{
            return false;
        }
    }

    public List<GirisTarihi> GirisSaatiListele() {

        return girisTarihiList != null ? girisTarihiList :null;
    }

    public int GirisIdyeGoreAdGörüntüle(int gelenGirisId) {
                for (int i = 0; i < girisTarihiList.size(); i++){

            if (girisTarihiList.get(i).getGirisTarihiId()==gelenGirisId){

               int girisTarihi = girisTarihiList.get(i).getGirisYili();
                return girisTarihi;

            }
        }
        return 0;
    }


}
