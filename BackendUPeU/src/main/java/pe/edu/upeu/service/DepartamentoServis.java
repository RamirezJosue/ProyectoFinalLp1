/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Departamento;

/**
 *
 * @author Alumnos
 */
public interface DepartamentoServis {
    public List<Departamento> listarEntidad();    
    public Departamento guardarEntidad(Departamento entidad);
    public void modificarEntidad(Departamento entidad);
    public void eliminarEntidad(Integer id);
    public Departamento buscarEntidadId(int id);    

}
