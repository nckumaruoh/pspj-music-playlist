public class PlaylistWeek08 {
    static int totalSeconds(int[] durations, int index) {
        if (index == durations.length) return 0;
        return durations[index] + totalSeconds(durations, index + 1);
    }

    public static void main(String[] args) {
        int[] durations = {184, 201, 145};
        System.out.println("RECURSIVE TRACKS: " + durations.length);
        System.out.println("RECURSIVE SECONDS: " + totalSeconds(durations, 0));
        System.out.println("BASE CASE: true");
    }
}
