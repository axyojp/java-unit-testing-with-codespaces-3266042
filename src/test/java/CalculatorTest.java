public class CalculatorTest {

  Calculator calculator = new Calculator();

  @Test
  public void testSum() {
    int expected = 3;

    int actual = calculator.sum(1, 2);

    assertEquals(exptected, actual);
  }
}
