import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
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
    private List<String> expected;

    @Before
    public void setUp() {
        expected = List.of("Животные", "Птицы", "Рыба");
    }

        @Test
        public void testGetKittens() throws Exception {
          Lion lion = new Lion("Самка",feline);
         Mockito.when(feline.getKittens()).thenReturn(1);
           int expected = 1;
           int actual = lion.getKittens();
          assertEquals(expected, actual);
        }

        @Test
        public void testGetFood () throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        List<String> actual = lion.getFood();
         assertEquals(expected, actual);
        }

        @Test
        public void testLionSexException () {
        Exception exception = assertThrows(Exception.class, () -> new Lion(sex, feline));
        String expected = "Используйте допустимые значения пола животного - Самец или Самка";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
        }

    }
