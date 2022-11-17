package MezunDurum;

import java.util.ArrayList;
import java.util.List;

public class MezunDurum {

        private int mezunDurumId;
    private String mezunDurumAd;


    public MezunDurum(int mezunDurumId,String mezunDurumAd){
        this.mezunDurumId=mezunDurumId;
        this.mezunDurumAd=mezunDurumAd;
    }
    public int getMezunDurumId() {
        return mezunDurumId;
    }

    public void setMezunDurumId(int mezunDurumId) {
        this.mezunDurumId = mezunDurumId;
    }

    public String getMezunDurumAd() {
        return mezunDurumAd;
    }

    public void setMezunDurumAd(String mezunDurumAd) {
        this.mezunDurumAd = mezunDurumAd;
    }


}
