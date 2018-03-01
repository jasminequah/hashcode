import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Part3 {

  @Rule
  public TemporaryFolder tmpFolder = new TemporaryFolder();

  @Test
  public void runa() {
    assertNotEquals(TestSuiteHelper.readFile("files/null.res"),
        TestSuiteHelper.runMain("files/a.dat", tmpFolder));
  }

  @Test
  public void runb() {
    assertNotEquals(TestSuiteHelper.readFile("files/null.res"),
        TestSuiteHelper.runMain("files/b.dat", tmpFolder));
  }
//
//  @Test
//  public void runc() {
//    assertNotEquals(TestSuiteHelper.readFile("files/null.res"),
//        TestSuiteHelper.runMain("files/c.dat", tmpFolder));
//  }
//
//  @Test
//  public void rund() {
//    assertNotEquals(TestSuiteHelper.readFile("files/null.res"),
//        TestSuiteHelper.runMain("files/d.dat", tmpFolder));
//  }
//
//  @Test
//  public void rune() {
//    assertNotEquals(TestSuiteHelper.readFile("files/null.res"),
//        TestSuiteHelper.runMain("files/e.dat", tmpFolder));
//  }

}
