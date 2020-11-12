class Book {
    void display() {
        System.out.println("The Theory of Everything");
    }
}

class Reference_Book extends Book {
    void display() {
        System.out.println("Author - Stephen Hawking");
    }
}

class Magazine extends Book {
    void display() {
        System.out.println("The Verge");
    }
}

class Inherit {
    public static void main(String args[]) {
        Book B;
        B = new Book();
        B.display();
        B = new Reference_Book();
        B.display();
        B = new Magazine();
        B.display();
    }
}