package com.constructors.levelone;

public class BookLibrarySystem {

    public static void main(String[] args) {

        EBookClass ebook = new EBookClass(
                "978-0134685991",
                "Effective Java",
                "Joshua Bloch",
                5.2
        );

        ebook.displayEBookDetails();

        // Modify author using setter
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
