import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;


public class TestFeline {

    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        List<String> list = feline.eatMeat();
        int expected = 3;
        int actual = list.size();
        assertEquals(expected, actual);
    }

    @Test
    public void getFamily() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittens() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensCount() {
        int expected = 8;
        int actual = feline.getKittens(8);
        assertEquals(expected, actual);
    }

    @Test
    public void testUnknownAnimalKindException() {
        assertThrows(Exception.class, () -> feline.getFood("Собака"));
    }

}
