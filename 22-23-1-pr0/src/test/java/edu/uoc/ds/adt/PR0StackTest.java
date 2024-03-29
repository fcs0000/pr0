package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr0q;

    @Before
    public void setUp() {
        this.pr0q = new PR0Stack();
        assertNotNull(this.pr0q.getStack());
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void stackTest() {

        this.pr0q.fillStack();
        assertEquals(this.pr0q.CAPACITY, this.pr0q.getStack().size());

        //assertEquals(this.pr0q.clearAllStack(), new String("8 7 6 5 4 3 2 1 0 "));
        assertEquals(this.pr0q.clearAllStack(), new String("0.000 -0.174 -0.342 -0.500 -0.643 -0.766 -0.866 -0.940 -0.985 -1.000 -0.985 -0.940 -0.866 -0.766 -0.643 -0.500 -0.342 -0.174 0.000 0.174 0.342 0.500 0.643 0.766 0.866 0.940 0.985 1.000 0.985 0.940 0.866 0.766 0.643 0.500 0.342 0.174 0.000 "));

        assertEquals(0, this.pr0q.getStack().size());
    }
}
