package org.example;

public class Paciente {

    private String nome;
    private PacienteEstado estado;

    public Paciente() {
        this.estado = PacienteEstadoEntrada.getInstance();
    }

    public void setEstado(PacienteEstado estado) {
        this.estado = estado;
    }

    public boolean entrar() {
        return estado.entrar(this);
    }

    public boolean liberar() {
        return estado.liberar(this);
    }

    public boolean internar() { return estado.internar(this);    }

    public boolean fugir() {
        return estado.fugir(this);
    }

    public boolean transferir() {return estado.transferir(this);}

    public boolean falecer() {return estado.falecer(this);    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PacienteEstado getEstado() {
        return estado;
    }
}
