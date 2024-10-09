import java.util.*;

public class Playlist {
    List<Song> songs;
    int currentSongIndex;

    public Playlist() {
        songs = new ArrayList<>();
        currentSongIndex = 0;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public Song nextSong() {
        if (songs.isEmpty()) return null;
        currentSongIndex = (currentSongIndex + 1) % songs.size();
        return songs.get(currentSongIndex);
    }

    public Song previousSong() {
        if (songs.isEmpty()) return null;
        currentSongIndex = (currentSongIndex - 1 + songs.size()) % songs.size();
        return songs.get(currentSongIndex);
    }

    public Song shufflePlay() {
        Random rand = new Random();
        currentSongIndex = rand.nextInt(songs.size());
        return songs.get(currentSongIndex);
    }

    public void printPlaylist() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
