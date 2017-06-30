/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Persona;

/**
 *
 * @author Alumnos
 */
public interface PersonaServis {
    public List<Persona> listarEntidad();    
    public Persona guardarEntidad(Persona entidad);
    public void modificarEntidad(Persona entidad);
    public void eliminarEntidad(Integer id);
    public Persona buscarEntidadId(int id);    
}
