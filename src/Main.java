import java.util.*;
public class Main {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner scL = new Scanner(System.in);
        TheatricRalepertoire ts=new TheatricRalepertoire();
        System.out.println("Enter count of performance: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Name: ");
            String name = scL.nextLine();
            System.out.println("Genre: ");
            String genre = scL.nextLine();
            System.out.println("Autor: ");
            String autor = scL.nextLine();
            System.out.println("Count of performance per month: ");
            int kol=sc.nextInt();
            System.out.println("Count of acts: ");
            int act=sc.nextInt();
            Theatre t=new Theatre(name,autor,genre,kol,act);
            ts.add(t);
        }
        System.out.println("0-End  1-Sort  2-Add  3-Delete 4-Find");
        int mode=sc.nextInt();
        while(mode!=0)
        {
            if(mode==1)
            {
                System.out.println("\n0-Name  1-Genre  2-Autor  3-Count  4-Act");
                int f=sc.nextInt();
                if(f==0) {
                    ts.sortByName();
                    ts.print();
                }
                if(f==1) {
                    ts.sortByAdress();
                    ts.print();
                }
                if(f==2){
                    ts.sortBySubject();
                    ts.print();
                }
                if(f==3){
                    ts.sortByKol();
                    ts.print();
                }
                if(f==4){
                    ts.sortByExperience();
                    ts.print();
                }
            }
            if(mode==2)
            {
                System.out.println("Name: ");
                String name = scL.nextLine();
                System.out.println("Genre: ");
                String genre = scL.nextLine();
                System.out.println("Autor: ");
                String autor = scL.nextLine();
                System.out.println("Count of performance per month: ");
                int kol=sc.nextInt();
                System.out.println("Count of acts: ");
                int act=sc.nextInt();
                Theatre t=new Theatre(name,autor,genre,kol,act);
                ts.add(t);
            }
            if(mode==3)
            {
                System.out.println("Who delete by name?");
                String a = scL.nextLine();
                ts.delete(a);
            }
            if(mode==4)
            {
                System.out.println("Find autor: ");
                String b = scL.nextLine();
                ts.find(b);
            }
            System.out.println("0-End  1-Sort  2-Add  3-Delete  4-Find");
            mode=sc.nextInt();
        }
        ts.print();

    }
}
