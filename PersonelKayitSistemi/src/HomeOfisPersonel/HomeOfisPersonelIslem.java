/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeOfisPersonel;
import java.util.*;
/**
 *
 * @author Finix
 */
public class HomeOfisPersonelIslem {
    List<HomeOfisPersonel> homeOfisPersonelList = new ArrayList<HomeOfisPersonel>();
    
    public boolean homeOfisPersonelEkle(HomeOfisPersonel homeOfisPersonel) {
        if (homeOfisPersonel.getHomeOfisPersonelId()!= 0 && homeOfisPersonel.getHomeOfisPersonel()== true || homeOfisPersonel.getHomeOfisPersonel() == false  ) {
            homeOfisPersonelList.add(homeOfisPersonel);
            return true;
        } else {
            return false;
        }
    }
    
    
    public  List<HomeOfisPersonel> HomeOfisPersonelListele() {

        return homeOfisPersonelList != null ? homeOfisPersonelList : null;
    }
    
    public  String  HomeOfisPersonelIdyeGoreAdGörüntüle(int gelenHomeOfisPersonelId){

        for (int i = 0; i < homeOfisPersonelList.size(); i++){

            if (homeOfisPersonelList.get(i).getHomeOfisPersonelId()==gelenHomeOfisPersonelId){

                boolean homeofisdurumu = homeOfisPersonelList.get(i).getHomeOfisPersonel();
                if (homeofisdurumu==true){
                    return "var";
                }


            }
        }
        return "yok";
    }
    
    
}
