import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SuperheroTest {

    @Test
    void createSuperheroTest() {
        Superhero hero = new Superhero("Superman", 90, 80);
        assertNotNull(hero, "Superhero should be created");
        assertEquals("Superman", hero.getName(), "Name should match");
        assertEquals(90, hero.getPower(), "Power should match");
        assertEquals(80, hero.getDefense(), "Defense should match");
    }

    // You can add more tests here for other functionalities
}
