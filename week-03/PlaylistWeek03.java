import java.util.Locale;

public class PlaylistWeek03 {
    static String badge(int plays) {
        return plays == 6 ? "STEADY" : "REVIEW";
    }

    public static void main(String[] args) {
        int total = 3 + 1 + 2;
        System.out.println("TOTAL PLAYS: " + total);
        System.out.println("AVERAGE PLAYS: " + String.format(Locale.ROOT, "%.2f", total / 3.0));
        System.out.println("BADGE: " + badge(total));
    }
}
