import java.util.Scanner;
public class  TiketBooking{
    public static void main (String[] args ){
        Scanner sc09 = new Scanner (System.in);
        String nama;
        String dataAng = {" devita,syaqira,tika"};
        char jawab;
        int jml=0;

        do {
            System.out.print("Masukkan nama: ");
            nama = sc09.next();
            jml++;
            System.out.print("Apakah nama tersebut anggota vip (Y/t)? ");
            jawab = sc09.next().charAt(0);
        }while (jawab == 'Y' || jawab == 'Y');
        System.out.println("jumlah anggota sekarang = " + jml);
        

    }

}