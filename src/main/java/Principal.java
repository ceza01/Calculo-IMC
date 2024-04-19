public class Principal {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente(80.5, 1.70);
        System.out.println("IMC: " + paciente1.calcularIMC());
        System.out.println(paciente1.diagnostico());

        Paciente paciente2 = new Paciente(100, 1.65);
        System.out.println("IMC: " + paciente2.calcularIMC());
        System.out.println(paciente2.diagnostico());

    }
}
