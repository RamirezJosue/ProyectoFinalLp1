/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.Documentos;

/**
 *
 * @author Alumnos
 */
public interface DocumentosDao {
    public List<Documentos> listarEntidad();
    public Documentos guardarEntidad(Documentos entidad);
    public void modificarEntidad(Documentos entidad);
    public void eliminarEntidad(Integer id);
    public Documentos buscarEntidadId(int id);
}
