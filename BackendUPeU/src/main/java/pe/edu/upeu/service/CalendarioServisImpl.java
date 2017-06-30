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
import pe.edu.upeu.model.Calendario;
import pe.edu.upeu.dao.CalendarioDao;

/**
 *
 * @author Alumnos
 */
@Service("calendario")
@Transactional
public class CalendarioServisImpl implements CalendarioServis{
 
    @Autowired
    public CalendarioDao dao;

    @Override
    public List<Calendario> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Calendario guardarEntidad(Calendario entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Calendario entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Calendario buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
