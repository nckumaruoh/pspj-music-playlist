import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlaylistWeek12 {
    static class Track {
        final String title;
        final int seconds;
        final int plays;

        Track(String title, int seconds, int plays) {
            this.title = title;
            this.seconds = seconds;
            this.plays = plays;
        }
    }

    public static void main(String[] args) {
        List<Track> tracks = new ArrayList<>(List.of(
            new Track("Neon Orbit", 184, 3), new Track("Paper Comet", 201, 1), new Track("Quiet Signal", 145, 2)
        ));
        int seconds = tracks.stream().mapToInt(track -> track.seconds).sum();
        int plays = tracks.stream().mapToInt(track -> track.plays).sum();
        Track mostPlayed = tracks.stream().max(Comparator.comparingInt(track -> track.plays)).orElseThrow();
        System.out.println("TRACKS: " + tracks.size());
        System.out.println("TOTAL SECONDS: " + seconds);
        System.out.println("TOTAL PLAYS: " + plays);
        System.out.println("MOST PLAYED: " + mostPlayed.title);
    }
}
