import java.math.BigDecimal;

public class App {
    /*
        Napisz program, który pozwala wyznaczyć cenę zamówienia złożonego na wybrany produkt.
        W aplikacji znajduje się osobna struktura, która opisuje produkt (nazwa, cena, zniżka)
        oraz wyznacza cenę dla produktu. Dodatkowo program musi zawierać informacje na temat
        zamówienia, które oprócz danych o produkcie przechowuje ilość sztuk produktu, które
        zamówiono. Dla tak określonej struktury program wylicza cenę całkowitą zamówienia.
    */
    public static void main(String[] args) {
        var product = new Product("A", new BigDecimal("1000"), new BigDecimal("0.1"));
        System.out.println(product.totalPrice());

        var order = new Order(product, 10);
        System.out.println(order.totalPrice());
    }
}
