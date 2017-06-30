/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Detallecompra;

/**
 *
 * @author Alumnos
 */
public interface DetallecompraServis {
    public List<Detallecompra> listarEntidad();    
    public Detallecompra guardarEntidad(Detallecompra entidad);
    public void modificarEntidad(Detallecompra entidad);
    public void eliminarEntidad(Integer id);
    public Detallecompra buscarEntidadId(int id);    

}
