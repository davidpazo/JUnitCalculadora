package calculadora;

/**** @author dpazolopez ****/
public class Calcula2 {

    public static void main(String[] args) {
        Modelo contenedor = new Modelo();
        Vista.introducir(contenedor);
        contenedor.setResultado(Calcula2.realizaOperacion(contenedor.getNum1(), contenedor.getNum2(), contenedor.getOperacion()));
        Vista.Imprimir(contenedor);
    }
    public static float realizaOperacion(float num1, float num2, int oper) {
        float res = 0;
        if (oper == 1) {
            res = num1 + num2;
        }
        if (oper == 2) {
            res = num1 - num2;
        }
        if (oper == 3) {
            res = num1 * num2;
        }
        if (oper == 4) {
            res = num1 / num2;
        }
        return res;
    }
} 
