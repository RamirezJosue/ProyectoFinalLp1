/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Ventas;

/**
 *
 * @author David
 */
@Repository("ventasDao")
public class VentasDaoImpl extends SysDataAccess<Integer, Ventas> implements VentasDao{
    @SuppressWarnings("unchecked")
    public List<Ventas> listarEntidad(){ return getListAll();}
    public Ventas buscarEntidadId(int id) {return getByKey(id);}
    public void guardarEntidad(Ventas entidad) {savev(entidad); }  
    public void eliminarEntidadId(int id) {delete(id);}    
    public void modificarEntidadId(Ventas entidad) {update(entidad);}         
    public List<Ventas> listarPorNombre(String dato){
    return (List<Ventas>)sessionFactory.getCurrentSession()
            .createQuery("select a from Diagnostico a where a.idDiagnostico.dni fechaAlta ? ")        
            .setString(0, "%"+dato+"%")
            .list();
    }     
}
