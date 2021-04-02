public class Book {
    public String title;
    public String author;

    public Book(String t) {
        title = t;
        author = "Unknown";
    }

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("Littele Prince", "Antoine de Saint-Exupery");
        Book loveStory = new Book("Choonhyang");

        System.out.println(littlePrince.title + ", " + littlePrince.author);
        System.out.println(loveStory.title + ", " + loveStory.author);
    }
}
