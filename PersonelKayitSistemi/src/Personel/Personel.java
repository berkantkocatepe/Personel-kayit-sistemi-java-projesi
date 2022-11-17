package Personel;

import Pozisyon.Pozisyon;
public class Personel {

    private int personelId;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private double maas;
    private int pozisyonId;
    private int girisTarihiId;
    private int departmanId;
    private int egitimId;
    private int izinHakkiId;
    private int sigotaId;
    private int mezunDurumId;
    private int engelId;
    private int kadroId;
    private int homeOfisId;
    
   


    public Personel(int personelId, String ad, String soyad, String cinsiyet, int departmanId, int mezunDurumId, int egitimId, int pozisyonId, double maas, int girisTarihiId, int izinHakkiId, int sigotaId, int engelId, int kadroId, int homeOfisId) {
        this.personelId = personelId;
        this.ad = ad;//
        this.soyad = soyad;//
        this.cinsiyet = cinsiyet;//
        this.maas = maas;//
        this.departmanId = departmanId;//
        this.mezunDurumId = mezunDurumId;
        this.egitimId = egitimId;
        this.pozisyonId = pozisyonId;//
        this.girisTarihiId = girisTarihiId;
        this.izinHakkiId = izinHakkiId;//
        this.sigotaId = sigotaId;//
        this.engelId = engelId;
        this.kadroId = kadroId;
        this.homeOfisId=homeOfisId;
    }


    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getPozisyonId() {
        return pozisyonId;
    }

    public void setPozisyonId(int pozisyonId) {
        this.pozisyonId = pozisyonId;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getGirisTarihiId() {
        return girisTarihiId;
    }

    public void setGirisTarihiId(int girisTarihiId) {
        this.girisTarihiId = girisTarihiId;
    }

    public int getDepartmanId() {
        return departmanId;
    }

    public void setDepartmanId(int departmanId) {
        this.departmanId = departmanId;
    }

    public int getEgitimId() {
        return egitimId;
    }

    public void setEgitimId(int egitimId) {
        this.egitimId = egitimId;
    }

    public int getIzinHakkiId() {
        return izinHakkiId;
    }

    public void setIzinHakkiId(int izinHakkiId) {
        this.izinHakkiId = izinHakkiId;
    }

    public int getSigotaId() {
        return sigotaId;
    }

    public void setSigotaId(int sigotaId) {
        this.sigotaId = sigotaId;
    }

    public int getMezunDurumId() {
        return mezunDurumId;
    }

    public void setMezunDurumId(int mezunDurumId) {
        this.mezunDurumId = mezunDurumId;
    }

    public int getEngelId() {
        return engelId;
    }

    public void setEngelId(int engelId) {
        this.engelId = engelId;
    }

    public int getKadroId() {
        return kadroId;
    }

    public void setKadroId(int kadroId) {
        this.kadroId = kadroId;
    }

    public int getHomeOfisId() {
        return homeOfisId;
    }

    public void setHomeOfisId(int homeOfisId) {
        this.homeOfisId = homeOfisId;
    }
}
