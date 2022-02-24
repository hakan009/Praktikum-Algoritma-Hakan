import java.util.Scanner;
public class tugas01 {
    public static void main(String[] args) {
        int tugas, uts, uas;
        double nilaiAkhir;
        String nilaiHuruf="";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program Penghitungan Nilai Akhir");
        System.out.println("=================================");
        System.out.print("Masukkan nilai Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        uas = sc.nextInt();
        System.out.println("=================================");
        nilaiAkhir=((0.2*tugas)+(0.35*uts)+(0.45*uas));
        System.out.println("Nilai Akhir : " +nilaiAkhir);
        if(nilaiAkhir > 80 && nilaiAkhir<=100){
            nilaiHuruf = "A";
            System.out.println("Nilai Huruf : " +nilaiHuruf);
        }else if(nilaiAkhir > 73 && nilaiAkhir<=80){
            nilaiHuruf = "B+";
            System.out.println("Nilai Huruf : " +nilaiHuruf);
        }else if(nilaiAkhir > 65 && nilaiAkhir<=73){
            nilaiHuruf = "B";
            System.out.println("Nilai Huruf : " +nilaiHuruf);
        }else if(nilaiAkhir > 60 && nilaiAkhir<=65){
            nilaiHuruf = "C+";
            System.out.println("Nilai Huruf : " +nilaiHuruf);
        }else if(nilaiAkhir > 50 && nilaiAkhir<=60){
            nilaiHuruf = "C";
            System.out.println("Nilai Huruf : " +nilaiHuruf);
        }else if(nilaiAkhir > 39 && nilaiAkhir<=50){
            nilaiHuruf = "D";
            System.out.println("Nilai Huruf : " +nilaiHuruf);
        }else if(nilaiAkhir <= 39){
            nilaiHuruf = "E";
            System.out.println("Nilai Huruf : " +nilaiHuruf);
        }else if(nilaiAkhir < 0 && nilaiAkhir > 100){
            System.out.println("Nilai Invalid, masukkan angka antara 1-100");    
    }
        System.out.println("=================================");
        if(nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")){
            System.out.println("Lulus");
        }else{
            System.out.println("Tidak Lulus");
		}
}
}