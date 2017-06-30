/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Producto;

/**
 *
 * @author Alumnos
 */
public interface ProductoServis {
    public List<Producto> listarEntidad();    
    public Producto guardarEntidad(Producto entidad);
    public void modificarEntidad(Producto entidad);
    public void eliminarEntidad(Integer id);
    public Producto buscarEntidadId(int id);    
}