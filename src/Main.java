import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Create a new book");
        System.out.println("2. Edit a book");
        System.out.println("3. Get the best price book");
        System.out.println("4. Get total of book's price");
        System.out.println("5. Exit");
        int choice = 0;

        ManagerBook library= new ManagerBook();

        while (choice != 5){
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    Book book = new Book();
                    System.out.print("Enter name: ");
                    book.setName(input.next());

                    System.out.print("Enter author: ");
                    book.setAuthor(input.next());

                    System.out.print("Enter price: ");
                    book.setPrice(input.nextInt());

                    System.out.print("Enter amount: ");
                    book.setAmount(input.nextInt());

                    System.out.print("Enter weight: ");
                    book.setWeight(input.nextDouble());

                    library.addNewBook(book);
                    break;

                case 2:
                    System.out.print("Enter index of the book which you want to edit: ");
                    int index = input.nextInt();
                    if (library.books[index] == null){
                        System.out.println("This index unavailable");
                    } else {
                        library.editBookByIndex(index);
                    }
                    break;
                case 3:
                    System.out.println("The best price is: " + library.getMaxPrice());
                    break;
                case 4:
                    System.out.println("Total price is: " + library.getTotalPrice());
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
