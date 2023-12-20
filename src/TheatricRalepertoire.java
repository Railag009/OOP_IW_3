import java.util.*;
public class TheatricRalepertoire {
    ArrayList<Theatre>a;
    TheatricRalepertoire()
    {
        a=new ArrayList<Theatre>();
    }
    void add(Theatre s)
    {
        a.add(s);
    }
    void delete(String name)
    {
        int p = -1;
        for(int i = 0;i<a.size();i++){
            if(name.equalsIgnoreCase(a.get(i).getName()))
                p = i;
        }
        if(p>-1){
            a.remove(p);
            System.out.println("delete performance:" + name);
        }
        else System.out.println("Performance not found.");
    }
    void find(String autor)
    {
        boolean f=false;
        for(int i=0;i<a.size();i++)
        {
            if(autor.equalsIgnoreCase(a.get(i).getAutor()))
            {
                f=true;
                System.out.println(a.get(i).toString());
            }
        }
        if(!f)
        {
            System.out.println("Autor not found.");
        }
    }
    void print()
    {
        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
    }
    void sortByKol(){
        a.sort(Theatre.KolComporator);
    }
    void sortByExperience(){
        a.sort(Theatre.ExpperienceComporator);
    }
    void sortByName(){
        a.sort(Theatre.NameComporator);
    }
    void sortByAdress(){
        a.sort(Theatre.AdressComporator);
    }
    void sortBySubject(){
        a.sort(Theatre.SubjectComporator);
    }
}
