package Java2_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    List<String> movies =  new ArrayList<>();

    public List<String> addList(String name){
        movies.add(name);
        return movies;
    }

    public void printList(){
        System.out.println(movies);
    }

    public List<String> deleteMovie(String name){
        boolean isRemove = movies.remove(name);
        if (isRemove == true) {
            System.out.println("Deleted successfully\n");
        }
        else {
            System.out.println("Not movie on list\n");
        }
        return movies;
    }

    public void findMovie(String name){
        System.out.println("Does list contain movie " + name +" ? :"+movies.contains(name));
        if (movies.contains(name) == true) {
            System.out.println("index of " + name + ": " + movies.indexOf(name));
        }
        else {
            System.out.println("Not movie on list\n");
        }
    }

    public List<String> updateMovie(String beforeName, String afterName){
        int i = movies.indexOf(beforeName);
        boolean isRemove = movies.remove(beforeName);
        if (isRemove == true) {
            movies.add(i, afterName);
        }
        else {
            System.out.println("Not movie on list\n");
        }
        return movies;
    }

    public static void main(String[] args) {
        int n;
        String movie;
        MovieList l1 = new MovieList();
        Scanner in = new Scanner(System.in);
        do {
            do {
                System.out.print("Enter 1: add List\n" +
                        "Enter 2: print List\n" +
                        "Enter 3: update Movie\n" +
                        "Enter 4: delete Movie\n" +
                        "Enter 5: find Movie\n" +
                        "Enter 0: to End\n" +
                        "Enter: ");
                n = in.nextInt();
            } while (n < 0 || n > 5);
            switch (n) {
                case 1:
                    System.out.print("Enter movie: ");
                    movie = in.next();
                    l1.addList(movie);
                    break;
                case 2:
                    l1.printList();
                    break;
                case 3:
                    String afMovie;
                    System.out.print("Enter movie: ");
                    movie = in.next();
                    System.out.print("Enter update movie: ");
                    afMovie = in.next();
                    l1.updateMovie(movie,afMovie);
                    break;
                case 4:
                    System.out.print("Enter movie: ");
                    movie = in.next();
                    l1.deleteMovie(movie);
                    break;
                case 5:
                    System.out.print("Enter movie: ");
                    movie = in.next();
                    l1.findMovie(movie);
                    break;
            }
        }while (n != 0);
    }

}
