import java.util.Scanner;

public class BioskopWithScanner05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu = 0;
        String nama, next;

        String[][] penonton = new String [4][2];

        for (int i = 0; i < penonton.length; i++){
            for (int j = 0; j < penonton[i].length; j++){
                penonton[i][j] = "******";
            }
        }

        while (menu != 3){
            System.out.println("Pilih menu: "); 
            System.out.println("1 untuk masukkan data.");
            System.out.println("2 untuk tampilkan daftar.");
            System.out.println("3 untuk exit.");       

        while (true){
            menu = sc.nextInt();
            if (menu == 1 || menu == 2 || menu == 3){
                break;
            } else {
                System.out.println("Input tidak valid, masukkan ulang!");
                continue;
            }
        }

        switch (menu){
            case 1:
            while (true) {
                System.out.println(); 
                System.out.print("Masukkan nama: ");
                nama = sc.next();
                while (true){
                while (true){
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    if (baris <= penonton.length)
                    break;
                    System.out.println("Baris tidak tersedia, coba lagi!");
                }
                while (true){System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                if (kolom <= penonton[0].length)
                    break;
                    System.out.println("Kolom tidak tersedia, coba lagi!");
                }
                if (penonton[baris-1][kolom-1].equals("******")){
                    break;                    
                }
                System.out.println("Maaf, kursi yang anda tempatkan sudah diisi! Coba lagi!");
                }   
                sc.nextLine();
                penonton [baris-1] [kolom-1] = nama;
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("n")) {
                    System.out.println(); 
                    break;
                }
            }
            break;
            case 2:
            System.out.println(); 
            for (int i = 0; i < penonton.length; i++) {
                System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton [i]));
            }
            System.out.println();
            break;

            case 3:
            break;
        }
        }
    }
}