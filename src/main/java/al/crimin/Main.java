package al.crimin;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        List<Path> results = Files.list(Paths.get("D:/Music/Unreleased/juicewrld"))
                .map(Path::getFileName)
                .collect(Collectors.toList());
        results.forEach(System.out::println);
    }

}