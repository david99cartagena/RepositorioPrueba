/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

/**
 *
 * @author Pc_Estiven
 */
public class usuario {

    private int idusuario;
    private int idrol;
    private String nombre;
    private String activo;
    private String nombrerol;

    public usuario() {

    }

    public usuario(int idusuario, int idrol, String nombre, String activo, String nombrerol) {
        this.idusuario = idusuario;
        this.idrol = idrol;
        this.nombre = nombre;
        this.activo = activo;
        this.nombrerol = nombrerol;
    }

    public usuario(int idusuario, int idrol, String nombre, String activo) {
        this.idusuario = idusuario;
        this.idrol = idrol;
        this.nombre = nombre;
        this.activo = activo;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrerol() {
        return nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    

}
