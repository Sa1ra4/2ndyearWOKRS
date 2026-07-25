public class Book {
    String title;
    String author;
    int pages;

    public Book(String t, String a, int p) {
        this.title = t;
        this.author = a;
        this.pages = p;
    }
    public void display(){
        System.out.println( "Title: " + title);
        System.out.println( "Author: " + author);
        System.out.println( "Pages: " + pages);
        System.out.println();
    }
    public static void main(String[] args)
    {
        Book b1 = new Book ("1984","George Orwell", 382);
        Book b2 = new Book ("The Habbit", "J.R.R Tolkein", 1310);
        Book b3 = new Book ("Harry Potter and the sorcerer's stone", "J.k. Rowling",309 );
        Book b4 = new Book ("The Alchemist", "Paulo Coelho",208);
        Book b5 = new Book ("The Little Prince", "Antoine de Saint-Exupery",96);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();

    }
}

