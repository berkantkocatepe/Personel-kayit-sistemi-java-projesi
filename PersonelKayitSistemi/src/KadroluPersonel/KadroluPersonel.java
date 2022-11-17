package KadroluPersonel;

public class KadroluPersonel {
    private int kadroluPersonelId;
    private boolean kadroluPersonel;

    public KadroluPersonel(int kadroluPersonelId,boolean kadroluPersonel){
        this.kadroluPersonelId=kadroluPersonelId;
        this.kadroluPersonel=kadroluPersonel;
    }

    public int getKadroluPersonelId() {
        return kadroluPersonelId;
    }

    public void setKadroluPersonelId(int kadroluPersonelId) {
        this.kadroluPersonelId = kadroluPersonelId;
    }

    public boolean getKadroluPersonel() {
        return kadroluPersonel;
    }

    public void setKadroluPersonel(boolean kadroluPersonel) {
        this.kadroluPersonel = kadroluPersonel;
    }


}
