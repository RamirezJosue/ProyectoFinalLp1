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
import pe.edu.upeu.model.Persona;
import pe.edu.upeu.dao.PersonaDao;

/**
 *
 * @author Alumnos
 */
@Service("persona")
@Transactional
public class PersonaServisImpl implements PersonaServis{
 
    @Autowired
    public PersonaDao dao;

    @Override
    public List<Persona> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Persona guardarEntidad(Persona entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Persona entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Persona buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
