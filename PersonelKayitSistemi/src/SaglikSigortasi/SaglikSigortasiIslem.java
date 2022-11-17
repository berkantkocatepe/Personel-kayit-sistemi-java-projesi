package SaglikSigortasi;

import java.util.ArrayList;
import java.util.List;

public class SaglikSigortasiIslem {

    List<SaglikSigortasi> saglikSigortasiList = new ArrayList<SaglikSigortasi>();


    public boolean SaglikSigortasiEkle(SaglikSigortasi saglikSigortasi) {
        if (saglikSigortasi.getSaglikSigortasiId() != 0 ) {
            saglikSigortasiList.add(saglikSigortasi);
            return true;
        } else {
            return false;
        }
    }


    public List<SaglikSigortasi> SaglikSigortasiListele() {
        return saglikSigortasiList != null ? saglikSigortasiList : null;
    }

    public  String  sigortaIdyeGoreAdGörüntüle(int gelensigortaId){

        for (int i = 0; i < saglikSigortasiList.size(); i++){

            if (saglikSigortasiList.get(i).getSaglikSigortasiId()==gelensigortaId){

                boolean pozisyonadi = saglikSigortasiList.get(i).getisSaglikSigortasi();
                if (pozisyonadi==true){
                    return "var";
                }


            }
        }
        return "yok";
    }

}
