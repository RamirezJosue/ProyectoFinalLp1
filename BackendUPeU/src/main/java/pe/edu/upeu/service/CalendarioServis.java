/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Calendario;

/**
 *
 * @author Alumnos
 */
public interface CalendarioServis {
    public List<Calendario> listarEntidad();    
    public Calendario guardarEntidad(Calendario entidad);
    public void modificarEntidad(Calendario entidad);
    public void eliminarEntidad(Integer id);
    public Calendario buscarEntidadId(int id);    
}
