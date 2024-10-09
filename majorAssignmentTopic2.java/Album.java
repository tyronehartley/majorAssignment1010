import java.util.List;
import java.util.ArrayList;

public class Album {
    String title;
    Artist artist;
    List<Song> songs;
    List<Album> subAlbums;  // For recursive data structure

    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
        this.subAlbums = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void addSubAlbum(Album album) {
        subAlbums.add(album);
    }

    public void listSongsRecursively() {
        for (Song song : songs) {
            System.out.println(song);
        }
        for (Album subAlbum : subAlbums) {
            subAlbum.listSongsRecursively(); // Recursive call
        }
    }
}
