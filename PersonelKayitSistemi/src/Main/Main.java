package Main;

import Departman.Departman;
import Departman.DepartmanIslem;
import Egitimler.Egitim;
import Egitimler.EgitimIslem;
import EngelDurumu.EngelDurumu;
import EngelDurumu.EngelDurumuIslem;
import GirisTarihi.*;
import HomeOfisPersonel.HomeOfisPersonelIslem;
import KadroluPersonel.*;
import MezunDurum.*;
import Personel.*;
import Pozisyon.*;
import SaglikSigortasi.SaglikSigortasi;
import SaglikSigortasi.SaglikSigortasiIslem;
import SenelikIzinHakki.*;
import HomeOfisPersonel.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        PersonelIslem personelIslem = new PersonelIslem();
        PozisyonIslem pozisyonIslem = new PozisyonIslem();
        GirisTarihiIslem girisTarihiIslem = new GirisTarihiIslem();
        DepartmanIslem departmanIslem = new DepartmanIslem();
        EgitimIslem egitimIslem = new EgitimIslem();
        SenelikIzinHakkiIslem senelikIzinHakkiIslem = new SenelikIzinHakkiIslem();
        SaglikSigortasiIslem saglikSigortasiIslem = new SaglikSigortasiIslem();
        MezunDurumIslem mezunDurumIslem = new MezunDurumIslem();
        EngelDurumuIslem engelDurumuIslem = new EngelDurumuIslem();
        KadroluPersonelIslem kadroluPersonelIslem = new KadroluPersonelIslem();
        HomeOfisPersonelIslem homeOfisPersonelIslem = new HomeOfisPersonelIslem();


        List<Personel> personeller = personelIslem.PersonelleriListele();
        List<Pozisyon> pozisyonlar = pozisyonIslem.PozisyonleriListele();
        List<GirisTarihi> girisTarihleri = girisTarihiIslem.GirisSaatiListele();
        List<Departman> departmanlar = departmanIslem.DepartmanleriListele();
        List<Egitim> egitimler = egitimIslem.EgitimleriListele();
        List<SenelikIzinHakki> izinHaklari = senelikIzinHakkiIslem.SenelikIzinHakkiListele();
        List<SaglikSigortasi> sagliksigortalari = saglikSigortasiIslem.SaglikSigortasiListele();
        List<MezunDurum> mezunDurumları = mezunDurumIslem.MezunDurumlariListele();
        List<EngelDurumu> engeldurumlari = engelDurumuIslem.EngelDurumuListele();
        List<KadroluPersonel> kadroluPersoneller = kadroluPersonelIslem.KadroluPersonelListele();
        List<HomeOfisPersonel> homeOfisPersoneller = homeOfisPersonelIslem.HomeOfisPersonelListele();


        String secim, ad, soyad, cinsiyet, departmanAd, egitimAd;
        int silinecekpersonel, silinecekEgitim, silinecekDepartman,homeOfisId, maas, girisTarihiId, egitimId, pozisyonId, departmanId, izinHakkiId, sigortaId, engelId, mezunId, kardoId, egitimsayisi = 0, deparmansayisi = 0, personelsayisi = 0;
        boolean anamenukontrol = true, egitimKontrol = true, personelmenukontrol = true, departmanKontrol = true;//Menü kontrol değişkenleri
        Scanner veri = new Scanner(System.in);

//                         VERİ GİRİŞLERİ BAŞLANGIÇ
        GirisTarihiEkle(girisTarihiIslem); 
        
        EgitimEkle(egitimIslem);
        egitimsayisi=5;

        MezunDurumuEkle(mezunDurumIslem);
        
        DepartmanEkle(departmanIslem);
        deparmansayisi=5;
        
        PozisyonEkle(pozisyonIslem);
        
        
        engeldurumlari.add(new EngelDurumu(0, false));
        engeldurumlari.add(new EngelDurumu(1, true));

        izinHaklari.add(new SenelikIzinHakki(0, false));
        izinHaklari.add(new SenelikIzinHakki(1, true));

        sagliksigortalari.add(new SaglikSigortasi(0, false));
        sagliksigortalari.add(new SaglikSigortasi(1, true));

        kadroluPersoneller.add(new KadroluPersonel(0, false));
        kadroluPersoneller.add(new KadroluPersonel(1, true));
        
        homeOfisPersoneller.add(new HomeOfisPersonel(0,false));
        homeOfisPersoneller.add(new HomeOfisPersonel(1,true));
        


        personeller.add(new Personel(1, "Emirhan", "Çeribaş", "Erkek", 1, 1, 1, 5, 1200000, 1, 1, 1, 0, 1,0));
        personelsayisi++;
        personeller.add(new Personel(2, "Eyüp Can", "Yağır", "Erkek", 5, 3, 3, 2, 12000, 10, 1, 1, 0, 1,0));
        personelsayisi++;
        personeller.add(new Personel(3, "Berkant", "Kocatepe", "Erkek", 2, 5, 5, 1, 1, 5, 0, 1, 0, 1,1));
        personelsayisi++;
        
