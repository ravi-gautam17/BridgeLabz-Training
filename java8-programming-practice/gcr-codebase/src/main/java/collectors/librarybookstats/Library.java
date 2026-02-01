package collectors.librarybookstats;
import java.util.*;
import java.util.stream.Collectors;

public class Library {
   public static void main(String[] args) {
	   List<Book> books = List.of(
			    new Book("Book1", "Fantasy", 300),
			    new Book("Book2", "Fantasy", 500),
			    new Book("Book3", "Science", 250),
			    new Book("Book4", "Science", 400),
			    new Book("Book5", "History", 350)
			);
	   Map<String, IntSummaryStatistics> statsByGenre =
		        books.stream()
		             .collect(Collectors.groupingBy(
		                 Book::getGenre,
		                 Collectors.summarizingInt(Book::getPages)
		             ));
	   statsByGenre.forEach((genre, stats) -> {
		    System.out.println("Genre: " + genre);
		    System.out.println("  Total Pages   : " + stats.getSum());
		    System.out.println("  Average Pages : " + stats.getAverage());
		    System.out.println("  Max Pages     : " + stats.getMax());
		    System.out.println("  Min Pages     : " + stats.getMin());
		    System.out.println("  Book Count    : " + stats.getCount());
		});

   }
}
