/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author santiago
 */
public class Censo {

    private Integer id;
    private String nombrePersona;
    private String motivo;
    private String fecha;
    private String estadoEmocional;
    private String duracionRelacion;
    private String estadoCivil;
    private Censador censador;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstadoEmocional() {
        return estadoEmocional;
    }

    public void setEstadoEmocional(String estadoEmocional) {
        this.estadoEmocional = estadoEmocional;
    }

    public String getDuracionRelacion() {
        return duracionRelacion;
    }

    public void setDuracionRelacion(String duracionRelacion) {
        this.duracionRelacion = duracionRelacion;
    }

    public Censador getCensador() {
        return censador;
    }

    public void setCensador(Censador censador) {
        this.censador = censador;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
    
   
}
