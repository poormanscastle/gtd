package at.co.federmann.gtd.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by georg on 21.11.15.
 */
public class StatusTest {

    @Test
    public void testGetId() throws Exception {
        assertEquals(0, Status.GREEN.getId());
        assertEquals(1, Status.YELLOW.getId());
        assertEquals(2, Status.RED.getId());
    }

    @Test
    public void testGetI18nKey() throws Exception {
        assertEquals("status.green", Status.GREEN.getI18nKey());
        assertEquals("status.yellow", Status.YELLOW.getI18nKey());
        assertEquals("status.red", Status.RED.getI18nKey());
    }

    @Test
    public void testResolveStatus() throws Exception {
        // test if the mapping from IDs to Status enum works
        assertTrue(Status.GREEN == Status.resolveStatus(0));
        assertTrue(Status.YELLOW == Status.resolveStatus(1));
        assertTrue(Status.RED == Status.resolveStatus(2));
    }
}