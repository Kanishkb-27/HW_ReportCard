import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter the number of subjects");
        int subjects=sc.nextInt();
        int marks[]=new int[subjects];
        System.out.println("Enter the marks for each subject");
        for(int i=0;i<subjects;i++){
            marks[i]=sc.nextInt();
        }
        for(int j=0;j<subjects;j++){
            sum=sum+marks[j];
        }
        int average=sum/subjects;
        System.out.println("Report Card");
        System.out.println("Name: "+name);
        System.out.printf("%-15s %-10s%n", "Subject", "Marks");
        for(int x=0;x<subjects;x++){
            System.out.printf("%-15s %-10d%n", "Subject-"+x, marks[x]);
        }
        System.out.println("Total="+sum+"    Average="+average);
    }
}