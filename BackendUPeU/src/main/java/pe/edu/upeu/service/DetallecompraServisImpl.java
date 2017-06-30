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
import pe.edu.upeu.model.Detallecompra;
import pe.edu.upeu.dao.DetallecompraDao;

/**
 *
 * @author Alumnos
 */
@Service("detallecompra")
@Transactional
public class DetallecompraServisImpl implements DetallecompraServis{
 
    @Autowired
    public DetallecompraDao dao;

    @Override
    public List<Detallecompra> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Detallecompra guardarEntidad(Detallecompra entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Detallecompra entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Detallecompra buscarEntidadId(int id){ return dao.buscarEntidadId(id);}

    
}
