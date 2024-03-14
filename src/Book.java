/*
Step 1: Create a class 'Book' with the properties 'title', 'author', and 'isbn'. Implement getter and setter methods for these properties.

Step 2: Override the toString method of the 'Book' class to display the book information in a readable format.

Step 3: Create a class 'Library' with an array of 'Book' objects.

Step 4: Override the toString method of the 'Library' class to display the information of the 'Library' in a readable format.

Step 5: Create an instance of the 'Library' class with an array of 'Book' objects. Print the library information to the console.
 */

public class Book {

    private String title;
    private String author;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }


}
