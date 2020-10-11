package al.crimin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ListFiles();
    }

    private static void ListFiles() {
        try {

            List<Path> results = Files.list(Paths.get(System.getProperty("user.dir")))
                    .map(Path::getFileName)
                    .collect(Collectors.toList());

            results.forEach(System.out::println);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}