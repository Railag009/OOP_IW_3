import java.util.*;
public class Theatre {

    String name,genre,autor;
    int kol,act;
    Theatre(String name,String genre,String autor, int kol,int act)
    {
        this.autor=autor;
        this.name=name;
        this.genre=genre;
        this.kol=kol;
        this.act=act;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    public int getAct() {
        return act;
    }

    public void setAct(int act) {
        this.act = act;
    }
    public String toString()
    {
        return "\nName: "+name+"\nAutor: "+ autor+"\nGenre: "+genre+"\nCount of performance per month: "+kol+"\nActs: "+act;
    }
    public static Comparator<Theatre>KolComporator=new Comparator<Theatre>()
    {
        public int compare(Theatre o1, Theatre o2) {
            return o1.getKol()-o2.getKol();
        }
    };
    public static Comparator<Theatre>ExpperienceComporator=new Comparator<Theatre>()
    {
        public int compare(Theatre o1, Theatre o2) {
            return o1.getAct()-o2.getAct();
        }
    };
    public static Comparator<Theatre>NameComporator=new Comparator<Theatre>()
    {
        public int compare(Theatre o1, Theatre o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Theatre>AdressComporator=new Comparator<Theatre>()
    {
        public int compare(Theatre o1, Theatre o2) {
            return o1.getAutor().compareTo(o2.getAutor());
        }
    };
    public static Comparator<Theatre>SubjectComporator=new Comparator<Theatre>()
    {
        public int compare(Theatre o1, Theatre o2) {
            return o1.getGenre().compareTo(o2.getGenre());
        }
    };
    public int compare(Theatre o1, Theatre o2) {
        return 0;
    }

}
