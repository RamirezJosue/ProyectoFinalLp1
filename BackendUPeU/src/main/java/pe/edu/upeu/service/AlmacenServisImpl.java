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
import pe.edu.upeu.model.Almacen;
import pe.edu.upeu.dao.AlmacenDao;

/**
 *
 * @author Alumnos
 */
@Service("almacen")
@Transactional
public class AlmacenServisImpl implements AlmacenServis{
 
    @Autowired
    public AlmacenDao dao;

    @Override
    public List<Almacen> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Almacen guardarEntidad(Almacen entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Almacen entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Almacen buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
