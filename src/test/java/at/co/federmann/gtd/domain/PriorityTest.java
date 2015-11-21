package at.co.federmann.gtd.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Created by georg on 21.11.15.
 */
public class PriorityTest {

    @Test
    public void testResolvePriority() throws Exception {
        assertTrue(Priority.IGNORE_FOR_NOW == Priority.resolvePriority(0));
        assertTrue(Priority.LOW == Priority.resolvePriority(1));
        assertTrue(Priority.MEDIUM == Priority.resolvePriority(2));
        assertTrue(Priority.HIGH == Priority.resolvePriority(3));
        assertTrue(Priority.URGENT == Priority.resolvePriority(4));
    }

    @Test
    public void testGetId() throws Exception {
        assertEquals(0, Priority.IGNORE_FOR_NOW.getId());
        assertEquals(1, Priority.LOW.getId());
        assertEquals(2, Priority.MEDIUM.getId());
        assertEquals(3, Priority.HIGH.getId());
        assertEquals(4, Priority.URGENT.getId());
    }

    @Test
    public void testGetI18nKey() throws Exception {
        assertEquals("priority.ignore", Priority.IGNORE_FOR_NOW.getI18nKey());
        assertEquals("priority.low", Priority.LOW.getI18nKey());
        assertEquals("priority.medium", Priority.MEDIUM.getI18nKey());
        assertEquals("priority.high", Priority.HIGH.getI18nKey());
        assertEquals("priority.urgent", Priority.URGENT.getI18nKey());
    }
}