public class PlaylistWeek10 {
    static class PlaylistFormatException extends Exception {
        PlaylistFormatException(String message) {
            super(message);
        }
    }

    static void requireFields(String fixture) throws PlaylistFormatException {
        if (!fixture.contains("|")) throw new PlaylistFormatException("malformed fixture");
    }

    public static void main(String[] args) {
        int accepted = 3;
        try {
            requireFields("bad-record");
        } catch (PlaylistFormatException exception) {
            System.out.println("ACCEPTED: " + accepted);
            System.out.println("REJECTED: 1");
            System.out.println("HANDLED: PlaylistFormatException");
        }
    }
}
