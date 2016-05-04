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
public class PegawaiHonorer extends PegawaiTidakTetap{
    PegawaiHonorer(String nip,String nama,String alamat,int jumlahShift){
        super (nip,nama,alamat,jumlahShift);
    }
    PegawaiHonorer(){
        super();
    }
    @Override
    public String toString(){
        return "Biodata Pegawai Honorer \n"+super.toString()+"\n";                
    }
    
}
