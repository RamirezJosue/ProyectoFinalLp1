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
import pe.edu.upeu.model.Producto;
import pe.edu.upeu.dao.ProductoDao;

/**
 *
 * @author Alumnos
 */
@Service("producto")
@Transactional
public class ProductoServisImpl implements ProductoServis{
 
    @Autowired
    public ProductoDao dao;

    @Override
    public List<Producto> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Producto guardarEntidad(Producto entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Producto entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Producto buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
