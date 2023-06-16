package exercice1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {
    private EmployeeManager manager;

    @BeforeEach
    public void setup() {
        manager = new EmployeeManager();
    }

    @Test
    public void testCalculJunior1an() {
        Employee employee = new Employee("John", "Doe", 1, "Junior");
        assertEquals(21000, manager.calculSalaire(employee), 0.001);
    }

    @Test
    public void testCalculIntermediaire5ans() {
        Employee employee = new Employee("Jane", "Doe", 5, "Intermédiaire");
        assertEquals(50000, manager.calculSalaire(employee), 0.001);
    }

    @Test
    public void testCalculSenior10ans() {
        Employee employee = new Employee("Jim", "Beam", 10, "Senior");
        assertEquals(90000, manager.calculSalaire(employee), 0.001);
    }

    @Test
    public void testCalculSenior20ans() {
        Employee employee = new Employee("Jack", "Daniels", 20, "Senior");
        assertEquals(120000, manager.calculSalaire(employee), 0.001);
    }

    @Test
    public void testErreur() {
        Employee employee = new Employee("Johnny", "Walker", 5, "Master");
        assertThrows(IllegalArgumentException.class, () -> manager.calculSalaire(employee));
    }
}
