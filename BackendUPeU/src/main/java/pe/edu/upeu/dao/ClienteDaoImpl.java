/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Cliente;

/**
 *
 * @author jeanpaul
 */
@Repository("clienteDao")
public class ClienteDaoImpl extends SysDataAccess<Integer, Cliente> implements ClienteDao{
    
    @SuppressWarnings("unchecked")
    public List<Cliente> listarEntidad(){return getListAll();}
    public Cliente guardarEntidad(Cliente entidad){ return save(entidad);}
    public void modificarEntidad(Cliente entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Cliente buscarEntidadId(int id){return getById(id);}
}
