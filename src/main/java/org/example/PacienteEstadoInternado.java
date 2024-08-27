package org.example;

public class PacienteEstadoInternado extends PacienteEstado {

    private PacienteEstadoInternado() {};
    private static PacienteEstadoInternado instance = new PacienteEstadoInternado();
    public static PacienteEstadoInternado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Internado";
    }
}