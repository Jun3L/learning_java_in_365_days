import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class day70test {
    @Test
    public void TestAdd(){
        day70 calculator = new day70();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}
