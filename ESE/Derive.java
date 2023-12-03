// Production Class Diagram question

class Production {
    String title;
    String director;
    String writer;

    Production()
    {
        title = "NULL";
        director = "NULL";
        writer = "NULL";
    }

    Production(String t, String d, String w)
    {
        title = t;
        director = d;
        writer = w;
    }

    String getTitle() {
        return title;
    }
    String getDirector() {
        return director;
    }
    String getWriter() {
        return writer;
    }

    void setTitle(String title)
    {
        this.title = title;
    }
    void setDirector(String director)
    {
        this.director = director;
    }
    void setWriter(String writer)
    {
        this.writer = writer;
    }
    void display()
    {
        System.out.println("Title: " + title + "\nDirector: " + director + "\nWriter: " + writer);
    }
}

class Play extends Production {
    int performances;

    Play() {
        super();
        performances = 0;
    }

    Play(String t, String d, String w, int p)
    {
        super(t,d,w);
        performances = p;
    }

    int getPerformances() {
        return performances;
    }

    void setPerformances(int p) {
        performances = p;
    }

    void display()
    {
        super.display();
        System.out.println("Performances: " + performances);
    }
}

class Film extends Production {
    int BoxOfficeGross;

    Film() {
        super();
        BoxOfficeGross = 0;
    }

    Film(String t, String d, String w, int g)
    {
        super(t,d,w);
        BoxOfficeGross = g;
    }

    int getBoxOfficeGross() {
        return BoxOfficeGross;
    }

    void setBoxOfficeGross(int g) {
        BoxOfficeGross = g;
    }

    void display()
    {
        super.display();
        System.out.println("Box Office Gross: " + BoxOfficeGross);
    }
}


public class Derive {
    public static void main(String[] args){
        System.out.println("Production: ");
        Production P = new Production("Oppenheimer", "Nolan", "ABC");
        P.display();

        System.out.println("\n\nPlay: ");
        Play pl = new Play();
        pl.setTitle("ABCDEF");
        pl.setWriter("Mr. X");
        pl.setDirector("Mr. Y");
        pl.setPerformances(10);

        pl.display();


        System.out.println("\n\nFilm: ");
        Film f = new Film("CWC", "Test Data", "Test Data pt.2", 10000);
        f.display();
    }
}