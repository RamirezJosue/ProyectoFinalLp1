/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Areas;

/**
 *
 * @author Alumnos
 */
@Repository("areasDao")
public class AreasDaoImpl extends SysDataAccess<Integer, Areas> implements AreasDao{
    
    @SuppressWarnings("unchecked")
    public List<Areas> listarEntidad(){return getListAll();}
    public Areas guardarEntidad(Areas entidad){ return save(entidad);}
    public void modificarEntidad(Areas entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Areas buscarEntidadId(int id){return getById(id);}
        
}
