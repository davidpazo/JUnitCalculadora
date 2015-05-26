package calculadora;

import javax.swing.JOptionPane;

/**
 * *
 * @author dpazolopez
 */
public class Vista {

    public Vista() {
    }

    public static void Imprimir(Modelo obj) {

        if (obj.getOperacion() == 1) {
            JOptionPane.showMessageDialog(null, "Suma " + obj.getNum1() + "+" + obj.getNum2() + "= " + obj.getResultado());
        }
        if (obj.getOperacion() == 2) {
            JOptionPane.showMessageDialog(null, "Resta " + obj.getNum1() + "-" + obj.getNum2() + "= " + obj.getResultado());
        }
        if (obj.getOperacion() == 3) {
            JOptionPane.showMessageDialog(null, "Multiplicacion " + obj.getNum1() + "*" + obj.getNum2() + "= " + obj.getResultado());
        }
        if (obj.getOperacion() == 4) {
            JOptionPane.showMessageDialog(null, "Division " + obj.getNum1() + "/" + obj.getNum2() + "= " + obj.getResultado());
        }
    }
    public static void introducir(Modelo mod){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Primer Numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo Numero"));

        mod.setNum1(num1);
        mod.setNum2(num2);

        int opc = JOptionPane.showOptionDialog(
                null, "MENU", "ELIJA SU OPERACION", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "+",
                    "-",
                    "x",
                    "/"},
                "Exit") + 1;

        switch (opc) {
            case 1:
                mod.setOperacion(1);
                break;
            case 2:
                mod.setOperacion(2);
                break;
            case 3:
                mod.setOperacion(3);
                break;
            case 4:
                mod.setOperacion(4);
                break;
            default:
                System.exit(0);
        }

    }
}
