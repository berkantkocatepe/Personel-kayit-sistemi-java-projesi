package Personel;
import java.util.*;


public class PersonelIslem {


    Scanner personelIslemVeri = new Scanner(System.in);
    List<Personel> personelList = new ArrayList<Personel>();

    public boolean PersonelEkle(Personel personel) {
        if (personel.getAd() != null &&
                personel.getSoyad() != null &&
                personel.getPersonelId() != 0 &&
                personel.getCinsiyet() != null &&
                personel.getMaas() != 0
        ) {
            personelList.add(personel);
            return true;
        } else {
            return false;
        }

    }

    public boolean PersonelGuncelle(int guncellenicekPersonelId) {

        for (int i = 0; i < personelList.size(); i++) {
            if (personelList.get(i).getPersonelId() == guncellenicekPersonelId) {
                boolean guncellemeDegisimKontrol = true;
                do {
                    int degisimIslem = 0;
                    System.out.println("\n\n\n\n-----------------GÜNCELLENİCEK PERSONEL-------------------------");
                    System.out.println("Ad: " + personelList.get(i).getAd());
                    System.out.println("Soyad: " + personelList.get(i).getSoyad());
                    System.out.println("----------------------------------------------------------------");

                    System.out.println("1 => Personelin adını değiştirme");
                    System.out.println("2 => Personelin soyadını değiştirme");
                    System.out.println("3 => Personelin cinsiyetini değiştirme");
                    System.out.println("4 => Personelin pozisyonunu değiştirme");
                    System.out.println("5 => Personelin maaşını değiştirme");
                    System.out.println("6 => Personelin izin hakkını değiştirme");
                    System.out.println("7 => Personelin sigortasını değiştirme");
                    System.out.println("8 => Personelin departmanını değiştirme");
                    System.out.println("9 => Personelin mezun durumunu değiştirme");
                    System.out.println("0 =>Geri Dön");
                    System.out.print("Değiştirmek istediğiniz bilgiyi seçiniz:");
                    degisimIslem = personelIslemVeri.nextInt();

                    if (degisimIslem == 1) {
                        System.out.print("Personelin yeni adını giriniz:");
                        String guncellenmisAd = personelIslemVeri.next();
                        System.out.println(personelList.get(i).getAd() + " İsmi " + guncellenmisAd + " İsmi ile degistirildi");
                        personelList.get(i).setAd(guncellenmisAd);
                    } else if (degisimIslem == 2) {

                        System.out.print("Personelin yeni soyadını giriniz:");
                        String guncellenmisSoyad = personelIslemVeri.next();
                        System.out.println(personelList.get(i).getSoyad() + " Soyad " + guncellenmisSoyad + " Soyad ile degistirildi");
                        personelList.get(i).setSoyad(guncellenmisSoyad);

                    } else if (degisimIslem == 3) {
                        System.out.print("Personelin yeni cinsiyetini giriniz:");
                        String guncellenmisCinsiyet = personelIslemVeri.next();
                        System.out.println(personelList.get(i).getCinsiyet() + " Cinsiyet " + guncellenmisCinsiyet + " Cinsiyet ile degistirildi");
                        personelList.get(i).setCinsiyet(guncellenmisCinsiyet);

                    } else if (degisimIslem == 4) {
                        System.out.print("Personeli yeni Pozisyonunu giriniz:");
                        int guncellenmisPozisyon = personelIslemVeri.nextInt();
                        System.out.println(personelList.get(i).getCinsiyet() + " Pozisyon " + guncellenmisPozisyon + " Pozisyon ile degistirildi");
                        personelList.get(i).setPozisyonId(guncellenmisPozisyon);

                    } else if (degisimIslem == 5) {
                        System.out.print("Personelin yeni maaşını giriniz:");
                        int guncellenmisMaas = personelIslemVeri.nextInt();
                        System.out.println(personelList.get(i).getMaas() + " Maaş " + guncellenmisMaas + " Maaş ile degistirildi");
                        personelList.get(i).setMaas(guncellenmisMaas);
                    } else if (degisimIslem == 6) {
                        System.out.print("1 => İzin hakkı var\n0 => İzin hakkı yok\nPersonelin yeni izin hakkını giriniz giriniz:");
                        int guncellenmisIzin = personelIslemVeri.nextInt();
                        if (guncellenmisIzin == 0 || guncellenmisIzin == 1) {
                            System.out.println(personelList.get(i).getIzinHakkiId() + " İzin hakkı " + guncellenmisIzin + " izin hakkı ile degistirildi");
                            personelList.get(i).setIzinHakkiId(guncellenmisIzin);
                        }
                    } else if (degisimIslem == 7) {
                        System.out.print("1 => Sigorta var\n0 => Sigorta yok\nPersonelin yeni izin hakkını giriniz giriniz:");
                        int guncellenmisSigorta = personelIslemVeri.nextInt();
                        if (guncellenmisSigorta == 0 || guncellenmisSigorta == 1) {
                            System.out.println(personelList.get(i).getIzinHakkiId() + " Sigorta " + guncellenmisSigorta + " Sigorta ile degistirildi");
                            personelList.get(i).setSigotaId(guncellenmisSigorta);
                        } else {
                            System.out.println("Lütfen 1 veya 0 ı seçiniz.");
                        }
                    }else if(degisimIslem== 8){
                        System.out.print("Personeli yeni Departmanını giriniz:");
                        int guncellenmisDepartman = personelIslemVeri.nextInt();
                        System.out.println(personelList.get(i).getDepartmanId() + " Derpatman " + guncellenmisDepartman + " Derpatman ile degistirildi");
                        personelList.get(i).setDepartmanId(guncellenmisDepartman);
                    } else if(degisimIslem == 9){
                        System.out.print("Personeli yeni mezun durmunu giriniz:");
                        int guncellenmisMezunDurum = personelIslemVeri.nextInt();
                        System.out.println(personelList.get(i).getMezunDurumId() + " Mezun durum " + guncellenmisMezunDurum + " Mezun durum ile degistirildi");
                        personelList.get(i).setMezunDurumId(guncellenmisMezunDurum);
                    }
                    else if (degisimIslem == 0) {
                        System.out.println("Geri dönülüyor....\n\n\n\n");
                        guncellemeDegisimKontrol = false;
                    } else {
                        System.out.println("Lütfen belirtilen işlemlerden birtanesini seçiniz.");
                    }

                } while (guncellemeDegisimKontrol);
            }
        }
        return true;
    }

    public boolean PersonelSil(int personelId) {
        int personelIndexi = 0;
        for (int i = 0; i < personelList.size(); i++) {
            if (personelList.get(i).getPersonelId() == personelId) {
                personelIndexi = i;
            }
        }
        if (personelIndexi >= 0) {
            personelList.remove(personelIndexi);
            return true;
        } else {
            return false;
        }
    }

    public List<Personel> PersonelleriListele() {

        return personelList != null ? personelList : null;
    }

}