//                         VERİ GİRİŞLERİ BİTİŞ


        do {
            System.out.println("----------PERSONEL SİSTEMİNE HOŞGELDİNİZ----------");
            System.out.println("1--> Personellerin kişisel bilgilerini görüntüle");
            System.out.println("2--> Departmanları görüntüle");
            System.out.println("3--> Eğitimleri görüntüle");
            System.out.println("4--> ---------------Çıkış yap---------------------");
            System.out.print("Yapmak istediğiniz işlemi seçiniz ==>");
            secim = veri.next();
            if ("1".equals(secim)) {

                do {
                    for (Personel personel : personeller) {//foreach ile personelleri yazdırıyoruz
                        for (int i = 0; i < departmanlar.size(); i++) {//burdaki döngü ile personelin hangi pozisyonda olduğunu buluyoruz
                            if (personel.getDepartmanId() == departmanlar.get(i).getDepartmanId()) {//personelin bulunduğu pozisyon doğru mu yanlış mı olduğunu burada kontrol ediyoruz
                                System.out.println("Id: " + personel.getPersonelId() +
                                            "\n" + "Ad: " + personel.getAd() +
                                            "\n" + "Soyad: " + personel.getSoyad() +
                                            "\n" + "Cinsiyet: " + personel.getCinsiyet() +

                                            "\n" + "Departman: " + departmanIslem.DepartmanIdyeGoreAdGörüntüle(personel.getDepartmanId()) +
                                            "\n" + "İzin Hakkı: " + senelikIzinHakkiIslem.IzinIdyeGoreAdGörüntüle(personel.getIzinHakkiId()) +
                                            "\nSağlık sigortası: " + saglikSigortasiIslem.sigortaIdyeGoreAdGörüntüle(personel.getSigotaId()) +
                                            "\nEngel Durumu: " + engelDurumuIslem.EngelIdyeGoreAdGörüntüle(personel.getEngelId()) +
                                            "\nKadro Durumu: " + kadroluPersonelIslem.KadroIdyeGoreAdGörüntüle(personel.getKadroId())+
                                        "\nHome Ofis Durumu: "+homeOfisPersonelIslem.HomeOfisPersonelIdyeGoreAdGörüntüle(personel.getHomeOfisId()));

                            }
                        }
                        for (int i=0; i < egitimler.size();i++){
                            if (personel.getEgitimId()==egitimler.get(i).getEgitimId()){
                                System.out.println("Eğitim: "+egitimIslem.EgitimIdyeGoreAdGörüntüle(personel.getEgitimId()));
                            }

                        }
//                        egitimIslem.EgitimleriListele();
                        for (int i=0;i<pozisyonlar.size();i++){
                            if (personel.getPozisyonId()==pozisyonlar.get(i).getPozisyonId()){
                                System.out.println("Pozisyon: "+pozisyonIslem.PozisyonIdyeGoreAdGörüntüle(personel.getPozisyonId()));
                            }
                        }
                        for (int i= 0;i<mezunDurumları.size();i++){
                            if (personel.getMezunDurumId()==mezunDurumları.get(i).getMezunDurumId()){
                                System.out.println("Mezun Durumu:"+mezunDurumIslem.mezunIdyeGoreAdGörüntüle(personel.getMezunDurumId())+"\n" + "Maaş: " + personel.getMaas());
                                System.out.println("------------------------------------------");
                            }

                        }

                    }
                    System.out.println("-)Personel Silme ");
                    System.out.println("+)Personel Ekleme");
                    System.out.println("*)Personel Güncelleme");
                    System.out.println("0)Ana Menü");
                    System.out.print("====>");
                    secim = veri.next();
                    if ("-".equals(secim)) {
                        System.out.print("Silmek istediğiniz personelin idsini giriniz :");
                        silinecekpersonel = veri.nextInt();
                        personelIslem.PersonelSil(silinecekpersonel);
                        System.out.println("\n" + silinecekpersonel + " idli personel silindi");
                    } else if ("+".equals(secim)) {
                        personelsayisi++;
                        System.out.print("Personelin adını giriniz:");
                        ad = veri.next();
    

                        System.out.println("Personelin soyadını giriniz:");
                        soyad = veri.next();
                        veri.nextLine();
                        System.out.println("Personelin cinsiyeti giriniz:");
                        cinsiyet = veri.next();
                        for (Departman departman : departmanlar) {
                            System.out.println(departman.getDepartmanId() + " => " + departman.getAd());
                        }
                        System.out.println("Personelin departmanını giriniz:");
                        departmanId = veri.nextInt();

                        for (MezunDurum mezunDurum : mezunDurumları) {
                            System.out.println(mezunDurum.getMezunDurumId() + " => " + mezunDurum.getMezunDurumAd());
                        }
                        System.out.println("Personelin diploma türünü giriniz:");
                        mezunId = veri.nextInt();


                        for (Egitim egitim : egitimler) {
                            System.out.println(egitim.getEgitimId() + " => " + egitim.getAd());
                        }
                        System.out.println("Personelin aldığı eğitimi giriniz:");
                        egitimId = veri.nextInt();

                        for (Pozisyon pozisyon : pozisyonlar) {
                            System.out.println(pozisyon.getPozisyonId() + " =>" + pozisyon.getAd());
                        }
                        System.out.println("Personelin Pozisyonunu giriniz:");
                        pozisyonId = veri.nextInt();
                        System.out.println("Personelin maaşını giriniz:");
                        maas = veri.nextInt();
                        for (GirisTarihi girisTarihi : girisTarihleri) {
                            System.out.println(girisTarihi.getGirisTarihiId() + "=>" + girisTarihi.getGirisYili());
                        }
                        System.out.println("Personelin giriş tarihini idsini giriniz:");
                        girisTarihiId = veri.nextInt();
                        System.out.println("1 => İzin hakkı var\n0 => İzin hakkı yok\nPersonelin izin hakkını giriniz:");
                        izinHakkiId = veri.nextInt();
                        System.out.println("1 => Sigorta var\n0 => Sigorta Yok\nPersonelin sigorta durumunu giriniz:");
                        sigortaId = veri.nextInt();
                        System.out.println("1 => Engel Durumu var\n0 => Engel Durumu yok\nPersonelin engel durumunu giriniz");
                        engelId = veri.nextInt();

                        System.out.println("1 => Kadrolu\n0 => Kadrosuz\nPersonelin kadro durumunu giriniz");
                        kardoId = veri.nextInt();
                        
                        System.out.println("1 => Home Ofis\n0 => Home Ofis Değil\nPersonelin home ofis durumunu giriniz");
                        homeOfisId = veri.nextInt();

                        personeller.add(new Personel(personelsayisi, ad, soyad, cinsiyet, departmanId, mezunId, egitimId, pozisyonId, maas, girisTarihiId, izinHakkiId, sigortaId, engelId, kardoId,homeOfisId));
                    } else if ("*".equals(secim)) {

                        System.out.println("Güncellemek İstediğiniz Personelin Id sini giriniz:");
                        int güncelleme = veri.nextInt();
                        personelIslem.PersonelGuncelle(güncelleme);

                    } else if ("0".equals(secim)) {
                        personelmenukontrol = false;

                    } else {
                        System.out.println("Yanlış İşlem yaptınız.");
                    }


                } while (personelmenukontrol);
            } else if ("2".equals(secim)) {

                do {
                    for (Departman departman : departmanlar) {
                        System.out.println("Departman Id: " + departman.getDepartmanId() + "\nDeparman Adı: " + departman.getAd());
                        System.out.println("----------------------");
                    }
                    System.out.println("+)Departman Ekleme ");
                    System.out.println("-)Departman Silme");
                    System.out.println("0)Ana Menü");
                    System.out.print("====>");
                    secim = veri.next();
                    if ("+".equals(secim)) {
                        deparmansayisi++;
                        System.out.println("Eklenicek Departmanın adini giriniz: ");
                        departmanAd = veri.next();
                        departmanlar.add(new Departman(deparmansayisi, departmanAd));
                    } else if ("-".equals(secim)) {

                        System.out.print("Silmek istediğiniz departmanın idsini giriniz :");
                        silinecekDepartman = veri.nextInt();
                        departmanIslem.DepartmanSil(silinecekDepartman);
                        System.out.println("\n" + silinecekDepartman + " idli departman silindi");

                    } else if ("0".equals(secim)) {
                        System.out.println("Geri gidiliyor...");
                        departmanKontrol = false;
                    } else {
                        System.out.println("Belirtilen İşlemlerden Birini Giriniz");
                    }
                } while (departmanKontrol);
            } else if ("3".equals(secim)) {
                do {

                    for (Egitim egitim : egitimler) {
                        System.out.println("Eğitim Id: " + egitim.getEgitimId() + "\nEğitim Adı: " + egitim.getAd());
                        System.out.println("----------------------");
                    }
                    System.out.println("+)Eğitim Ekleme ");
                    System.out.println("-)Eğitim Silme");
                    System.out.println("0)Ana Menü");
                    System.out.print("====>");
                    secim = veri.next();
                    if ("+".equals(secim)) {
                        egitimsayisi++;
                        System.out.println("Eğitim adı giriniz: ");
                        egitimAd = veri.next();
                        veri.nextLine();
                        egitimler.add(new Egitim(egitimsayisi, egitimAd));
                    } else if ("-".equals(secim)) {

                        System.out.print("Silmek istediğiniz Eğitim idsini giriniz :");
                        silinecekEgitim = veri.nextInt();
                        egitimIslem.EgitimSil(silinecekEgitim);
                        System.out.println("\n" + silinecekEgitim + " idli eğitim silindi");
                    } else if ("0".equals(secim)) {
                        System.out.println("Geri gidiliyor...");
                        egitimKontrol = false;
                    } else {
                        System.out.println("Belirtilen İşlemlerden Birini Giriniz");
                    }

                } while (egitimKontrol);
            } else if ("4".equals(secim)) {
                System.out.println("Çıkış Yapılıyor ...");
                anamenukontrol = false;
            } else {
                System.out.println("\n\n\nLürfen bir daha işlem seçiniz. ");
            }
        } while (anamenukontrol);
    }

    private static void GirisTarihiEkle(GirisTarihiIslem girisTarihiIslem) {
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(1, 2011));
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(2, 2012));
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(3, 2013));
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(4, 2014));
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(5, 2015));
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(6, 2016));
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(7, 2017));
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(8, 2018));
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(9, 2019));
        girisTarihiIslem.GirisSaatiEkle(new GirisTarihi(10, 2020));
    }
    private static void EgitimEkle(EgitimIslem egitimIslem) {
        egitimIslem.EgitimEkle(new Egitim(1,"Etkin Yöneticilik ve Liderlik Eğitimi" ));
        egitimIslem.EgitimEkle(new Egitim(2,"Etkili Takım Çalışması Eğitimi" ));
        egitimIslem.EgitimEkle(new Egitim(3,"Zaman Yönetimi Eğitimi" ));
        egitimIslem.EgitimEkle(new Egitim(4,"Satış ve Pazarlama Eğitimi" ));
        egitimIslem.EgitimEkle(new Egitim(5,"Müzakere Teknikleri" ));
    }
    private static void MezunDurumuEkle(MezunDurumIslem mezunDurumIslem) {
            
        mezunDurumIslem.MezunDurumEkle(new MezunDurum(1, "İlk Okul"));
        mezunDurumIslem.MezunDurumEkle(new MezunDurum(2, "Orta Okul"));
        mezunDurumIslem.MezunDurumEkle(new MezunDurum(3, "Lise"));
        mezunDurumIslem.MezunDurumEkle(new MezunDurum(4, "Üniversite"));
        mezunDurumIslem.MezunDurumEkle(new MezunDurum(5, "Yüksek Lisans"));
    }
    private static void DepartmanEkle(DepartmanIslem departmanIslem) {
        
        departmanIslem.DepartmanEkle(new Departman(1,"Yönetim Departmanı"));
        departmanIslem.DepartmanEkle(new Departman(2,"Pazarlama Departmanı"));
        departmanIslem.DepartmanEkle(new Departman(3,"İnsan Kaynakları Departmanı"));
        departmanIslem.DepartmanEkle(new Departman(4,"Hukuk Departmanı"));
        departmanIslem.DepartmanEkle(new Departman(5,"Üretim  Departmanı"));
    }
    private static void PozisyonEkle(PozisyonIslem pozisyonIslem) {
        
        pozisyonIslem.PozisyonEkle(new Pozisyon(1,"CEO"));
        pozisyonIslem.PozisyonEkle(new Pozisyon(2,"Başkan ve Başkan Yardımcısı"));
        pozisyonIslem.PozisyonEkle(new Pozisyon(3,"Departman Müdürleri"));
        pozisyonIslem.PozisyonEkle(new Pozisyon(4,"Patron"));
        pozisyonIslem.PozisyonEkle(new Pozisyon(5,"İşçi"));
        }
        
}
