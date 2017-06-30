/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Detallecompra;

/**
 *
 * @author Alumnos
 */
@Repository("detallecompraDao")
public class DetallecompraDaoImpl extends SysDataAccess<Integer, Detallecompra> implements DetallecompraDao{
    
    @SuppressWarnings("unchecked")
    public List<Detallecompra> listarEntidad(){return getListAll();}
    public Detallecompra guardarEntidad(Detallecompra entidad){ return save(entidad);}
    public void modificarEntidad(Detallecompra entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Detallecompra buscarEntidadId(int id){return getById(id);}
        
}
