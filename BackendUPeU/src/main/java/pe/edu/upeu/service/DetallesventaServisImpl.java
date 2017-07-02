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
@Service("detallesventa")
@Transactional
public class DetallesventaServisImpl implements DetallesventaServis{
 
    @Autowired
    public DetallesventaDao dao;

    @Override
    public List<Detallesventa> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Detallesventa guardarEntidad(Detallesventa entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Detallesventa entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Detallesventa buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
