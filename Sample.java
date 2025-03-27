import java.util.*;
class Sample{
    static void myMethod(String name,int reat){
        System.out.println("prodect : "+name);
        System.out.println("reat : "+reat);
        Scanner scan = new Scanner(System.in);
        System.out.print("how many whant you Enter : ");
        int pack = scan.nextInt();
        int Total = reat * pack;
        System.out.println("Total = "+Total);
    }
    public static void main(String[]args){
        System.out.print("Now only one menu Enter the menu number 5 : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (5 == num){
            myMethod("bingo cips",10);
            
        }
        else{
            System.out.println("not avalible student Data");
        }

    }
}