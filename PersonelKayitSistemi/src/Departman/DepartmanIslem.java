package Departman;

import java.util.ArrayList;
import java.util.List;

public class DepartmanIslem {

    List<Departman> departmanList = new ArrayList<Departman>();


    public boolean DepartmanEkle(Departman departman) {
        if (departman.getAd() != null && departman.getDepartmanId() != 0 ) {
            departmanList.add(departman);
            return true;
        } else {
            return false;
        }
    }



    public boolean DepartmanSil(int departmanId) {
        int departmanIndexi = 0;
        for(int i = 0; i < departmanList.size(); i++){
            if(departmanList.get(i).getDepartmanId() == departmanId){
                departmanIndexi = i;
            }
        }
        if (departmanIndexi >= 0){
            departmanList.remove(departmanIndexi);
            return true;
        }
        else{
            return false;
        }
    }


    public List<Departman> DepartmanleriListele() {
        return departmanList != null ? departmanList : null;

    }
    public  String  DepartmanIdyeGoreAdGörüntüle(int gelenDepartmanId){

        for (int i = 0; i < departmanList.size(); i++){

            if (departmanList.get(i).getDepartmanId()==gelenDepartmanId){

                String departmanadi = departmanList.get(i).getAd();
                return departmanadi;

            }
        }
        return null;
    }

}
