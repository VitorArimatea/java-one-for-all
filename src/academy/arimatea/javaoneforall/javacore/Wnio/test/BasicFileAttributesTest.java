package academy.arimatea.javaoneforall.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        LocalDateTime date = LocalDateTime.now().minusDays(5);
        File file = new File("home/LocalDateMinus.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(isCreated);
        System.out.println(isModified);

        Path path = Paths.get("home/new_file.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
    }
}
