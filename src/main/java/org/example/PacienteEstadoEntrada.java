package org.example;

public class PacienteEstadoEntrada extends PacienteEstado {

    private PacienteEstadoEntrada() {};
    private static PacienteEstadoEntrada instance = new PacienteEstadoEntrada();
    public static PacienteEstadoEntrada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entrar";
    }

    public boolean liberar(Paciente paciente) {
        paciente.setEstado(PacienteEstadoDeAlta.getInstance());
        return true;
    }

    public boolean internar(Paciente paciente) {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        return true;
    }

    public boolean fugir(Paciente paciente) {
        paciente.setEstado(PacienteEstadoEvadido.getInstance());
        return true;
    }

    public boolean transferir(Paciente paciente) {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        return true;
    }

    public boolean falecer(Paciente paciente) {
        paciente.setEstado(PacienteEstadoObito.getInstance());
        return true;
    }

}