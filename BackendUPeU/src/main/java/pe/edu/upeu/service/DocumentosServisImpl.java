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
import pe.edu.upeu.model.Documentos;
import pe.edu.upeu.dao.DocumentosDao;

/**
 *
 * @author Alumnos
 */
@Service("documentos")
@Transactional
public class DocumentosServisImpl implements DocumentosServis{
 
    @Autowired
    public DocumentosDao dao;

    @Override
    public List<Documentos> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Documentos guardarEntidad(Documentos entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Documentos entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Documentos buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
