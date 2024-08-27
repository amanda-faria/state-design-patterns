package org.example;


public abstract class PacienteEstado {

    public abstract String getEstado();

    public boolean entrar(Paciente paciente) {
        return false;
    }

    public boolean liberar(Paciente paciente) {
        return false;
    }

    public boolean internar(Paciente paciente) {
        return false;
    }

    public boolean fugir(Paciente paciente) {
        return false;
    }

    public boolean transferir(Paciente paciente) {
        return false;
    }

    public boolean falecer(Paciente paciente) {
        return false;
    }

}
