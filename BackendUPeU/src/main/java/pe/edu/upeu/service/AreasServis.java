/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Areas;

/**
 *
 * @author Alumnos
 */
public interface AreasServis {
    public List<Areas> listarEntidad();    
    public Areas guardarEntidad(Areas entidad);
    public void modificarEntidad(Areas entidad);
    public void eliminarEntidad(Integer id);
    public Areas buscarEntidadId(int id);    
}
