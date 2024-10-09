# majorAssignmentTopic2

How do we move to the previous song? - Abid
import static org.junit.Assert.*;

import org.junit.Test;

public class ArtistTest {

    @Test
    public void testArtistCreation() {
        Artist soloArtist = new Artist("Bruno Mars", true);
        Artist bandArtist = new Artist("Imagine Dragons", false);

        assertEquals("Bruno Mars", soloArtist.getName(), "Artist name should be 'Bruno Mars'.");
        assertTrue(soloArtist.IsSolo(), "Bruno Mars should be a solo artist.");

        assertEquals("Imagine Dragons", bandArtist.getName(), "Artist name should be 'Imagine Dragons'.");
        assertFalse(bandArtist.IsSolo(), "Imagine Dragons should be a band.");
    }
}
