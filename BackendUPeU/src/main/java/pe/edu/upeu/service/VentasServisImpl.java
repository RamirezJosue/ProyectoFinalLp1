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
import pe.edu.upeu.model.Ventas;
import pe.edu.upeu.dao.VentasDao;

/**
 *
 * @author Alumnos
 */

@Service("VentasServis")
@Transactional
public class VentasServisImpl implements VentasServis{
    @Autowired
    public VentasDao dao;
 
    @Override
    public List<Ventas> listarEntidad(){return dao.listarEntidad();}
    @Override
    public Ventas buscarEntidadId(int id) {return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Ventas entidad) {dao.guardarEntidad(entidad); }  
    @Override
    public void eliminarEntidadId(int id) {dao.eliminarEntidadId(id);}    
    @Override
    public void modificarEntidadId(Ventas entidad) {dao.modificarEntidadId(entidad);}       
    @Override
    public List<Ventas> listarPorNombre(String dato){return dao.listarPorNombre(dato);}    
}
