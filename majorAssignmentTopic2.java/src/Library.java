import java.util.ArrayList;

public class Library {
    public ArrayList<Song> songs;

    // Constructor
    public Library() {
        songs = new ArrayList<>();
    }

    // Method to add a song to the library
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added: " + song.getTitle());
    }

    // Method to display all songs in the library
    public void displayAllSongs() {
        if (songs.isEmpty()) {
            System.out.println("Sorry! No Songs in the Library");
            return;
        }
        System.out.println("Songs in the Library:");
        for (Song song : songs) {
            song.printSongDetails();
        }
    }
     // Additional methods can be added here (remove song, shuffle)
}