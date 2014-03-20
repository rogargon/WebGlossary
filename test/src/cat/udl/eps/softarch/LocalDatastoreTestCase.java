package cat.udl.eps.softarch;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import junit.framework.TestCase;

/**
 * @author http://rhizomik.net/~roberto/
 */
public class LocalDatastoreTestCase extends TestCase {

    private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());

    public void setUp() {
        helper.setUp();
    }

    public void tearDown() {
        helper.tearDown();
    }
}
