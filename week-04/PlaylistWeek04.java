public class PlaylistWeek04 {
    public static void main(String[] args) {
        String[] commands = {"LIST", "STATS", "EXIT"};
        for (String command : commands) System.out.println("COMMAND: " + command);
        System.out.println("ITERATIONS: " + commands.length);
        System.out.println("EXITED: true");
    }
}
