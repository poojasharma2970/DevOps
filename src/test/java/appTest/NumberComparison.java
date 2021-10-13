package appTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparison {
  @Test
  public void intComparison() {
	  Assert.assertTrue(5>4);
  }
}
