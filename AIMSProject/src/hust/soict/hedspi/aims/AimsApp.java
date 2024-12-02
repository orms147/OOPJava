package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart.*;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store.*;

import java.util.Scanner;

public class AimsApp {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        initSetup();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0 -> {
                    exit = true;
                    System.out.println("Good bye!");
                }
                case 1 -> {
                    clearConsole();
                    storeMenu(scanner);
                }
                case 2 -> {
                    clearConsole();
                    updateStoreMenu(scanner);
                }
                case 3 -> {
                    clearConsole();
                    cartMenu(scanner);
                }
                default -> {
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                }
            }
        }
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void initSetup() {
        // Thêm các media vào store
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        store.addMedia(new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f));
        store.addMedia(new DigitalVideoDisc("Aladin", "Animation", 18.99f));
        store.addMedia(new Book("The Valley of Fear", "Detective", 20.00f));
        store.addMedia(new Book("A Living Remedy: A Memoir", "Biography", 202.00f));
        store.addMedia(new Book("On the Origin of Time: Stephen Hawking's Final Theory", "Science", 120.00f));

        CompactDisc cd1 = new CompactDisc();
        cd1.addTrack(new Track("All Night Parking (interlude)", 161));
        cd1.addTrack(new Track("To Be Loved", 403));
        cd1.addTrack(new Track("Woman Like Me", 300));
        store.addMedia(cd1);

        clearConsole();
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            store.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0 -> {
                    clearConsole();
                    back = true;
                }
                case 1 -> handleMediaDetails(scanner);
                case 2 -> handleAddMediaToCart(scanner);
                case 3 -> handlePlayMedia(scanner);
                case 4 -> {
                    clearConsole();
                    cartMenu(scanner);
                }
                default -> {
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                }
            }
        }
    }

    public static void handleMediaDetails(Scanner scanner) {
        boolean foundDetails = false;
        while (!foundDetails) {
            System.out.println("Enter the title of the media (type 0 to stop): ");
            String title = scanner.nextLine();
            if (title.equals("0")) {
                clearConsole();
                break;
            }
            Media media = store.search(title);
            if (media != null) {
                clearConsole();
                System.out.println("Details: ");
                System.out.println(media);
                mediaDetailsMenu(scanner, media);
                foundDetails = true;
            } else {
                System.out.println("***MEDIA NOT FOUND***");
            }
        }
    }

    public static void mediaDetailsMenu(Scanner scanner, Media media) {
        boolean back = false;
        while (!back) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0 -> {
                    clearConsole();
                    back = true;
                }
                case 1 -> cart.addMedia(media);
                case 2 -> {
                    if (media instanceof Disc || media instanceof CompactDisc) {
                        media.play();
                    } else {
                        System.out.println("This type of media is not supported!");
                    }
                }
                default -> {
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                }
            }
        }
    }

    public static void handleAddMediaToCart(Scanner scanner) {
        boolean foundToAdd = false;
        while (!foundToAdd) {
            System.out.println("Enter the title of the media (type 0 to stop): ");
            String title = scanner.nextLine();
            if (title.equals("0")) {
                clearConsole();
                break;
            }
            Media media = store.search(title);
            if (media != null) {
                cart.addMedia(media);
                foundToAdd = true;
            } else {
                System.out.println("***MEDIA NOT FOUND***");
            }
        }
    }

    public static void handlePlayMedia(Scanner scanner) {
        boolean foundToPlay = false;
        while (!foundToPlay) {
            System.out.println("Enter the title of the media (type 0 to stop): ");
            String title = scanner.nextLine();
            if (title.equals("0")) {
                clearConsole();
                break;
            }
            Media media = store.search(title);
            if (media != null) {
                if (media instanceof Disc || media instanceof CompactDisc) {
                    media.play();
                } else {
                    System.out.println("This type of media is not supported!");
                }
                foundToPlay = true;
            } else {
                System.out.println("***MEDIA NOT FOUND***");
            }
        }
    }

    public static void cartMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            cart.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0 -> {
                    clearConsole();
                    back = true;
                }
                case 1 -> handleFilterCart(scanner);
                case 2 -> handleSortCart(scanner);
                case 3 -> handleRemoveMediaFromCart(scanner);
                case 4 -> handlePlayMedia(scanner);
                case 5 -> {
                    clearConsole();
                    cart.empty();
                    System.out.println("Order is created successfully!");
                }
                default -> {
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                }
            }
        }
    }

    public static void handleFilterCart(Scanner scanner) {
        System.out.println("Filter medias in cart by (1) id or (2) title:");
        int filterOption = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        while (!found) {
            if (filterOption == 1) {
                System.out.println("Enter the id to filter (type 0 to stop):");
                int id = scanner.nextInt();
                scanner.nextLine();
                if (id == 0) {
                    clearConsole();
                    break;
                }
                cart.searchById(id);
                found = true;
            } else if (filterOption == 2) {
                System.out.println("Enter the title to filter (type 0 to stop):");
                String title = scanner.nextLine();
                if (title.equals("0")) {
                    clearConsole();
                    break;
                }
                cart.searchByTitle(title);
                found = true;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    public static void handleSortCart(Scanner scanner) {
        System.out.println("Sort medias in cart by (1) title or (2) cost:");
        int sortOption = scanner.nextInt();
        scanner.nextLine();
        if (sortOption == 1) {
            cart.sortMediaByTitle();
        } else if (sortOption == 2) {
            cart.sortMediaByCost();
        } else {
            System.out.println("Invalid option.");
        }
    }

    public static void handleRemoveMediaFromCart(Scanner scanner) {
        boolean foundToRemove = false;
        while (!foundToRemove) {
            System.out.println("Enter the title of the media (type 0 to stop): ");
            String title = scanner.nextLine();
            if (title.equals("0")) {
                clearConsole();
                break;
            }
            Media media = cart.search(title);
            if (media != null) {
                clearConsole();
                cart.removeMedia(media);
                foundToRemove = true;
            } else {
                System.out.println("***MEDIA NOT FOUND***");
            }
        }
    }

    public static void updateStoreMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media");
            System.out.println("2. Remove a media");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0 -> {
                    clearConsole();
                    back = true;
                }
                case 1 -> handleAddMediaToStore(scanner);
                case 2 -> handleRemoveMediaFromStore(scanner);
                default -> {
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                }
            }
        }
    }

    public static void handleAddMediaToStore(Scanner scanner) {
        System.out.println("Enter the category of the media (1) Book, (2) CD, (3) DVD or (0) exit:");
        int categoryChoice = scanner.nextInt();
        scanner.nextLine();
        switch (categoryChoice) {
            case 1 -> {
                System.out.println("Enter book title: ");
                String bookTitle = scanner.nextLine();
                System.out.println("Enter book category: ");
                String bookCategory = scanner.nextLine();
                System.out.println("Enter book cost: ");
                Float bookCost = scanner.nextFloat();
                scanner.nextLine();
                store.addMedia(new Book(bookTitle, bookCategory, bookCost));
            }
            case 2 -> {
                System.out.println("Enter CD title: ");
                String cdTitle = scanner.nextLine();
                System.out.println("Enter CD category: ");
                String cdCategory = scanner.nextLine();
                System.out.println("Enter CD artist: ");
                String cdArtist = scanner.nextLine();
                System.out.println("Enter CD cost: ");
                Float cdCost = scanner.nextFloat();
                scanner.nextLine();
                CompactDisc newCD = new CompactDisc();
                System.out.println("Do you want to add tracks to your CD? (1) Yes (0) No:");
                int addTrack = scanner.nextInt();
                scanner.nextLine();
                if (addTrack == 1) {
                    System.out.println("How many tracks in your CD?");
                    int numTrack = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numTrack; i++) {
                        System.out.println("Your " + (i + 1) + " track: ");
                        System.out.println("Enter track title: ");
                        String trackTitle = scanner.nextLine();
                        System.out.println("Enter track length: ");
                        int trackLength = scanner.nextInt();
                        scanner.nextLine();
                        newCD.addTrack(new Track(trackTitle, trackLength));
                    }
                }
                store.addMedia(newCD);
            }
            case 3 -> {
                System.out.println("Enter DVD title: ");
                String dvdTitle = scanner.nextLine();
                System.out.println("Enter DVD category: ");
                String dvdCategory = scanner.nextLine();
                System.out.println("Enter book cost: ");
                Float dvdCost = scanner.nextFloat();
                scanner.nextLine();
                store.addMedia(new DigitalVideoDisc(dvdTitle, dvdCategory, dvdCost));
            }
            case 0 -> clearConsole();
            default -> System.out.println("Invalid option.");
        }
    }

    public static void handleRemoveMediaFromStore(Scanner scanner) {
        boolean foundToRemove = false;
        while (!foundToRemove) {
            System.out.println("Enter the title of the media (type 0 to stop): ");
            String titleForRemove = scanner.nextLine();
            if (titleForRemove.equals("0")) {
                clearConsole();
                break;
            }
            Media media = store.search(titleForRemove);
            if (media != null) {
                clearConsole();
                store.removeMedia(media);
                foundToRemove = true;
            } else {
                System.out.println("***MEDIA NOT FOUND***");
            }
        }
    }
}