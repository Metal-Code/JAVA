import java.util.Scanner;


class library
{
    private String[] books = {"The Great Gatsby", "1984",
            "To Kill a Mockingbird", "Pride and Prejudice",
            "Moby-Dick", "The Catcher in the Rye",
            "Brave New World", "The Lord of the Rings",
            "Crime and Punishment", "The Hobbit"};

    public void addBook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book you wanna add: ");
        String newBook = sc.nextLine();

        String []newBooks = new String[books.length + 1];

        for(int i=0; i< books.length; i++)
        {
            newBooks[i] = books[i];
        }

        newBooks[books.length] = newBook;
        books = newBooks;
        System.out.println(newBook+" is added to library successfully!!");

    }

    public void issueBook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book you wanna issue");
        String issuedBook = sc.nextLine();

        String []newBooks = new String[books.length-1];
        boolean bookFound = false;
        int index = 0;
        for(int i=0; i< books.length; i++)
        {
            if(books[i].toLowerCase().equalsIgnoreCase(issuedBook))
            {
                bookFound = true;
                System.out.println("The book "+issuedBook+" has been issued");
                continue;
            }
            newBooks[index] = books[i];
            index++;

        }
        if(bookFound)
        {
            books = newBooks;
        }
        else
        {
            System.out.println("Sorry the book "+issuedBook+" is not available to be issued");
        }

    }

    public void returnBook()
    {
        System.out.println("Return the book you issued");
        addBook();
    }

    public void showBook()
    {
        for(String book: books)
        {
            System.out.println(book);
        }
    }
}

public class LibraryManagementSystem
{
    public static void main(String[] args)
    {
        library lib = new library();

        Scanner sc = new Scanner(System.in);



        while(true)
        {
            System.out.println("\nChoose the operation you wanna perform\n" +
                    "1. Display all available books\n" +
                    "2. Issue a books\n" +
                    "3. Return a book\n" +
                    "4. Add a book\n" +
                    "5. Exit the library\n");

            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    lib.showBook();
                    break;

                case 2:
                    lib.issueBook();
                    break;

                case 3:
                    lib.returnBook();
                    break;

                case 4:
                    lib.addBook();
                    break;

                case 5:
                    System.exit(0);
                    sc.close();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }
}
