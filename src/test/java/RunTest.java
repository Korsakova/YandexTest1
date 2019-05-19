public class RunTest {

    private Run run;

    @Before
    public void runBeforeEveryTest() {
        simpleMath = new SimpleMath();
    }

    @After
    public void runAfterEveryTest() {
        simpleMath = null;
    }

    @Test
    public void addition() {
        assertEquals(12, simpleMath.add(7, 5));
    }

    @Test
    public void subtraction() {
        assertEquals(50, simpleMath.sub(80,30));
    }
}
