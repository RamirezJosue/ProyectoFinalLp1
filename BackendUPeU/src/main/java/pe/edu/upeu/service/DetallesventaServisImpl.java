/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.model.Detallesventa;
import pe.edu.upeu.dao.DetallesventaDao;

/**
 *
 * @author Alumnos
 */

@Service("DetallesventaServis")
@Transactional
public class DetallesventaServisImpl implements DetallesventaServis{
    @Autowired
    public DetallesventaDao dao;
 
    @Override
    public List<Detallesventa> listarEntidad(){return dao.listarEntidad();}
    @Override
    public Detallesventa buscarEntidadId(int id) {return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Detallesventa entidad) {dao.guardarEntidad(entidad); }  
    @Override
    public void eliminarEntidadId(int id) {dao.eliminarEntidadId(id);}    
    @Override
    public void modificarEntidadId(Detallesventa entidad) {dao.modificarEntidadId(entidad);}       
    @Override
    public List<Detallesventa> listarPorNombre(String dato){return dao.listarPorNombre(dato);}    
}
