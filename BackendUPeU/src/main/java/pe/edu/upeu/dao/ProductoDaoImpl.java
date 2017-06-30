/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Producto;

/**
 *
 * @author Alumnos
 */
@Repository("productoDao")
public class ProductoDaoImpl extends SysDataAccess<Integer, Producto> implements ProductoDao{
    
    @SuppressWarnings("unchecked")
    public List<Producto> listarEntidad(){return getListAll();}
    public Producto guardarEntidad(Producto entidad){ return save(entidad);}
    public void modificarEntidad(Producto entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Producto buscarEntidadId(int id){return getById(id);}
        
}
