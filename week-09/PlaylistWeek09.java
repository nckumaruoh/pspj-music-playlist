public class PlaylistWeek09 {
    static class Track {
        final String title;
        final int plays;

        Track(String title, int plays) {
            this.title = title;
            this.plays = plays;
        }
    }

    static class Playlist {
        final String name;
        final Track[] tracks;

        Playlist(String name, Track[] tracks) {
            this.name = name;
            this.tracks = tracks;
        }
    }

    public static void main(String[] args) {
        Track[] tracks = {new Track("Neon Orbit", 3), new Track("Paper Comet", 1), new Track("Quiet Signal", 2)};
        Playlist playlist = new Playlist("Lab Set", tracks);
        int plays = 0;
        for (Track track : playlist.tracks) plays += track.plays;
        System.out.println("PLAYLIST: " + playlist.name);
        System.out.println("TRACK OBJECTS: " + playlist.tracks.length);
        System.out.println("SESSION PLAYS: " + plays);
    }
}
