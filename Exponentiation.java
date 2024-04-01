import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır Sayısıını Giriniz : ");
        n = input.nextInt();

             for ( int i =1; i<=n; i *=4){
                System.out.print(i+",");
            }
        System.out.println();
                for ( int i =1; i<=n; i *=5){
                System.out.print(i+",");
            }
        }
    }
