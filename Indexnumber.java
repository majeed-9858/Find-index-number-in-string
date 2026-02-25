import java.util.Scanner;
public class Indexnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = "Programming is fun";
        int index = str1.indexOf('o');
        System.out.println("The index of 'o' in str1 is" + index);
        sc.close();
    }
}