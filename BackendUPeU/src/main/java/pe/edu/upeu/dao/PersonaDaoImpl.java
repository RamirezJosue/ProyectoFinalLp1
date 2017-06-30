/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Persona;

/**
 *
 * @author Alumnos
 */
@Repository("personaDao")
public class PersonaDaoImpl extends SysDataAccess<Integer, Persona> implements PersonaDao{
    
    @SuppressWarnings("unchecked")
    public List<Persona> listarEntidad(){return getListAll();}
    public Persona guardarEntidad(Persona entidad){ return save(entidad);}
    public void modificarEntidad(Persona entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Persona buscarEntidadId(int id){return getById(id);}
        
}
