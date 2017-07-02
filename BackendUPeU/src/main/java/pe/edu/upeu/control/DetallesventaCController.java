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
import pe.edu.upeu.model.Detallesventa;

import pe.edu.upeu.service.DetallesventaServis;
import pe.edu.upeu.service.ProductoServis;
import pe.edu.upeu.service.VentasServis;

/**
 *
 * @author Alumnos
 */
@Controller
@RequestMapping("/detallesventa")
public class DetallesventaCController {

    @Autowired
    DetallesventaServis service;

    @Autowired
    ProductoServis serviceProd;

    @Autowired
    VentasServis serviceVent;


    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public ModelAndView listDetallesventa(ModelMap model) {
        List<Detallesventa> lista = service.listarEntidad();
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("ListaDetallesventa", lista);
        modelo.put("mensaje", "Reporte de Detallesventa");
        modelo.put("mensaje", "Reporte de Detallesventa");
        return new ModelAndView("detallesventa/mainDetallesventa", modelo);
    }

    @RequestMapping(value = "buscarDetallesventa", method = RequestMethod.POST)
    public ModelAndView buscarDetallesventa(HttpServletRequest r) {
        String dato = r.getParameter("dato") == null ? "" : r.getParameter("dato");
        List<Detallesventa> lista = service.listarPorNombre(dato);
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("ListaDetallesventa", lista);
        return new ModelAndView("detallesventa/mainDetallesventa", modelo);
    }

    @RequestMapping(value = "eliminarDetallesventa", method = RequestMethod.GET)
    public ModelAndView eliminarDetallesventa(HttpServletRequest r) {
        int idEntidad = Integer.parseInt(r.getParameter("id"));
        service.eliminarEntidadId(idEntidad);
        System.out.println("si llego al metodo");
        return new ModelAndView(new RedirectView("list"));
    }

    @RequestMapping(value = "formDetallesventa", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("modeloDetallesventa") Detallesventa entidad, BindingResult result) {
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaTemporada", "Holasssssssssss");
        modelo.put("listaTemporadaX", service.listarEntidad());
        modelo.put("listaTemporada2", "");
        modelo.put("listaTemporada3", "");
        modelo.put("ListProducto", serviceProd.listarEntidad());
        modelo.put("ListVenta", serviceVent.listarEntidad());
        return new ModelAndView("detallesventa/formDetallesventa", modelo);
    }

    @RequestMapping(value = "guardarDetallesventa", method = RequestMethod.POST)
    public ModelAndView guardarDetallesventaXX(@ModelAttribute Detallesventa entidad,
            BindingResult result) {

        System.out.println("josue " + entidad.toString());
        //methodo para devolver una persona por ID
        // o puedes guardar directamente ID
       // Ventas ventas = new Ventas();
        
        service.guardarEntidad(entidad);

        return new ModelAndView(new RedirectView("list"));
    }

    @RequestMapping(value = "modificarDetallesventa", method = RequestMethod.GET)
    public ModelAndView modificarDetallesventa(HttpServletRequest r) {
        int id = Integer.parseInt(r.getParameter("id"));
        Detallesventa entidad = null;
        entidad = service.buscarEntidadId(id);
        return new ModelAndView("detallesventa/formUDetallesventa", "ModeloDetallesventa", entidad);
    }

    @RequestMapping(value = "modificarDetallesventaX", method = RequestMethod.GET)
    public String modificarDetallesventaX(HttpServletRequest r, Model model) {
        int id = Integer.parseInt(r.getParameter("id"));
        Detallesventa detallesventa = null;
        detallesventa = service.buscarEntidadId(id);
        model.addAttribute("ModeloDetallesventa", detallesventa);
        model.addAttribute("ListProducto", serviceProd.listarEntidad());
        model.addAttribute("ListVenta", serviceVent.listarEntidad());

        return "detallesventa/formUDetallesventa";
    }

    @RequestMapping(value = "actualizarDetallesventa", method = RequestMethod.POST)
    public ModelAndView gactualizarDetallesventaXX(@ModelAttribute("ModeloDetallesventa") Detallesventa entidad,
            BindingResult result) {
        service.modificarEntidadId(entidad);
        return new ModelAndView(new RedirectView("list"));
    }

}
