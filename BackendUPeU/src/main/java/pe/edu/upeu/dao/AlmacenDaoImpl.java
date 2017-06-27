/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Almacen;

/**
 *
 * @author Alumnos
 */
@Repository("almacenDao")
public class AlmacenDaoImpl extends SysDataAccess<Integer, Almacen> implements AlmacenDao{
    
    @SuppressWarnings("unchecked")
    public List<Almacen> listarEntidad(){return getListAll();}
    public Almacen guardarEntidad(Almacen entidad){ return save(entidad);}
    public void modificarEntidad(Almacen entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Almacen buscarEntidadId(int id){return getById(id);}
        
}
