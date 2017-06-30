/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Calendario;

/**
 *
 * @author Alumnos
 */
@Repository("calendarioDao")
public class CalendarioDaoImpl extends SysDataAccess<Integer, Calendario> implements CalendarioDao{
    
    @SuppressWarnings("unchecked")
    public List<Calendario> listarEntidad(){return getListAll();}
    public Calendario guardarEntidad(Calendario entidad){ return save(entidad);}
    public void modificarEntidad(Calendario entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Calendario buscarEntidadId(int id){return getById(id);}
        
}
