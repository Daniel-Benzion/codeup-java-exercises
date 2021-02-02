package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        while (true) {
            System.out.println("");
            System.out.println("---");
            System.out.println("");
            System.out.println("Select an option: ");
            System.out.println("1: View all movies.");
            System.out.println("2: Search for movie by name.");
            System.out.println("3. Search for movie by category.");
            System.out.println("4: Add a movie to the list.");
            System.out.println("5: Exit.");
            Input input = new Input();
            String option = input.getString();

            if (option.equals("1")) {
                for (Movie movie : movies) {
                    System.out.println("Title: " + movie.getName() + ", Category: " + movie.getCategory());
                }
            } else if (option.equals("2")) {
                System.out.println("Enter a movie title to search:");
                String movieToSearch = input.getString();
                boolean yesMovie = false;
                for (Movie movie : movies) {
                    if (movieToSearch.equalsIgnoreCase(movie.getName())) {
                        yesMovie = true;
                        System.out.println("Title: " + movie.getName() + ", Category: " + movie.getCategory());
                    }
                }
                if (!yesMovie) {
                    System.out.println("Sorry! It looks like we do not have that movie in our database.");
                }
            } else if (option.equals("3")) {
                while (true) {
                    System.out.println("");
                    System.out.println("---");
                    System.out.println("");
                    System.out.println("Please select a category:");
                    System.out.println("1: Drama.");
                    System.out.println("2: Comedy.");
                    System.out.println("3: Musical.");
                    System.out.println("4: Animated.");
                    System.out.println("5: Sci-fi.");
                    System.out.println("6: Horror.");
                    System.out.println("7: Go back to Main Menu.");

                    String category = input.getString();

                    if (category.equals("1")) {
                        System.out.println("Here are all the drama films:");
                        for (Movie movie : movies) {
                            if (movie.getCategory().equals("drama")) {
                                System.out.println(movie.getName());
                            }
                        }
                    } else if (category.equals("2")) {
                        System.out.println("Here are all the comedy films:");
                        for (Movie movie : movies) {
                            if (movie.getCategory().equals("comedy")) {
                                System.out.println(movie.getName());
                            }
                        }
                    } else if (category.equals("3")) {
                        System.out.println("Here are all the musical films:");
                        for (Movie movie : movies) {
                            if (movie.getCategory().equals("musical")) {
                                System.out.println(movie.getName());
                            }
                        }
                    } else if (category.equals("4")) {
                        System.out.println("Here are all the animated films:");
                        for (Movie movie : movies) {
                            if (movie.getCategory().equals("animated")) {
                                System.out.println(movie.getName());
                            }
                        }
                    } else if (category.equals("5")) {
                        System.out.println("Here are all the sci-fi films:");
                        for (Movie movie : movies) {
                            if (movie.getCategory().equals("scifi")) {
                                System.out.println(movie.getName());
                            }
                        }
                    } else if (category.equals("6")) {
                        System.out.println("Here are all the horror films:");
                        for (Movie movie : movies) {
                            if (movie.getCategory().equals("horror")) {
                                System.out.println(movie.getName());
                            }
                        }
                    } else if (category.equals("7")) {
                        break;
                    } else {
                        System.out.println("That is not a valid choice. Please enter a number to make your choice.");
                        System.out.println("Press enter to continue.");
                        input.nextLine();
                    }

                }
            } else if (option.equals("4")) {
                System.out.println("Enter the name of the movie you wish to add:");
                String name = input.getString();
                System.out.println("Enter the category of your movie:");
                String category = input.getString();
                movies = addMovie(movies, name, category);
                System.out.println("Your movie has been added!");
            } else if (option.equals("5")) {
                break;
            } else {
                System.out.println("That is not a valid choice. Please enter a number to make your choice.");
                System.out.println("Press enter to continue.");
                input.nextLine();
            }
        }

    }

    public static Movie[] addMovie(Movie[] array, String name, String category) {
        Movie movie = new Movie(name, category);
        Movie[] newMovieArray = new Movie[array.length + 1];

        System.arraycopy(array, 0, newMovieArray, 0, array.length);

        newMovieArray[array.length] = movie;

        return newMovieArray;
    }
}
