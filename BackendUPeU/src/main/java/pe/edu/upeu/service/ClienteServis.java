/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Cliente;

/**
 *
 * @author jeanpaul
 */
public interface ClienteServis {
     public List<Cliente> listarEntidad();    
    public Cliente guardarEntidad(Cliente entidad);
    public void modificarEntidad(Cliente entidad);
    public void eliminarEntidad(Integer id);
    public Cliente buscarEntidadId(int id); 
}
