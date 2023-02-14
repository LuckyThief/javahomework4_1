import org.example.BonusService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean isRegistered = true;

        long expected = 30;
        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean isRegistered = true;

        long expected = 500;
        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean isRegistered = false;

        long expected = 10;
        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean isRegistered = false;

        long expected = 500;
        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }
}