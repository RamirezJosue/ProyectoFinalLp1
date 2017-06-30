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
import pe.edu.upeu.model.Departamento;
import pe.edu.upeu.dao.DepartamentoDao;

/**
 *
 * @author Alumnos
 */
@Service("departamento")
@Transactional
public class DepartamentoServisImpl implements DepartamentoServis{
 
    @Autowired
    public DepartamentoDao dao;

    @Override
    public List<Departamento> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Departamento guardarEntidad(Departamento entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Departamento entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Departamento buscarEntidadId(int id){ return dao.buscarEntidadId(id);}

    
}
