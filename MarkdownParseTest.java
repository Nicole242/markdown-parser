import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    //private MarkdownParse links = new MarkdownParse();

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException{
        Path fileName = Path.of("/Users/hantian_lin/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        
        assertEquals(List.of("https://something.com", "some-thing.html"), 
                            MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinks2() throws IOException{
        Path fileName = Path.of("/Users/hantian_lin/Documents/GitHub/markdown-parser/mytest-file.md");
        String content = Files.readString(fileName);

        assertEquals(List.of("https://something.com", "some-thing.html",
                    "www.google.com"), 
        MarkdownParse.getLinks(content));
    }
}
