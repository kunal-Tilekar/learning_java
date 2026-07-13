import java.util.Scanner;
public class Printf {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        int rno;
        double gpa;
        System.out.println("Enter your roll number");
        rno = sc.nextInt();

        System.out.println("Enter your gpa");
        gpa = sc.nextDouble();

        System.out.printf("Your roll number is %d and your gpa is %f\n ",rno,gpa);

        sc.close();

    }
}
