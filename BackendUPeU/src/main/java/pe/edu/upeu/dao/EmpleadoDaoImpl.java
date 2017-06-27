/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Empleado;

/**
 *
 * @author Alumnos
 */
@Repository("EmpleadoDao")
public class EmpleadoDaoImpl extends SysDataAccess<Integer, Empleado> implements EmpleadoDao{
    
    @SuppressWarnings("unchecked")
    public List<Empleado> listarEntidad(){ return getListAll(); }
    public Empleado guardarEntidad(Empleado entidad){return save(entidad);}
    public void modificarEntidad(Empleado entidad){update(entidad);}
    public void eliminarEntidad(int id){delete(id);}
    public Empleado buscarEntidadId(int id){return getById(id);}
    
    
}
