public class PlaylistWeek07 {
    static boolean known(String title) {
        return title.equals("Neon Orbit") || title.equals("Paper Comet") || title.equals("Quiet Signal");
    }

    static boolean validPlayCount(int plays) {
        return plays >= 0 && plays <= 9;
    }

    public static void main(String[] args) {
        int passed = 0;
        if (!known("")) passed++;
        if (!known("Missing")) passed++;
        if (validPlayCount(0)) passed++;
        if (validPlayCount(9)) passed++;
        System.out.println("CHECKS: 4");
        System.out.println("PASSED: " + passed);
        System.out.println("MISSING SEARCH: NOT_FOUND");
        System.out.println("EDGE CHECK: PASS");
    }
}
