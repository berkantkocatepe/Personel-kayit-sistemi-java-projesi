package EngelDurumu;

public class EngelDurumu {

    private int engelDurumuId;
    private boolean engelDurumu;

    public EngelDurumu(int engelDurumuId,boolean engelDurumu){
        this.engelDurumuId=engelDurumuId;
        this.engelDurumu=engelDurumu;
    }

    public int getEngelDurumuId() {
        return engelDurumuId;
    }

    public void setEngelDurumuId(int engelDurumuId) {
        this.engelDurumuId = engelDurumuId;
    }

    public boolean getEngelDurumu() {
        return engelDurumu;
    }

    public void setEngelDurumu(boolean engelDurumu) {
        this.engelDurumu = engelDurumu;
    }


}
