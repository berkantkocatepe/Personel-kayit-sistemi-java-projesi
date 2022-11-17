/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeOfisPersonel;

/**
 *
 * @author Finix
 */
public class HomeOfisPersonel {

    private int homeOfisPersonelId;
    private boolean homeOfisPersonel;

    public HomeOfisPersonel(int homeOfisPersonelId,boolean homeOfisPersonel) {
    
        this.homeOfisPersonelId=homeOfisPersonelId;
        this.homeOfisPersonel=homeOfisPersonel;
    }
    
    

    public int getHomeOfisPersonelId() {
        return homeOfisPersonelId;
    }

    public void setHomeOfisPersonelId(int homeOfisPersonelId) {
        this.homeOfisPersonelId = homeOfisPersonelId;
    }

    public boolean getHomeOfisPersonel() {
        return homeOfisPersonel;
    }

    public void setHomeOfisPersonel(boolean homeOfisPersonel) {
        this.homeOfisPersonel = homeOfisPersonel;
    }

}
