class Song {
    String title;
    String artist;
    int year;
    String country;

    public Song() {

    }

    public Song(String s1, String s2, int i, String s3) {
        title = s1;
        artist = s2;
        year = i;
        country = s3;
    }

    public void show() {
        System.out.printf("%s by %s from %s, %d\n", title, artist, country, year);
    }
}

public class Q21 {
    public static void main(String[] args) {
        Song Bangtan = new Song("Dynamite", "BTS", 2021, "Korea");
        Bangtan.show();
    }
}