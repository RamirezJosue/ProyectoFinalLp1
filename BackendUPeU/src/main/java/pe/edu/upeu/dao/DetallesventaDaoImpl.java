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
 * @author David
 */
@Repository("DetallesventaDao")
public class DetallesventaDaoImpl extends SysDataAccess<Integer, Detallesventa> implements DetallesventaDao{
    @SuppressWarnings("unchecked")
    public List<Detallesventa> listarEntidad(){ return getListAll();}
    public Detallesventa buscarEntidadId(int id) {return getByKey(id);}
    public void guardarEntidad(Detallesventa entidad) {savev(entidad); }  
    public void eliminarEntidadId(int id) {delete(id);}    
    public void modificarEntidadId(Detallesventa entidad) {update(entidad);}         
    public List<Detallesventa> listarPorNombre(String dato){
    return (List<Detallesventa>)sessionFactory.getCurrentSession()
            .createQuery("select a from Detallesventa a where a.idProducto.nombre like? ")        
            .setString(0, "%"+dato+"%")
            .list();
    }     
}
