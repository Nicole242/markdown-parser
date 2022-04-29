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
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        
        //Path test = Path.of("test-file.md");
        assertEquals(List.of("https://something.com", "some-thing.html"), 
                            MarkdownParse.getLinks(content));
    }
}
