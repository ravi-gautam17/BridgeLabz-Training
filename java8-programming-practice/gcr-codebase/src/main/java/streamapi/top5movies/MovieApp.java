package streamapi.top5movies;

import java.util.*;
import java.util.stream.Collectors;

public class MovieApp {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 8.9, 2024),
                new Movie("Movie B", 7.5, 2022),
                new Movie("Movie C", 9.1, 2023),
                new Movie("Movie D", 8.7, 2021),
                new Movie("Movie E", 9.0, 2025),
                new Movie("Movie F", 8.8, 2024),
                new Movie("Movie G", 7.9, 2023)
        );

        List<Movie> top5TrendingMovies =
                movies.stream()
                        // 1. Filter recent movies
                        .filter(movie -> movie.getReleaseYear() >= 2022)

                        // 2. Sort by rating (descending), then by release year (descending)
                        .sorted(Comparator
                                .comparingDouble(Movie::getRating).reversed()
                                .thenComparing(Movie::getReleaseYear, Comparator.reverseOrder()))

                        // 3. Limit to top 5
                        .limit(5)

                        // Collect result
                        .collect(Collectors.toList());

        top5TrendingMovies.forEach(System.out::println);
    }
}
