package at.co.federmann.gtd.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by georg on 22.11.15.
 */
public class ProgressTest {

    @Test
    public void testGetId() throws Exception {
        assertEquals(new Integer(0), Progress.OPEN.getId());
        assertEquals(new Integer(1), Progress.IN_PROGRESS.getId());
        assertEquals(new Integer(2), Progress.POSTPONED.getId());
        assertEquals(new Integer(3), Progress.WAITING.getId());
        assertEquals(new Integer(4), Progress.CLARIFY.getId());
        assertEquals(new Integer(5), Progress.REJECTED.getId());
        assertEquals(new Integer(6), Progress.CLOSED.getId());
        assertEquals(new Integer(7), Progress.DONE.getId());
        assertEquals(new Integer(8), Progress.REOPENED.getId());
    }

    @Test
    public void testGetI18nKey() throws Exception {
        assertEquals("progress.open", Progress.OPEN.getI18nKey());
        assertEquals("progress.in_progress", Progress.IN_PROGRESS.getI18nKey());
        assertEquals("progress.postponed", Progress.POSTPONED.getI18nKey());
        assertEquals("progress.waiting", Progress.WAITING.getI18nKey());
        assertEquals("progress.clarify", Progress.CLARIFY.getI18nKey());
        assertEquals("progress.rejected", Progress.REJECTED.getI18nKey());
        assertEquals("progress.closed", Progress.CLOSED.getI18nKey());
        assertEquals("progress.done", Progress.DONE.getI18nKey());
        assertEquals("progress.reopened", Progress.REOPENED.getI18nKey());
    }

    @Test
    public void testResolveProgress() throws Exception {
        assertEquals(Progress.OPEN, Progress.resolveProgress(new Integer(0)));
        assertEquals(Progress.IN_PROGRESS, Progress.resolveProgress(new Integer(1)));
        assertEquals(Progress.POSTPONED, Progress.resolveProgress(new Integer(2)));
        assertEquals(Progress.WAITING, Progress.resolveProgress(new Integer(3)));
        assertEquals(Progress.CLARIFY, Progress.resolveProgress(new Integer(4)));
        assertEquals(Progress.REJECTED, Progress.resolveProgress(new Integer(5)));
        assertEquals(Progress.CLOSED, Progress.resolveProgress(new Integer(6)));
        assertEquals(Progress.DONE, Progress.resolveProgress(new Integer(7)));
        assertEquals(Progress.REOPENED, Progress.resolveProgress(new Integer(8)));
    }
}