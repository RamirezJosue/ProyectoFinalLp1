/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Categoria;

/**
 *
 * @author Alumnos
 */
public interface CategoriaServis {
    public List<Categoria> listarEntidad();    
    public Categoria guardarEntidad(Categoria entidad);
    public void modificarEntidad(Categoria entidad);
    public void eliminarEntidad(Integer id);
    public Categoria buscarEntidadId(int id);    
}
