package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.ListaAlumno;
import ar.edu.unju.fi.model.Alumno;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping("/listado")
    public String getAlumnosPage(Model model) {
        model.addAttribute("alumnos", ListaAlumno.listarAlumnos());
        return "alumnos";
    }

    @GetMapping("/nuevo")
    public String getAlumnosFormPage(Model model) {
        boolean edicion = false;
        model.addAttribute("alumno", new Alumno());
        model.addAttribute("edicion", edicion);
        return "alumnosForm";
    }

    @PostMapping("/guardar")
    public ModelAndView agregarAlumno(@ModelAttribute("alumno") Alumno alumno) {
        ModelAndView modelView = new ModelAndView("alumnos");
        ListaAlumno.agregarAlumno(alumno);
        modelView.addObject("alumnos", ListaAlumno.listarAlumnos());
        return modelView;
    }

    @GetMapping("/modificar/{lu}")
    public String getModificarCarreraPage(Model model, @PathVariable(value="lu") String lu) {
        Alumno encontrado = ListaAlumno.buscarAlumnos(lu);
        if (encontrado != null) {
            model.addAttribute("edicion", true);
            model.addAttribute("alumno", encontrado);
            return "alumnosForm";
        } else {
            return "redirect:/alumno/listado";
        }
    }

    @PostMapping("/modificar")
    public String modificarCarrera(@ModelAttribute("alumno") Alumno alumno) {
        ListaAlumno.modificarAlumno(alumno);
        return "redirect:/alumno/listado";
    }

    @GetMapping("/eliminar/{lu}")
    public String eliminarCarrera(@PathVariable(value="lu") String lu) {
        ListaAlumno.borrarAlumnos(lu);
        return "redirect:/alumno/listado";
    }

}