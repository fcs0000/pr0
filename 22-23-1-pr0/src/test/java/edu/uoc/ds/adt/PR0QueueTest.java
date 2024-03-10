package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static edu.uoc.ds.adt.PR0Queue.funcioTrig;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;

      @Before
    public void setUp() {
        this.pr0q = new PR0Queue();
        assertNotNull(this.pr0q.getQueue());

    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void queueTest() {

        this.pr0q.fillQueue();
        assertEquals(this.pr0q.CAPACITY, this.pr0q.getQueue().size());

        assertEquals(this.pr0q.clearFullQueue(), new String("0.000 0.174 0.342 0.500 0.643 0.766 0.866 0.940 0.985 1.000 0.985 0.940 0.866 0.766 0.643 0.500 0.342 0.174 0.000 -0.174 -0.342 -0.500 -0.643 -0.766 -0.866 -0.940 -0.985 -1.000 -0.985 -0.940 -0.866 -0.766 -0.643 -0.500 -0.342 -0.174 0.000 "));
        assertEquals(0, this.pr0q.getQueue().size());
    }

}
