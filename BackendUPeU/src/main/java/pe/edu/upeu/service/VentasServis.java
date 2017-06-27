/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Ventas;
        
/**
 *
 * @author Alumnos
 */
public interface VentasServis {
    public List<Ventas> listarEntidad();
    public Ventas buscarEntidadId(int id);
    public void guardarEntidad(Ventas entidad);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(Ventas entidad);  
    public List<Ventas> listarPorNombre(String dato);
    
    
}
