/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jajimenez
 */
public class Cita {

    private Integer id;
    private String nombreCita;
    private String fecha;
    private com.computacionJava.evidencia.Medico medico;
    private com.computacionJava.evidencia.Paciente paciente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCita() {
        return nombreCita;
    }

    public void setNombreCita(String nombreCita) {
        this.nombreCita = nombreCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public com.computacionJava.evidencia.Medico getMedico() {
        return medico;
    }

    public void setMedico(com.computacionJava.evidencia.Medico medico) {
        this.medico = medico;
    }

    public com.computacionJava.evidencia.Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(com.computacionJava.evidencia.Paciente paciente) {
        this.paciente = paciente;
    }

}