import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class TestLion {
    @Mock
    Feline feline;
    String sex;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testLionSexException() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Он"));
        String message = exception.getMessage();
    }

}
