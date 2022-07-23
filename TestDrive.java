 class Movie {
    String tittle;
    String genre;
    int rating;

     void playIt() {
         System.out.println("Проигрывание фильма");
     }
}
public class TestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.tittle ="Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.tittle = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.tittle = "Байт-Клуб";
        three.genre = "Веслеая трагедия";
        three.rating = 10;
    }
}
