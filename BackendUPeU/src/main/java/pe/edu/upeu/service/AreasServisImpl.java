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
import pe.edu.upeu.model.Areas;
import pe.edu.upeu.dao.AreasDao;

/**
 *
 * @author Alumnos
 */
@Service("areas")
@Transactional
public class AreasServisImpl implements AreasServis{
 
    @Autowired
    public AreasDao dao;

    @Override
    public List<Areas> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Areas guardarEntidad(Areas entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Areas entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Areas buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
