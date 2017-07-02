/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Detallesventa;

/**
 *
 * @author Alumnos
 */
@Repository("detallesventaDao")
public class DetallesventaDaoImpl extends SysDataAccess<Integer, Detallesventa> implements DetallesventaDao{
    
    @SuppressWarnings("unchecked")
    public List<Detallesventa> listarEntidad(){return getListAll();}
    public Detallesventa guardarEntidad(Detallesventa entidad){ return save(entidad);}
    public void modificarEntidad(Detallesventa entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Detallesventa buscarEntidadId(int id){return getById(id);}
        
}
