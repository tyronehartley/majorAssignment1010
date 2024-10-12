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
    //method to remove song from library
    public void removeSong(Song song){
        songs.remove(song);
    }

    //method to get all songs by an artist
    public void getSongByArtist(Artist target) {
        //library null check
        if (songs.isEmpty()) {
            System.out.println("Sorry! No Songs in the Library");
            return;
        }
        //enhanced loop checking if artist attribute of each song matches target variable, prints
        System.out.println("Songs by this Artist:");
        for (Song song : songs) {
            if(song.artist == target){
            song.printSongDetails();
            }
        }
    }

    public void getSongByAlbum(Album target) {
        //library null check
        if (songs.isEmpty()) {
            System.out.println("Sorry! No Songs in the Library");
            return;
        }

        System.out.println("Songs in this album:");
        //album attribute of song needs to be changed from a String to an Album
        for (Song song : songs) {
            if(song.album == target){
            song.printSongDetails();
            }
        }
        return;

    }
}