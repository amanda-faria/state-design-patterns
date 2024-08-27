package org.example;

public class PacienteEstadoObito extends PacienteEstado {

    private PacienteEstadoObito() {};
    private static PacienteEstadoObito instance = new PacienteEstadoObito();
    public static PacienteEstadoObito getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Obito";
    }


}