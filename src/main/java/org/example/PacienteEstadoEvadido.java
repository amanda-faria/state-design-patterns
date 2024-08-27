package org.example;

public class PacienteEstadoEvadido extends PacienteEstado {

    private PacienteEstadoEvadido() {};
    private static PacienteEstadoEvadido instance = new PacienteEstadoEvadido();
    public static PacienteEstadoEvadido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Fugido";
    }
}