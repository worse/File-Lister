package al.crimin;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Stream.of;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        List<Path> results = Files.list(Paths.get(System.getProperty("user.dir")))
                .map(Path::getFileName)
                .collect(Collectors.toList());

        String[] extensionTypes = {".txt", ".csv", ".txt", ".sql"};

        results.stream().filter(
                result -> of(extensionTypes).anyMatch(s -> result.toString().endsWith(s))
        ).forEach(System.out::println);

    }

}