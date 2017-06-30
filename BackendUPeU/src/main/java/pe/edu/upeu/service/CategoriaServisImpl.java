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
import pe.edu.upeu.model.Categoria;
import pe.edu.upeu.dao.CategoriaDao;

/**
 *
 * @author Alumnos
 */
@Service("categoria")
@Transactional
public class CategoriaServisImpl implements CategoriaServis{
 
    @Autowired
    public CategoriaDao dao;

    @Override
    public List<Categoria> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Categoria guardarEntidad(Categoria entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Categoria entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Categoria buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
