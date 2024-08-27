package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PacienteTest {

    Paciente paciente;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente();
    }

    // Paciente matriculado

    @Test
    public void naoDeveDarEntradaaoPacienteQueJaDeuEntrada() {
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        assertFalse(paciente.entrar());
    }

    @Test
    public void deveDarComoFalecidoPacienteQueDeuEntrada() {
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        assertTrue(paciente.falecer());
        assertEquals(PacienteEstadoObito.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveInternarPacienteQueDeuEntrada() {
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        assertTrue(paciente.internar());
        assertEquals(PacienteEstadoInternado.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveLiberarPacienteQueDeuEntrada() {
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        assertTrue(paciente.liberar());
        assertEquals(PacienteEstadoDeAlta.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveDarComoFugidoPacienteQueDeuEntrada() {
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        assertTrue(paciente.fugir());
        assertEquals(PacienteEstadoEvadido.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveTransferirPacienteQueDeuEntrada() {
        paciente.setEstado(PacienteEstadoEntrada.getInstance());
        assertTrue(paciente.transferir());
        assertEquals(PacienteEstadoTransferido.getInstance(), paciente.getEstado());
    }

    // Paciente internado

    @Test
    public void naoDeveDarComoFalecidoPacienteInterando() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertFalse(paciente.falecer());
    }

    @Test
    public void naoDeveInternarPacienteInterando() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertFalse(paciente.internar());
    }

    @Test
    public void naoDeveTransferidoPacienteTransferido() {
        paciente.setEstado(PacienteEstadoInternado.getInstance());
        assertFalse(paciente.transferir());
    }

    // Paciente Falecido

    @Test
    public void naoDeveDarEntradaEmPacienteFalecido() {
        paciente.setEstado(PacienteEstadoObito.getInstance());
        assertFalse(paciente.entrar());
    }

    @Test
    public void naoDeveDarComoFalecidoPacienteFalecido() {
        paciente.setEstado(PacienteEstadoObito.getInstance());
        assertFalse(paciente.falecer());
    }

    @Test
    public void naoDeveInternarPacienteFalecido() {
        paciente.setEstado(PacienteEstadoObito.getInstance());
        assertFalse(paciente.internar());
    }

    @Test
    public void naoDeveLiberarPacienteFalecido() {
        paciente.setEstado(PacienteEstadoObito.getInstance());
        assertFalse(paciente.liberar());
    }

    @Test
    public void naoDeveEvadirPacienteFalecido() {
        paciente.setEstado(PacienteEstadoObito.getInstance());
        assertFalse(paciente.fugir());
    }

    @Test
    public void naoDeveTransferirPacienteFalecido() {
        paciente.setEstado(PacienteEstadoObito.getInstance());
        assertFalse(paciente.transferir());
    }

    // Paciente Liberado

    @Test
    public void naoDeveDarEntradaEmPacienteLiberado() {
        paciente.setEstado(PacienteEstadoDeAlta.getInstance());
        assertFalse(paciente.entrar());
    }

    @Test
    public void naoDeveDarComoFalecidoPacienteLiberado() {
        paciente.setEstado(PacienteEstadoDeAlta.getInstance());
        assertFalse(paciente.falecer());
    }

    @Test
    public void naoDeveInternarPacienteLiberado() {
        paciente.setEstado(PacienteEstadoDeAlta.getInstance());
        assertFalse(paciente.internar());
    }

    @Test
    public void naoDeveLiberarPacienteLiberado() {
        paciente.setEstado(PacienteEstadoDeAlta.getInstance());
        assertFalse(paciente.liberar());
    }

    @Test
    public void naoDeveEvadirPAcienteLiberado() {
        paciente.setEstado(PacienteEstadoDeAlta.getInstance());
        assertFalse(paciente.fugir());
    }

    @Test
    public void naoDeveTransferirPacienteLiberado() {
        paciente.setEstado(PacienteEstadoDeAlta.getInstance());
        assertFalse(paciente.transferir());
    }

    // Paciente evadido

    @Test
    public void naoDeveDarEntradaEmPacienteEvadido() {
        paciente.setEstado(PacienteEstadoEvadido.getInstance());
        assertFalse(paciente.entrar());
    }

    @Test
    public void naoDeveDArComoFalecidoPacienteEvadido() {
        paciente.setEstado(PacienteEstadoEvadido.getInstance());
        assertFalse(paciente.falecer());
    }

    @Test
    public void naoDeveInternarPacienteEvadido() {
        paciente.setEstado(PacienteEstadoEvadido.getInstance());
        assertFalse(paciente.internar());
    }

    @Test
    public void naoDeveEvadirPacienteEvadido() {
        paciente.setEstado(PacienteEstadoEvadido.getInstance());
        assertFalse(paciente.fugir());
    }

    @Test
    public void naoDeveTransferirPacienteEvadido() {
        paciente.setEstado(PacienteEstadoEvadido.getInstance());
        assertFalse(paciente.transferir());
    }

    // Paciente transferido

    @Test
    public void naoDeveDarEntradaEmPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertFalse(paciente.entrar());
    }

    @Test
    public void naoDeveDarComoFalecidoPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertFalse(paciente.falecer());
    }

    @Test
    public void naoDeveInternarPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertFalse(paciente.internar());
    }

    @Test
    public void naoDeveLiberarPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertFalse(paciente.liberar());
    }

    @Test
    public void naoDeveEvadirPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertFalse(paciente.fugir());
    }

    @Test
    public void naoDeveTransferirPacienteTransferido() {
        paciente.setEstado(PacienteEstadoTransferido.getInstance());
        assertFalse(paciente.transferir());
    }
}