import java.util.Scanner;
public class leapYearCount {
    public static void main(String[] args) {
        int year;
        Scanner Input = new Scanner(System.in);
        System.out.println("enter year:");
        year = Input.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + ": " +"yılı artık bir yıldır...");
        } else if (year % 4 != 0) {
                System.out.println(year + ": " + "yılı artık bir yıl değildir...");
        } else {
                System.out.println("code hatalıdır");
            }
        }
    }

