import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PacienteTest {

    @Test
    void pacienteBaixoPesoMuitoGrave() {
        Paciente paciente = new Paciente(45, 1.70);

        Assertions.assertEquals(15.57, paciente.calcularIMC(), 0.01);
    }

    @Test
    void pacienteBaixoPesoGrave() {
        Paciente paciente = new Paciente(48, 1.73);

        Assertions.assertEquals(16.03, paciente.calcularIMC(), 0.01);
    }

    @Test
    void pacienteBaixoPeso() {
        Paciente paciente = new Paciente(59, 1.80);

        Assertions.assertEquals(18.20, paciente.calcularIMC(), 0.01);
    }

    @Test
    void pacientePesoNormal() {
        Paciente paciente = new Paciente(70, 1.87);

        Assertions.assertEquals(20.01, paciente.calcularIMC(), 0.01);
    }

    @Test
    void pacienteSobrepeso() {
        Paciente paciente = new Paciente(80.5, 1.70);

        Assertions.assertEquals(27.85, paciente.calcularIMC(), 0.01);
    }

    @Test
    void pacienteObesidadeGrauI() {
        Paciente paciente = new Paciente(102.3, 1.76);

        Assertions.assertEquals(33.02, paciente.calcularIMC(), 0.01);
    }

    @Test
    void pacienteObesidadeGrauII() {
        Paciente paciente = new Paciente(113, 1.79);

        Assertions.assertEquals(35.26, paciente.calcularIMC(), 0.01);
    }

    @Test
    void pacienteObesidadeGrauIII() {
        Paciente paciente = new Paciente(120, 1.70);

        Assertions.assertEquals(41.52, paciente.calcularIMC(), 0.01);
    }

}