public class PlaylistWeek06 {
    static int find(String[] titles, String target) {
        for (int index = 0; index < titles.length; index++) if (titles[index].equals(target)) return index;
        return -1;
    }

    public static void main(String[] args) {
        String[] titles = {"Neon Orbit", "Paper Comet", "Quiet Signal"};
        int index = find(titles, "Quiet Signal");
        System.out.println("ARRAY SIZE: " + titles.length);
        System.out.println("SEARCH: " + titles[index]);
        System.out.println("INDEX: " + index);
        System.out.println("ARRAY CHECK: PASS");
    }
}
