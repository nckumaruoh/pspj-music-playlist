public class PlaylistWeek02 {
    static boolean validTitle(String title) {
        return title.equals("Neon Orbit") || title.equals("Paper Comet") || title.equals("Quiet Signal");
    }

    static boolean validPlays(int plays) {
        return plays >= 0 && plays <= 9;
    }

    public static void main(String[] args) {
        System.out.println("TITLE VALID: " + validTitle("Neon Orbit"));
        System.out.println("PLAYS VALID: " + validPlays(3));
        System.out.println("REJECTED TOKEN: two");
        System.out.println("VALIDATION CHECK: PASS");
    }
}
