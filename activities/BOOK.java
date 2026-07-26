package activities;

public class BOOK {
    String title;
    String author;
    int pages;

    public BOOK(String t, String a, int p) {
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
        BOOK b1 = new BOOK ("1984","George Orwell", 382);
        BOOK b2 = new BOOK ("The Habbit", "J.R.R Tolkein", 1310);
        BOOK b3 = new BOOK ("Harry Potter and the sorcerer's stone", "J.k. Rowling",309 );
        BOOK b4 = new BOOK ("The Alchemist", "Paulo Coelho",208);
        BOOK b5 = new BOOK ("The Little Prince", "Antoine de Saint-Exupery",96);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();

    }
}
