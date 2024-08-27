package org.example;

public class PacienteEstadoTransferido extends PacienteEstado {

    private PacienteEstadoTransferido() {};
    private static PacienteEstadoTransferido instance = new PacienteEstadoTransferido();
    public static PacienteEstadoTransferido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferido";
    }

}