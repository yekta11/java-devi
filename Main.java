package JavaApplication16;

import java.util.Scanner;

public class Main { 


    public static void main(String[] args) {

        Scanner boyut = new Scanner(System.in);

        int A1x,A2y,B1x,B2y;

        System.out.println("1.Matrisin satır sayısını giriniz.");
         A1x = boyut.nextInt();

        System.out.println("1.Matrisin sütun sayısını giriniz.");
         A2y = boyut.nextInt();

        System.out.println("2.Matrisin satır sayısını giriniz.");
         B1x = boyut.nextInt();

        System.out.println("2.Matrisin sütun sayısını giriniz.");
         B2y = boyut.nextInt();

         int matris1 [][] = new int [A1x][A2y];
         int matris2 [][] = new int [B1x][B2y];


         Scanner elamanGir = new Scanner(System.in);

        System.out.println("1.Matrisin elemanlarını giriniz.");

        for (int i=0 ; i<A1x ; i++){
            for (int j=0 ; j<A2y ; j++){
                System.out.print("matris1 ["+(i+1)+"]"+"["+(j+1)+"]"+"=");
                matris1[i][j] = elamanGir.nextInt();
            }
        }


        for (int i=0 ; i<A1x ; i++){
            for (int j=0 ; j<A2y ; j++){
                System.out.print(matris1[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("2.Matrisin elemanlarını giriniz.");

        for (int i=0 ; i<B1x ; i++){
            for (int j=0 ; j<B2y ; j++){
                System.out.print("matris2 ["+(i+1)+"]"+"["+(j+1)+"]"+"=");
                matris2[i][j] = elamanGir.nextInt();
            }
        }


        for (int i=0 ; i<B1x ; i++){
            for (int j=0 ; j<B2y ; j++){
                System.out.print(matris2[i][j]+" ");
            }
            System.out.println();
        }




        Scanner giris= new Scanner(System.in);

        int secim=2;

        System.out.println("1 Toplama");
        System.out.println("2 Çarpma");
        secim=giris.nextInt();

        switch(secim){


            case 1:
                if (A1x==B1x && A2y==B2y){

                    System.out.println("Matris toplama işlemine uygundur.");


                    int[][] c = new int[A1x][A2y];
                    for (int i = 0; i < A1x; i++) {
                        for (int j = 0; j < B2y; j++) {
                            c[i][j] = matris1[i][j] + matris2[i][j];
                        }
                    }
                    System.out.println("Matrisler Toplamı");
                    for (int i = 0; i < B1x; i++) {
                        for (int j = 0; j < B2y; j++) {
                            System.out.print(c[i][j] + " ");
                        }
                        System.out.println();
                    }


                }

                else
                    System.out.println("Matris toplama işlemine uygun değildir!");
                break;


            case 2:
                if (A2y==B1x){
                    System.out.println("Matris çarpma işlemine uygundur.");


                    int c [][] = new int[A1x][B2y];
                    for (int i = 0 ; i<A1x ;i++){
                        for (int j = 0; j<B2y ;j++){
                            for (int k=0 ; k<B2y ; k++){

                                c[i][j]=c[i][j]+(matris1[i][k] * matris2[k][j]);
                            }
                        }
                    }

                    System.out.println("Matrisler Çarpımı");

                    for (int i = 0; i < A1x; i++) {
                        for (int j = 0; j < B2y; j++) {
                            System.out.print(c[i][j] + " ");
                        }
                        System.out.println();
                    }

                }


                else
                    System.out.println("Matris çarpma işlemine uygun değildir!");
                break;

                default:
                    System.out.println("Böyle bir seçim yok!");


        }

    }

}