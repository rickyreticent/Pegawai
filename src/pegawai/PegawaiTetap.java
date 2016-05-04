/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

/**
 *
 * @author rickyanggoro
 */
public class PegawaiTetap extends Pegawai{
    int gajiPokok, jumlahAnak, 
            presentaseTepatWaktu, tunjanganPerAnak=250000;
    PegawaiTetap(String nip, String nama, String alamat,int gajiPokok, int jumlahAnak, int presentaseTepatWaktu){
        super(nip, nama, alamat);
        this.gajiPokok=gajiPokok;
        this.jumlahAnak=jumlahAnak;
        this.presentaseTepatWaktu=presentaseTepatWaktu;
    }
    
    PegawaiTetap(){
        super();
    }
    
    @Override
    int hitungGaji(){
        return gajiPokok+tunjanganPerAnak*jumlahAnak+getBonus();        
    }
    int getBonus(){
        if(presentaseTepatWaktu>=80){
            return 250000;
        } else if(presentaseTepatWaktu>=60){
            return 0;
        } else return -150000;
    }
    @Override
    public String toString(){
        return super.toString()+"Jumlah Anak\t: "+jumlahAnak+"\n"+
                "Gaji\t\t: "+hitungGaji()+"\n";
    }
    
}
