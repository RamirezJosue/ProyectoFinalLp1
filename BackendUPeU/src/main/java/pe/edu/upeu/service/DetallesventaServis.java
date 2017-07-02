/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Detallesventa;

/**
 *
 * @author Alumnos
 */
public interface DetallesventaServis {
    public List<Detallesventa> listarEntidad();    
    public Detallesventa guardarEntidad(Detallesventa entidad);
    public void modificarEntidad(Detallesventa entidad);
    public void eliminarEntidad(Integer id);
    public Detallesventa buscarEntidadId(int id);    
}