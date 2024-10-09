public class App {
    public static void main(String[] args) throws Exception {
        
        //creating the artists 
        Artist artist1 = new Artist("Bruno Mars", true); // Bruno Mars is a solo artist
        //artist1.printArtistDetails(); 
        
        Artist artist2 = new Artist("Imagine Dragons", false); // Imagine Dragons is a band
        //artist2.printArtistDetails(); 
        
        //creating the songs
        Song song1 = new Song("Count On Me", artist1, "Doo-Wops & Hooligans", "Folk Music"); 
        //song1.printSongDetails();

        Song song2 = new Song("Bad Liar", artist2, "N/A", "Alternative/Indie");
        //song2.printSongDetails();

        //library
        Library library = new Library(); // Create a Library instance
        library.addSong(song1); // Add songs to the library
        library.addSong(song2);
        library.displayAllSongs(); // Display all songs in the library
    }
}