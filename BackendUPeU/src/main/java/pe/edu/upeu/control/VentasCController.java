/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.control;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.edu.upeu.model.Ventas;
import pe.edu.upeu.model.Almacen;
import pe.edu.upeu.model.Cliente;
import pe.edu.upeu.model.Documentos;
import pe.edu.upeu.model.Empleado;
import pe.edu.upeu.service.VentasServis;
import pe.edu.upeu.service.AlmacenServis;
import pe.edu.upeu.service.ClienteServis;
import pe.edu.upeu.service.DocumentosServis;
import pe.edu.upeu.service.EmpleadoServis;

/**
 *
 * @author Alumnos
 */
@Controller
@RequestMapping("/ventas")
public class VentasCController {

    @Autowired
    VentasServis service;

    @Autowired
    AlmacenServis serviceAlm;

    @Autowired
    ClienteServis serviceClie;

    @Autowired
    DocumentosServis serviceDoc;

    @Autowired
    EmpleadoServis serviceEmpl;

    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public ModelAndView listVentas(ModelMap model) {
        List<Ventas> lista = service.listarEntidad();
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("ListaVentas", lista);
        modelo.put("mensaje", "Reporte de Ventas");
        modelo.put("mensaje", "Reporte de Ventas");
        return new ModelAndView("ventas/mainVentas", modelo);
    }

    @RequestMapping(value = "buscarVentas", method = RequestMethod.POST)
    public ModelAndView buscarVentas(HttpServletRequest r) {
        String dato = r.getParameter("dato") == null ? "" : r.getParameter("dato");
        List<Ventas> lista = service.listarPorNombre(dato);
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("ListaVentas", lista);
        return new ModelAndView("ventas/mainVentas", modelo);
    }

    @RequestMapping(value = "eliminarVentas", method = RequestMethod.GET)
    public ModelAndView eliminarVentas(HttpServletRequest r) {
        int idEntidad = Integer.parseInt(r.getParameter("id"));
        service.eliminarEntidadId(idEntidad);
        System.out.println("si llego al metodo");
        return new ModelAndView(new RedirectView("list"));
    }

    @RequestMapping(value = "formVentas", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("modeloVentas") Ventas entidad, BindingResult result) {
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaTemporada", "Holasssssssssss");
        modelo.put("listaTemporadaX", service.listarEntidad());
        modelo.put("listaTemporada2", "");
        modelo.put("listaTemporada3", "");
        modelo.put("ListCliente", serviceClie.listarEntidad());
        modelo.put("ListAlmacen", serviceAlm.listarEntidad());
        modelo.put("ListDocumento", serviceDoc.listarEntidad());
        modelo.put("ListEmpleado", serviceEmpl.listarEntidad());
        return new ModelAndView("ventas/formVentas", modelo);
    }

    @RequestMapping(value = "guardarVentas", method = RequestMethod.POST)
    public ModelAndView guardarVentasXX(@ModelAttribute Ventas entidad,
            BindingResult result) {

        System.out.println("josue " + entidad.toString());
        //methodo para devolver una persona por ID
        // o puedes guardar directamente ID
       // Ventas ventas = new Ventas();
        
        service.guardarEntidad(entidad);

        return new ModelAndView(new RedirectView("list"));
    }

    @RequestMapping(value = "modificarVentas", method = RequestMethod.GET)
    public ModelAndView modificarVentas(HttpServletRequest r) {
        int id = Integer.parseInt(r.getParameter("id"));
        Ventas entidad = null;
        entidad = service.buscarEntidadId(id);
        return new ModelAndView("ventas/formUVentas", "ModeloVentas", entidad);
    }

    @RequestMapping(value = "modificarVentasX", method = RequestMethod.GET)
    public String modificarVentasX(HttpServletRequest r, Model model) {
        int id = Integer.parseInt(r.getParameter("id"));
        Ventas ventas = null;
        ventas = service.buscarEntidadId(id);
        model.addAttribute("ModeloVentas", ventas);
        model.addAttribute("ListCliente", serviceClie.listarEntidad());
        model.addAttribute("ListEmpleado", serviceEmpl.listarEntidad());
        model.addAttribute("ListDocumento", serviceDoc.listarEntidad());

        return "ventas/formUVentas";
    }

    @RequestMapping(value = "actualizarVentas", method = RequestMethod.POST)
    public ModelAndView gactualizarVentasXX(@ModelAttribute("ModeloVentas") Ventas entidad,
            BindingResult result) {
        service.modificarEntidadId(entidad);
        return new ModelAndView(new RedirectView("list"));
    }

}
