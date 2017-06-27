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
import pe.edu.upeu.dao.EmpleadoDao;
import pe.edu.upeu.model.Empleado;
/**
 *
 * @author Alumnos
 */
@Service("EmpleadoServis")
@Transactional
public class EmpleadoServisImpl implements EmpleadoServis{
    @Autowired
    public EmpleadoDao dao;

    @Override
    public List<Empleado> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Empleado guardarEntidad(Empleado entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Empleado entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Empleado buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
