/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benimoopsorum;

/**
 *
 * @author efekaya
 */
public class BenimOOPSorum {

    public static void main(String[] args) {
    ev ev =new ev(115,3,2,0);
    ev.fiyatbul();
    ev.vergibul();
    ev.evitanıt(); 
    villa villa =new villa(240,2,5,2);
    villa.fiyatbul();
    villa.vergibul();
    villa.evitanıt();
    
    }
    
    static class ev {
        public int mkare;
        public int kat;
        public int balkon;
        public int havuz;
        public int kiraf;
        public int satılıkf;
        public double vergi;
        
    public ev(int mkare, int kat, int balkon, int havuz){
        this.mkare=mkare;
        this.kat=kat;
        this.balkon=balkon;
        this.havuz=havuz;
        this.vergi=vergi;
        
    }
    public void evitanıt(){
        System.out.println("------APARTMAN DAİRESİ------");
        System.out.println("Eviniz "+mkare+" metrekaredir.");
        System.out.println("Eviniz "+kat+". katta bulunmaktadır.");
        System.out.println("Evinizin "+balkon+" adet balkonu bulunmaktadır.");
        System.out.println("Evinizi "+kiraf+"TL'ye kiraya verebilirseniz.");
        System.out.println("Evinizi "+satılıkf+"TL'ye satabilirsiniz.");
        System.out.println("Evinizin vergisi "+vergi+"TL'dir");
        System.out.println("----------------------------------------");
        System.out.println("   \n   ");
        
        
    }
    public void fiyatbul(){
        
        if(kat<2){
            kiraf=(10*mkare)+(50*balkon);
            satılıkf=(1000*mkare)+(1000*balkon);
        }else if(kat>=2 && kat<5){
            kiraf=(15*mkare)+(50*balkon);
            satılıkf=(1500*mkare)+(1200*balkon);
        }else if(kat>=5){
            kiraf=(13*mkare)+(50*balkon);
            satılıkf=(1300*mkare)+(1100*balkon);
        }
    }
    private void vergibul(){
       vergi=satılıkf*2/1000;
       
    }    
    
    public int getmkare() {
        return mkare;
    }

    public void setmkare(int ad) {
        this.mkare = mkare;
    }

    public int getkat() {
    return kat;
    }

    public void setkat(int kat) {
        this.kat = kat;
    }

    public int getbalkon() {
        return balkon;
    }

    public void setbalkon(int balkon) {
        this.balkon = balkon;
    }

    public double getvergi() {
        return vergi;
    }

    public void setvergi(double vergi) {
        this.vergi = vergi;
    }
    
    
    }
    static class villa extends ev{
    
    public villa (int mkare, int kat, int balkon, int havuz) {
        super(mkare, kat, balkon, havuz);
        
    }

    @Override
    public void fiyatbul() {
       if(kat==1){
            kiraf=(100*mkare)+(200*balkon)+(1000*havuz);
            satılıkf=(3000*mkare)+(1000*balkon)+(7000*havuz);
        }else if(kat>1){
            kiraf=(150*mkare)+(200*balkon)+(1000*havuz);
            satılıkf=(4000*mkare)+(1200*balkon)+(8000*havuz);
        }
    }

    @Override
    public void evitanıt() {
        System.out.println("------------VİLLA-----------");
        System.out.println("Eviniz "+mkare+" metrekaredir.");
        System.out.println("Eviniz "+kat+" katlıdır.");
        System.out.println("Evinizin "+balkon+" adet balkonu bulunmaktadır.");
        System.out.println("Evinizin "+havuz+" adet havuzu bulunmaktadır.");
        System.out.println("Evinizi "+kiraf+"TL'ye kiraya verebilirseniz.");
        System.out.println("Evinizi "+satılıkf+"TL'ye satabilirsiniz.");
        System.out.println("Evinizin vergisi "+vergi+"TL'dir");
        System.out.println("----------------------------------------");
    }
    
        private void vergibul() {
            vergi=satılıkf*8/1000;
        }
    
    }}    
    