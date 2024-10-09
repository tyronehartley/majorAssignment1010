public class Song {
    public String title; 
    public Artist artist; 
    public String album; 
    public String genre; 

    //parameterized constructors for songs in album
    public Song(String title, Artist artist, String album, String genre) {
        this.title = title; 
        this.artist = artist; 
        this.album = album; 
        this.genre = genre; 
    }
       
    //parameterized constructors for songs that are singles (not in album)
    public Song(String title, Artist artist, String genre) {
        this.title = title; 
        this.artist = artist; 
        this.album = null;  
        this.genre = genre; 
    }

    // methods - returns the title
    public String getTitle() {
        return title;
    }
    // methods - returns the artistname
    public Artist getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public void printSongDetails() {
        System.out.print("Song: " + title + " | Artist: " + artist.getName());
        if (album != null) {
            System.out.print(" | Album: " + album);
        } else {
            System.out.print(" | Album: N/A (Single)");
        }
        System.out.println(" | Genre: " + genre);
    }

}