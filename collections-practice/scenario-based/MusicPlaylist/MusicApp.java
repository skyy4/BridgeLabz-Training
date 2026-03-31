package MusicPlaylist;

import java.util.*;

class Song {
    String n;

    Song(String n) {
        this.n = n;
    }
}

class SongAlreadyExistsException extends Exception {
    SongAlreadyExistsException(String m) {
        super(m);
    }
}

class Playlist {
    LinkedList<Song> l = new LinkedList<>();
    Stack<Song> h = new Stack<>();
    Set<String> s = new HashSet<>();

    void add(Song so) throws SongAlreadyExistsException {
        if (!s.add(so.n))
            throw new SongAlreadyExistsException("Song exists");
        l.add(so);
    }

    void play() {
        Song so = l.poll();
        h.push(so);
        System.out.println("Playing " + so.n);
    }
}

public class MusicApp {
    public static void main(String[] a) {
        try {
            Playlist p = new Playlist();
            p.add(new Song("A"));
            p.add(new Song("B"));
            p.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
