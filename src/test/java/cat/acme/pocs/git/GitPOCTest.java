package cat.acme.pocs.git;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/** Unit test for simple App. */
public class GitPOCTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GitPOCTest(final String testName) {
        super(testName);
    }

    /** @return the suite of tests being tested */
    public static Test suite() {
        return new TestSuite(GitPOCTest.class);
    }

    /** Rigourous Test :-) */
    public void testGitPOC() {
        TestCase.assertTrue(true);
    }

}
