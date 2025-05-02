package UNIDAD1;
public class CuentaBancaria {
    public static void main(String[] args) {
        // Cantidad inicial en la cuenta
        double saldoInicial = 1000.0;

        // Cantidad a retirar cada semana
        double retiroSemanal = 200.0;

        // Número de semanas en un mes
        int semanasEnUnMes = 4;

        // Calcular el saldo restante después de los retiros
        double saldoRestante = saldoInicial - (retiroSemanal * semanasEnUnMes);

        // Mostrar el resultado
        System.out.println("El saldo restante en la cuenta al final del mes es: $" + saldoRestante);
    }
}
