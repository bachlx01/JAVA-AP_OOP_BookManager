import java.util.Scanner;

public class ManagerBook {
    Scanner input = new Scanner(System.in);
    public Book books[] = new Book[20];

    public void addNewBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == (null)) {
                books[i] = book;
                break;
            }
        }


    }

    public void editBookByIndex(int index) {
        System.out.print("Enter name: ");
        String name = input.next();
        books[index].setName(name);

        System.out.print("Enter author: ");
        books[index].setAuthor(input.next());

        System.out.print("Enter price: ");
        books[index].setPrice(input.nextInt());

        System.out.print("Enter amount: ");
        books[index].setAmount(input.nextInt());

        System.out.print("Enter weight: ");
        books[index].setWeight(input.nextDouble());

    }

    public int getMaxPrice() {
        int max = books[0].getPrice();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getPrice() > max) {
                max = books[i].getPrice();
            }
        }
        return max;
    }

    public int getTotalPrice() {
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                sum += books[i].getTotalPrice();
            }
        }
        return sum;
    }

}
