package pegawai;

/**
 *
 * @author rickyanggoro
 */
public class MainPegawai {

    public static void main(String[] args) {
        PegawaiTetap pt1 = new PegawaiTetap("46", "Adam","Jogja",
        1000000, 2, 100);
        PegawaiTidakTetap ptt1 = new PegawaiTidakTetap("47","Ari",
        "Sleman", 18);
        System.out.println(pt1);
        System.out.println(ptt1);          
        System.out.println("----------------------------------------");
        System.out.println("Polymorphism\n");
        Pegawai x = new PegawaiTetap("1","Kiedis","LA",500000,1,70);
        Pegawai y = new PegawaiTidakTetap("2", "Flea", "LA", 8);        
        System.out.println(x);
        System.out.println(y);
        System.out.println("Bandingkan nama x dan y");
        System.out.println(x.compareNIP(y));
        
        System.out.println("---------------------------------------");
        Pegawai frusciante = new Manager("012","John","LA",15000000,0,95);
        PegawaiTidakTetap smith = new PegawaiHonorer("013","Chad","LA",20);
        System.out.println(frusciante);
        System.out.println(smith);
    }
    
}
