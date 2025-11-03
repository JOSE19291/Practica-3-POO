import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Cuenta cuenta1 = new Cuenta(1, 100, 4.5, null);
         * System.out.println("Tu saldo ahora por retirar 2500 es: " +
         * cuenta1.withdraw(2500));
         * System.out.println("Tu saldo ahora por depositar 3000 es: " +
         * cuenta1.deposit(3000));
         */

        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

        cuentas.add(0, null);
        cuentas.add(1, null);

        for (Cuenta cuenta : cuentas) {
            cuenta.getId();
        }
    }
}
