package SaglikSigortasi;

public class SaglikSigortasi {
    private int SaglikSigortasiId;
    private boolean SaglikSigortasi;


    public SaglikSigortasi(int SaglikSigortasiId,boolean SaglikSigortasi){
        this.SaglikSigortasiId=SaglikSigortasiId;
        this.SaglikSigortasi=SaglikSigortasi;


    }

    public boolean getisSaglikSigortasi() {
        return SaglikSigortasi;
    }

    public void setSaglikSigortasi(boolean saglikSigortasi) {
        SaglikSigortasi = saglikSigortasi;
    }

    public int getSaglikSigortasiId() {
        return SaglikSigortasiId;
    }

    public void setSaglikSigortasiId(int saglikSigortasiId) {
        SaglikSigortasiId = saglikSigortasiId;
    }

}
