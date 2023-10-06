import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.List;

@RunWith(Parameterized.class)
public class ParameterizedAnimalTest {
    private final String animalKind;
    private final List<String> expected;
    public ParameterizedAnimalTest(String animalKind, List<String> expected){
    this.animalKind = animalKind;
    this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    @Test
    public void testGetFood() throws Exception{
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        assertEquals(expected, actual);
    }
    }
