import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PlaylistWeek11 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("playlist_fixture.txt");
        List<String> rows = List.of("A01|Neon Orbit|184|3", "A02|Paper Comet|201|1", "A03|Quiet Signal|145|2");
        Files.write(file, rows, StandardCharsets.UTF_8);
        List<String> restored = Files.readAllLines(file, StandardCharsets.UTF_8);
        System.out.println("WRITTEN: " + rows.size());
        System.out.println("RELOADED: " + restored.size());
        System.out.println("RECORDS MATCH: " + rows.equals(restored));
    }
}
