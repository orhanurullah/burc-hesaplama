import java.util.Scanner;

public class Main {

    public static void main(String[] ags){
        Scanner scanner = new Scanner(System.in);
        int month, day;
        System.out.println("Burcunuzu Öğrenmek İçin İstenilen Verileri Doğru Girmelisin.");
        System.out.print("Doğduğunuz Ay (Rakamla) : ");
        month = scanner.nextInt();
        System.out.print("Doğduğunuz Gün : ");
        day = scanner.nextInt();

        if(month == 1){
            if(day <= 21){
                System.out.println("Burcunuz : Oğlak");
            }else{
                System.out.println("Burcunuz : Kova");
            }
        }else if(month == 2){
            if(day <= 19){
                System.out.println("Burcunuz : Kova");
            }else{
                System.out.println("Burcunuz : Balık");
            }
        }else if(month == 3){
            if(day <= 20){
                System.out.println("Burcunuz : Balık");
            }else{
                System.out.println("Burcunuz : Koç");
            }
        }else if(month == 4){
            if(day <= 21){
                System.out.println("Burcunuz : Koç");
            }else{
                System.out.println("Burcunuz : Boğa");
            }
        }else if(month == 5){
            if(day <= 21){
                System.out.println("Burcunuz : Boğa");
            }else{
                System.out.println("Burcunuz : İkizler");
            }
        }else if(month == 6){
            if(day <= 22){
                System.out.println("Burcunuz : İkizler");
            }else{
                System.out.println("Burcunuz : Yengeç");
            }
        }else if(month == 7){
            if(day <= 22){
                System.out.println("Burcunuz : Yengeç");
            }else{
                System.out.println("Burcunuz : Aslan");
            }
        }else if(month == 8){
            if(day <= 23){
                System.out.println("Burcunuz : Aslan");
            }else{
                System.out.println("Burcunuz : Başak");
            }
        }else if(month == 9){
            if(day <= 22){
                System.out.println("Burcunuz : Başak");
            }else{
                System.out.println("Burcunuz : Terazi");
            }
        }else if(month == 10){
            if(day <= 22){
                System.out.println("Burcunuz : Terazi");
            }else{
                System.out.println("Burcunuz : Akrep");
            }
        }else if(month == 11){
            if(day <= 21){
                System.out.println("Burcunuz : Akrep");
            }else{
                System.out.println("Burcunuz : Yay");
            }
        }else if(month == 12){
            if(day <= 21){
                System.out.println("Burcunuz : Yay");
            }else{
                System.out.println("Burcunuz : Oğlak");
            }
        }
    }
}
