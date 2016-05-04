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
public class Manager extends PegawaiTetap{
    Manager(String nip,String nama,String alamat,int gajiPokok,int jumlahAnak,int presentaseTepatWaktu){
        super (nip,nama,alamat,gajiPokok,jumlahAnak,presentaseTepatWaktu);
    }
    Manager(){
        super();
    }
    @Override
    public String toString(){
        return "Biodata Manager\n"+super.toString();
    }
    
}
