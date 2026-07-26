public class book {
    String title;
    String author;
    int pages;

    public book(String t, String a, int p) {
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
        book b1 = new book ("1984","George Orwell", 382);
        book b2 = new book ("The Habbit", "J.R.R Tolkein", 1310);
        book b3 = new book ("Harry Potter and the sorcerer's stone", "J.k. Rowling",309 );
        book b4 = new book ("The Alchemist", "Paulo Coelho",208);
        book b5 = new book ("The Little Prince", "Antoine de Saint-Exupery",96);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();

    }
}

