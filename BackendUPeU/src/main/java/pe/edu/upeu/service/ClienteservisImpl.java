/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.model.Cliente;
import pe.edu.upeu.dao.ClienteDao;

/**
 *
 * @author jeanpaul
 */
@Service("cliente")
@Transactional
public class ClienteservisImpl implements ClienteServis{
    
    @Autowired
    public ClienteDao  dao;

    @Override
    public List<Cliente> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Cliente guardarEntidad(Cliente entidad){ return  dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Cliente entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Cliente buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
}
