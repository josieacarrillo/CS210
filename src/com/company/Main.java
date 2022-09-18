//Josie Carrillo, red id: 822588384
// already did assignment in JAVA

package com.company;
import java.util.Random;
import java.util.Scanner;

class SuperLotto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Quicky Mart, what is your name?");

        String name = scanner.nextLine();

        System.out.println("Hello,"+ name);
        System.out.println("How many tickets would you like?");

        int number = scanner.nextInt();

        for ( int i = 0; i < number; i++){
            int[] ticket = quickPick();
            printTicket(ticket);
            System.out.println();
        }




    }

    public static int[] quickPick(){
        Random rand = new Random();
        int firstUpperBound = 46;
        int secondUpperBound = 26;



        int[] arr = new int[7];
        int int_random2 = rand.nextInt(secondUpperBound);

        for(int i = 0; i < 6; i++){

            int int_random1 = rand.nextInt(firstUpperBound);
            boolean checker = checkArr(arr, int_random1);


            if (checker != true){
                arr[i] = int_random1;
               // System.out.print(arr[i]+" ");
            }
            else {
                i--;
            }

            arr[arr.length-1]  = int_random2 + 1;
           // System.out.println(int_random2 + 1);

        }

        arr[arr.length-1]  = int_random2 + 1;
        return arr;
    }

    public static void printTicket(int[] ticket){

        for(int i=0; i< ticket.length-1; i++){
            System.out.print( ticket[i]+ " ");

        }
    }

    public static boolean checkArr(int[] arr, int n){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }


}
