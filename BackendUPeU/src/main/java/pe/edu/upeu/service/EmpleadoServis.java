/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;
import java.util.List;
import pe.edu.upeu.model.Empleado;
/**
 *
 * @author Alumnos
 */

public interface EmpleadoServis{
    public List<Empleado> listarEntidad();    
    public Empleado guardarEntidad(Empleado entidad);
    public void modificarEntidad(Empleado entidad);
    public void eliminarEntidad(Integer id);
    public Empleado buscarEntidadId(int id);  
}