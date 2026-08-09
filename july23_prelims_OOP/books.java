package july23_prelims_OOP;

public class books {
    String title;
    String author;
    int pages;

    public books(String t, String a, int p) {
        this.title = t;
        this.author = a;
        this.pages = p;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println();
    }

    public static void main(String[] args) {
        books b1 = new books("1984", "George Orwell", 382);
        books b2 = new books("The Habbit", "J.R.R Tolkein", 1310);
        books b3 = new books("Harry Potter and the sorcerer's stone", "J.k. Rowling", 309);
        books b4 = new books("The Alchemist", "Paulo Coelho", 208);
        books b5 = new books("The Little Prince", "Antoine de Saint-Exupery", 96);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
    }
}
