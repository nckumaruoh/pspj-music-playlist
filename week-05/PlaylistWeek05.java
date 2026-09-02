public class PlaylistWeek05 {
    static int find(String[] ids, String target) {
        for (int index = 0; index < ids.length; index++) if (ids[index].equals(target)) return index;
        return -1;
    }

    public static void main(String[] args) {
        String[] ids = {"A01", "A02", "A03"};
        int[] durations = {184, 201, 145};
        int index = find(ids, "A02");
        System.out.println("FIND: " + ids[index]);
        System.out.println("DURATION SECONDS: " + durations[index]);
        System.out.println("METHODS USED: 3");
    }
}
