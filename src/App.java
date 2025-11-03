import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Cuenta cuenta1 = new Cuenta(0, 100, 4.5, null);
        Cuenta cuenta2 = new Cuenta(1, 100, 4.5, null);
        Cuenta cuenta3 = new Cuenta(2, 100, 4.5, null);
        Cuenta cuenta4 = new Cuenta(3, 100, 4.5, null);
        Cuenta cuenta5 = new Cuenta(4, 100, 4.5, null);
        Cuenta cuenta6 = new Cuenta(5, 100, 4.5, null);
        Cuenta cuenta7 = new Cuenta(6, 100, 4.5, null);
        Cuenta cuenta8 = new Cuenta(7, 100, 4.5, null);
        Cuenta cuenta9 = new Cuenta(8, 100, 4.5, null);
        Cuenta cuenta10 = new Cuenta(9, 100, 4.5, null);

        ArrayList<Cuenta> cuentas = new ArrayList<>();

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        cuentas.add(cuenta4);
        cuentas.add(cuenta5);
        cuentas.add(cuenta6);
        cuentas.add(cuenta7);
        cuentas.add(cuenta8);
        cuentas.add(cuenta9);
        cuentas.add(cuenta10);

        switch (cuenta1.getId()) {
            case 0:

                break;

            default:
                break;
        }
    }
}
