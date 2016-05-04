
package pegawai;

/**
 *
 * @author rickyanggoro
 */
public class PegawaiTidakTetap extends Pegawai{
     int jumlahShift;
    PegawaiTidakTetap(String nip, String nama, String alamat,
            int jumlahShift){
        super(nip, nama, alamat);
        this.jumlahShift=jumlahShift;
    }
    
    PegawaiTidakTetap(){
        super();
    }
    
    int getHrPerShift(){
        if(jumlahShift>=10){
            return 30000;
        }else if(jumlahShift>5){
            return 25000;
        }else return 20000;
    }
    @Override
    int hitungGaji(){
        return jumlahShift*getHrPerShift();
    }
    @Override
    public String toString(){
        
        //String print=
        return super.toString()+"Jumlah Shift\t: "+jumlahShift+"\n"+
                "Gaji\t\t: "+hitungGaji()+"\n";
        //return print;
    }
    
}
