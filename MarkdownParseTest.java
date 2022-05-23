import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
       assertEquals(2, 1 + 1);
    }

   @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"),links);
    }

    @Test
    public void testGetLinks1() throws IOException{
        Path fileName = Path.of("test5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("url.com", "(`google.com)`", "(google.com)", "(ucsd.edu)") ,links);
    }


    

}


