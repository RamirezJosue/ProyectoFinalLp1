/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Documentos;

/**
 *
 * @author Alumnos
 */
@Repository("documentosDao")
public class DocumentosDaoImpl extends SysDataAccess<Integer, Documentos> implements DocumentosDao{
    
    @SuppressWarnings("unchecked")
    public List<Documentos> listarEntidad(){return getListAll();}
    public Documentos guardarEntidad(Documentos entidad){ return save(entidad);}
    public void modificarEntidad(Documentos entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Documentos buscarEntidadId(int id){return getById(id);}
        
}
