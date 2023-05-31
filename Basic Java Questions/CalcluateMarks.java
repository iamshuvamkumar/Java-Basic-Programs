import java.util.Scanner;

class CalcluaateMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of Math ");
        float Math = sc.nextFloat();
        System.out.print("Enter Marks of Sci ");
        float Sci = sc.nextFloat();
        System.out.print("Enter Marks of Eng ");
        float Eng = sc.nextFloat();
        System.out.print("Enter Marks of Hindi ");
        float Hindi = sc.nextFloat();
        System.out.print("Enter Marks of Skt ");
        float Skt = sc.nextFloat();

        float per = (Math + Sci + Eng + Hindi + Skt) / 5.0F;
        float total = Math + Sci + Eng + Hindi + Skt;

        System.out.println("A per of Marks is  " + per);
        System.out.println("Total marks of sub " + total);
    }
}
