class Movie {
    String name;
    String director;

    public void printName() {
        System.out.println("movie name: " + this.name);
    }

    public void printDirector() {
        System.out.println("director: " + this.director);
    }

    // non parameterized constructor
    Movie() {
        System.out.println("new movie released! --> non parameterized constructor");
    }

    // parameterized constructor
    Movie(String name, String director) {
        System.out.println("new movie released! --> parameterized constructor");
        this.name = name;
        this.director = director;
    }

    // copy constructor
    Movie(Movie movie1) {
        System.out.println("new movie released! --> copy constructor");
        this.name = movie1.name;
        this.director = movie1.director;
    }
}

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.name = "pulp fiction";
        movie1.director = "quentin tarantino";

        movie1.printName();
        movie1.printDirector();
        System.out.println();

        Movie movie2 = new Movie();
        movie2.name = "casablanca";
        movie2.director = "michael curtiz";

        movie2.printName();
        movie2.printDirector();
        System.out.println();

        Movie movie3 = new Movie("dial M for murder", "alfred hitchcock");

        movie3.printName();
        movie3.printDirector();
        System.out.println();

        Movie movie4 = new Movie(movie1);

        movie4.printName();
        movie4.printDirector();
        System.out.println();
    }
}