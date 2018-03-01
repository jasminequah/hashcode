import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.assertEquals;

public class Part3 {

  @Rule
  public TemporaryFolder tmpFolder = new TemporaryFolder();

  @Test
  public void runa() {
    assertEquals(TestSuiteHelper.readFile("testcases/outputs/turtle_cluster_1.res"),
        TestSuiteHelper.runMain("files/a.dat", tmpFolder));
  }

  @Test
  public void runb() {
    assertEquals(TestSuiteHelper.readFile("testcases/outputs/turtle_cluster_2.res"),
        TestSuiteHelper.runMain("files/b.dat", tmpFolder));
  }

  @Test
  public void runc() {
    assertEquals(TestSuiteHelper.readFile("e.res"),
        TestSuiteHelper.runMain("files/c.dat", tmpFolder));
  }

  @Test
  public void rund() {
    assertEquals(TestSuiteHelper.readFile("d.res"),
        TestSuiteHelper.runMain("files/d.dat", tmpFolder));
  }

  @Test
  public void rune() {
    assertEquals(TestSuiteHelper.readFile("d.res"),
        TestSuiteHelper.runMain("files/e.dat", tmpFolder));
  }

}
