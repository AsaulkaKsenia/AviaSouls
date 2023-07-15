import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import ru.netology.domain.AviaSouls;
import ru.netology.domain.Ticket;
import ru.netology.domain.TicketTimeComparator;

public class AviaSoulsTest {

    Ticket tickets1 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_784, 7, 10); // время полета 3
    Ticket tickets2 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_360, 13, 17); // 4
    Ticket tickets3 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 18, 21); //3
    Ticket tickets4 = new Ticket("Минеральные Воды", "Москва/Внуково", 7_750, 12, 14); // 2
    Ticket tickets5 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_100, 16, 21); //5
    Ticket tickets6 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_120, 23, 2); //3

    Ticket tickets7 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 22, 22); //24
    Ticket tickets8 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_900, 9, 15); //6
    Ticket tickets9 = new Ticket("Минеральные Воды", "Москва/Домодедово", 7_750, 11, 14); //3
    Ticket tickets10 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_100, 22, 3); //5
    AviaSouls manager = new AviaSouls();

    @BeforeEach
    public void setup() {
        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);
        manager.add(tickets5);
        manager.add(tickets6);
        manager.add(tickets7);
        manager.add(tickets8);
        manager.add(tickets9);
        manager.add(tickets10);
    }

    @Test
    public void shouldSecondTicketLowerPrice() {

        int expected = 1;
        int actual = tickets1.compareTo(tickets2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldFirstTicketLowerPrice() {

        int expected = -1;
        int actual = tickets10.compareTo(tickets5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualInPrice() {

        int expected = 0;
        int actual = tickets3.compareTo(tickets7);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondTicketLowerFlightTime() {
        TicketTimeComparator timeComparator = new TicketTimeComparator();

        int expected = -1;
        int actual = timeComparator.compare(tickets3, tickets2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondTicketLongerFlightTime() {
        TicketTimeComparator timeComparator = new TicketTimeComparator();

        int expected = -1;
        int actual = timeComparator.compare(tickets6, tickets8);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSortFindFew() {
        Ticket tickets1 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_784, 7, 10); // время полета 3
        Ticket tickets2 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_360, 13, 17); // 4
        Ticket tickets3 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 18, 21); //3
        Ticket tickets4 = new Ticket("Минеральные Воды", "Москва/Внуково", 7_750, 12, 14); // 2
        Ticket tickets5 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_100, 16, 21); //5
        Ticket tickets6 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_120, 23, 2); //3
        Ticket tickets7 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 22, 22); //24
        Ticket tickets8 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_900, 9, 15); //6
        Ticket tickets9 = new Ticket("Минеральные Воды", "Москва/Домодедово", 7_750, 11, 14); //3
        Ticket tickets10 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_100, 22, 3); //5
        AviaSouls manager = new AviaSouls();
        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);
        manager.add(tickets5);
        manager.add(tickets6);
        manager.add(tickets7);
        manager.add(tickets8);
        manager.add(tickets9);
        manager.add(tickets10);

        Ticket[] actual = manager.search("Минеральные Воды", "Москва/Шереметьево");
        Ticket[] expected = {tickets3, tickets7, tickets10, tickets2, tickets1, tickets8};

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSortOne() {
        Ticket tickets1 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_784, 7, 10); // время полета 3
        Ticket tickets2 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_360, 13, 17); // 4
        Ticket tickets3 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 18, 21); //3
        Ticket tickets4 = new Ticket("Минеральные Воды", "Москва/Внуково", 7_750, 12, 14); // 2
        Ticket tickets5 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_100, 16, 21); //5
        Ticket tickets6 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_120, 23, 2); //3
        Ticket tickets7 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 22, 22); //24
        Ticket tickets8 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_900, 9, 15); //6
        Ticket tickets9 = new Ticket("Минеральные Воды", "Москва/Домодедово", 7_750, 11, 14); //3
        Ticket tickets10 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_100, 22, 3); //5
        AviaSouls manager = new AviaSouls();
        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);
        manager.add(tickets5);
        manager.add(tickets6);
        manager.add(tickets7);
        manager.add(tickets8);
        manager.add(tickets9);
        manager.add(tickets10);

        Ticket[] actual = manager.search("Минеральные Воды", "Москва/Домодедово");
        Ticket[] expected = {tickets9};

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSortZero() {
        Ticket tickets1 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_784, 7, 10); // время полета 3
        Ticket tickets2 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_360, 13, 17); // 4
        Ticket tickets3 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 18, 21); //3
        Ticket tickets4 = new Ticket("Минеральные Воды", "Москва/Внуково", 7_750, 12, 14); // 2
        Ticket tickets5 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_100, 16, 21); //5
        Ticket tickets6 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_120, 23, 2); //3
        Ticket tickets7 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 22, 22); //24
        Ticket tickets8 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_900, 9, 15); //6
        Ticket tickets9 = new Ticket("Минеральные Воды", "Москва/Домодедово", 7_750, 11, 14); //3
        Ticket tickets10 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_100, 22, 3); //5
        AviaSouls manager = new AviaSouls();
        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);
        manager.add(tickets5);
        manager.add(tickets6);
        manager.add(tickets7);
        manager.add(tickets8);
        manager.add(tickets9);
        manager.add(tickets10);

        Ticket[] actual = manager.search("Минеральные Воды", "Сочи");
        Ticket[] expected = {};

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualFlightTime() {
        TicketTimeComparator timeComparator = new TicketTimeComparator();

        int expected = 0;
        int actual = timeComparator.compare(tickets9, tickets1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSortByFindFew() {
        Ticket tickets1 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_784, 7, 10); // время полета 3
        Ticket tickets2 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_360, 13, 17); // 4
        Ticket tickets3 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 18, 21); //3
        Ticket tickets4 = new Ticket("Минеральные Воды", "Москва/Внуково", 7_750, 12, 14); // 2
        Ticket tickets5 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_100, 16, 21); //5
        Ticket tickets6 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_120, 23, 2); //3
        Ticket tickets7 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 22, 22); //24
        Ticket tickets8 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_900, 9, 15); //6
        Ticket tickets9 = new Ticket("Минеральные Воды", "Москва/Домодедово", 7_750, 11, 14); //3
        Ticket tickets10 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_100, 22, 3); //5
        AviaSouls manager = new AviaSouls();
        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);
        manager.add(tickets5);
        manager.add(tickets6);
        manager.add(tickets7);
        manager.add(tickets8);
        manager.add(tickets9);
        manager.add(tickets10);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Минеральные Воды", "Москва/Шереметьево", comparator);
        Ticket[] expected = {tickets1, tickets3, tickets2, tickets10, tickets8, tickets7};

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSortByOne() {
        Ticket tickets1 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_784, 7, 10); // время полета 3
        Ticket tickets2 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_360, 13, 17); // 4
        Ticket tickets3 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 18, 21); //3
        Ticket tickets4 = new Ticket("Минеральные Воды", "Москва/Внуково", 7_750, 12, 14); // 2
        Ticket tickets5 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_100, 16, 21); //5
        Ticket tickets6 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_120, 23, 2); //3
        Ticket tickets7 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 22, 22); //24
        Ticket tickets8 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_900, 9, 15); //6
        Ticket tickets9 = new Ticket("Минеральные Воды", "Москва/Домодедово", 7_750, 11, 14); //3
        Ticket tickets10 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_100, 22, 3); //5
        AviaSouls manager = new AviaSouls();
        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);
        manager.add(tickets5);
        manager.add(tickets6);
        manager.add(tickets7);
        manager.add(tickets8);
        manager.add(tickets9);
        manager.add(tickets10);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Минеральные Воды", "Москва/Домодедово", comparator);
        Ticket[] expected = {tickets9};

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSortByZero() {
        Ticket tickets1 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_784, 7, 10); // время полета 3
        Ticket tickets2 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_360, 13, 17); // 4
        Ticket tickets3 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 18, 21); //3
        Ticket tickets4 = new Ticket("Минеральные Воды", "Москва/Внуково", 7_750, 12, 14); // 2
        Ticket tickets5 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_100, 16, 21); //5
        Ticket tickets6 = new Ticket("Минеральные Воды", "Москва/Внуково", 8_120, 23, 2); //3
        Ticket tickets7 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 6_350, 22, 22); //24
        Ticket tickets8 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_900, 9, 15); //6
        Ticket tickets9 = new Ticket("Минеральные Воды", "Москва/Домодедово", 7_750, 11, 14); //3
        Ticket tickets10 = new Ticket("Минеральные Воды", "Москва/Шереметьево", 7_100, 22, 3); //5
        AviaSouls manager = new AviaSouls();
        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);
        manager.add(tickets5);
        manager.add(tickets6);
        manager.add(tickets7);
        manager.add(tickets8);
        manager.add(tickets9);
        manager.add(tickets10);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Минеральные Воды", "Сочи", comparator);
        Ticket[] expected = {};

        Assert.assertEquals(expected, actual);
    }
}
