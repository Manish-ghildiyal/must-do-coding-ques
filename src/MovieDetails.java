import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class MovieDetails {

    public static void main(String[] args) {

        String[] movies = { "Shawshank Redemption*1994*Tim Robbins*2.36", "The Godfather*1972*Al Pacino*2.92",
                "Raging Bull*1980*Robert De Niro*2.15", "Million Dollar Baby*2004*Hilary Swank*2.2",
                "Straight Outta Compton*2015*Jason Mitchell*2.45" };
        MovieDetails detailsObject = new MovieDetails();
        detailsObject.list_movie_details(movies);
    }

    public void list_movie_details(String[] movies) {
        String[] titles = new String[movies.length];
        int[] years = new int[movies.length];
        String[] stars = new String[movies.length];
        float[] runtimes = new float[movies.length];

        int counter = 0;
        for (String movie: movies) {
            try {
                String raw = movie;
                StringTokenizer st = new StringTokenizer((String) raw, "*");
                titles[counter] = st.nextToken();
                years[counter] = Integer.parseInt(st.nextToken());
                stars[counter] = st.nextToken();
                runtimes[counter] = Float.parseFloat(st.nextToken());
                if (st.hasMoreTokens()) {
                    throw new NoSuchElementException();
                }
            } catch (NoSuchElementException exception) {
                System.out.println(exception);
            } catch (Exception exception) {
                System.out.println(exception);
            }
            counter++;
        }
        System.out.println("-----MOVIES-----\n");
        for (String title: titles) {
            System.out.println(title + "\n");
        }
        System.out.println("-----YEARS-----\n");
        for (int year: years) {
            System.out.println(year + "\n");
        }
        System.out.println("-----STARS-----\n");
        for (String star: stars) {
            System.out.println(star + "\n");
        }
        System.out.println("-----RUNTIMES-----\n");
        for (float runtime: runtimes) {
            System.out.println(runtime + "\n");
        }
    }
}