/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Categoria;

/**
 *
 * @author Alumnos
 */
@Repository("categoriaDao")
public class CategoriaDaoImpl extends SysDataAccess<Integer, Categoria> implements CategoriaDao{
    
    @SuppressWarnings("unchecked")
    public List<Categoria> listarEntidad(){return getListAll();}
    public Categoria guardarEntidad(Categoria entidad){ return save(entidad);}
    public void modificarEntidad(Categoria entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Categoria buscarEntidadId(int id){return getById(id);}
        
}
