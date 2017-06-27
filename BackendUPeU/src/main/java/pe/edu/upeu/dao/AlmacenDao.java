/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.Almacen;

/**
 *
 * @author Alumnos
 */
public interface AlmacenDao {
    public List<Almacen> listarEntidad();
    public Almacen guardarEntidad(Almacen entidad);
    public void modificarEntidad(Almacen entidad);
    public void eliminarEntidad(Integer id);
    public Almacen buscarEntidadId(int id);
}
