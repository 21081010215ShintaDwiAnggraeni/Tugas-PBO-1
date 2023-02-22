package tugasgajikaryawan;
import java.util.Scanner;
public class TugasGajiKaryawan {
    public String nama, alamat,departemen, pengalaman, skill;
    public int gaji;
    
    public TugasGajiKaryawan (String nama, String alamat, String departemen, String pengalaman, String skill)
    {
        this.nama = nama;
        this.alamat = alamat;
        this.departemen = departemen;
        this.pengalaman = pengalaman;
        this.skill = skill;
        this.gaji = awalgaji();
    }
    public int awalgaji() {
    int awalgaji = 0;
    switch(departemen) {
        case "1":
            System.out.println("IT: Rp 8.000.000");
            awalgaji += 8000000;
            break;
        case "2":
            System.out.println("HRD: Rp5.000.000");
            awalgaji += 5000000;
            break;
        case "3":
            System.out.println("Finance: Rp4.000.000");
            awalgaji += 4000000;
            break;
    }
    switch(pengalaman) {
        case "1":
            System.out.println("pemula: +Rp 500.000");
            awalgaji += 500000;
            break;
        case "2":
            System.out.println("menengah: +Rp1.000.000");
            awalgaji += 1000000;
            break;
        case "3":
            System.out.println("expert: +Rp2.000.000");
            awalgaji += 2000000;
    }
 switch(skill) {
        case "1":
            System.out.println("web: +1.000.000");
            awalgaji += 1000000;
            break;
        case "2":
            System.out.println("Mobile: +Rp2.000.000");
            awalgaji += 2000000;
            break;
        case "3":
            System.out.println("desktop: +Rp2.500.000");
            awalgaji += 2500000;
    }
    return awalgaji;
    }
    public static void main(String[] args) 
    {
        System.out.println("-------------------------------");
        System.out.println("Program Menghitung Gaji Pegawai"); 
        System.out.println("-------------------------------");
        String nama, alamat, departemen, pengalaman, skill;
        int gaji;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda = "); 
        nama = input.nextLine();
        System.out.print("Alamat Anda = ");
        alamat = input.nextLine();
        System.out.print("Departemen Anda\n 1.IT\n 2.HRD\n 3.Finance\n = ");
        departemen = input.nextLine();
        System.out.print("Pengalaman Anda\n 1.Pemula\n 2.Menengah\n 3.Exper\n = ");
        pengalaman = input.nextLine();
        System.out.print("Skill Anda\n 1.Web\n 2.Mobile\n 3.Desktop\n = ");
        skill = input.nextLine();
    
        TugasGajiKaryawan total_gaji = new TugasGajiKaryawan(nama, alamat, departemen, pengalaman, skill); 
        System.out.println("Gaji yang Anda Terima = Rp "+total_gaji.awalgaji());
}
}


