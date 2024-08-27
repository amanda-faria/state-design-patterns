package org.example;
public class PacienteEstadoDeAlta extends PacienteEstado {

    private PacienteEstadoDeAlta() {};
    private static PacienteEstadoDeAlta instance = new PacienteEstadoDeAlta();
    public static PacienteEstadoDeAlta getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Liberado";
    }
}