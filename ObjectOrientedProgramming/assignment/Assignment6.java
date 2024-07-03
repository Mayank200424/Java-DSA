package ObjectOrientedProgramming.assignment;

public class Assignment6 {
    public static void main(String[] args) {

        Movie m1 = new Movie();
        Movie[] movies =  new Movie[5];
        movies[0] = new Movie("shetan","aaa","2Star");
        movies[1] = new Movie("12th Fail","bbb");
        movies[2] = new Movie("DAEU","ccc","5Star");
        movies[3] = new Movie("RRR","ddd","1Star");
        movies[4] = new Movie("Golmal","eee","4Star");

        Movie[] FiveStartMovies = m1.get5starMovie(movies);
        for(int i=0;i<FiveStartMovies.length;i++)
        {
            System.out.println(FiveStartMovies[i].title + " " + FiveStartMovies[i].rating);
        }

    }
}

class Movie {
     String title;
     String studio;
     String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "5Star";
    }

    public Movie() {


    }

    public Movie[] get5starMovie(Movie[] movies)
    {
        int c = 0;
        for(int i = 0; i < movies.length; i++)
        {
            if(movies[i].rating.equals("5Star"))
            {
                c++;
            }
        }
        Movie[] fivestartMovies = new Movie[c];
        int j = 0;
        for(int i=0; i<movies.length;i++)
        {
            if(movies[i].rating.equals("5Star"))
            {
                fivestartMovies[j++] = movies[i];
            }
        }
        return fivestartMovies;
    }
}
