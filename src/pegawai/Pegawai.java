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
public abstract class Pegawai {
     String nip, nama, alamat;
    Pegawai(String nip, String nama, String alamat){
        this.nip=nip;
        this.nama=nama;
        this.alamat=alamat;
    }
    Pegawai(){
    }
    
    abstract int hitungGaji();
    @Override
    public String toString(){
        return "NIP\t\t: "+nip+"\n"+
                "Nama\t\t: "+nama+"\n"+
                "Alamat\t\t: "+alamat+"\n";
    }
    String compareNIP(Pegawai p2){
        if(this.nip==p2.nip)
            return "NIP nya sama\n"+
                    this.nip+" = "+p2.nip;
        else return "NIP nya tidak sama\n"+
                this.nip+" != "+p2.nip;
    }
    
}
