package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.enumerador.Modalidad;
public class ListaMateria {

    private static List<Materia> materias = new ArrayList<>();

    public static List<Materia> listarMaterias() {
        if (materias.isEmpty()) {
            materias.add(new Materia(1, "Progamacion visual", "2do año", (short)6, Modalidad.Virtual, new Docente("D1", "Ariel", "Vega", "Variel@gmail.com", "457-5487965"), "APU.2008"));
            materias.add(new Materia(2, "Progamacion Estructurada", "1er año", (short)6, Modalidad.Presencial, new Docente("D2", "Marcelo", "Ibarra", "Ibamarcelo@gmail.com", "457-9835021"), "APU.2008"));
            materias.add(new Materia(3, "Base de datos I", "1er año", (short)5, Modalidad.Presencial, new Docente("D3", "Hector", "Liberatori", "LiberHector@gmail.com", "457-0235412"), "APU.2008"));
            materias.add(new Materia(4, "Algebra II", "2do año", (short)4, Modalidad.Virtual, new Docente("D4", "Maximiliano", "Bonilla", "BoniMaxi@gmail.com", "457-3602458"), "APU.2008"));
            materias.add(new Materia(5, "Ingles VI", "3er año", (short)4, Modalidad.Presencial, new Docente("D5", "Agustina", "Cornell", "AgusCornell@gmail.com", "457-7825145"), "APU.2008"));
            materias.add(new Materia(6, "Herramientas informaticas I", "1er año", (short)6, Modalidad.Virtual, new Docente("D6", "Norma", "Cañizares", "CañiNorma@gmail.com", "457-7345123"), "APU.2008"));
        }
        return materias;
    }

    public static void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public static Materia buscarMaterias(int codigo) {
		 for(Materia i: materias) {
			 if(i.getCodigo()==codigo) {
				 return i;
			 }
		 }
		 return null;
	 }

	 public static void eliminarMaterias(int codigo) {
		 Iterator<Materia> iterator = materias.iterator();
		 while(iterator.hasNext()) {
			 Materia materia = iterator.next();
			 if(materia.getCodigo()==codigo) {
				 iterator.remove();
			 }
		 }
	 }

	 public static void modificarMateria(Materia materia) {
		 for(Materia i: materias) {
			 if(i.getCodigo()==materia.getCodigo()) {
				 i.setNombre(materia.getNombre());
				 i.setCurso(materia.getCurso());
				 i.setCantidadHoras(materia.getCantidadHoras());
				 i.setModalidad(materia.getModalidad());
				 i.setDocente(materia.getDocente());
				 i.setCarrera(materia.getCarrera());
			 }
		 }
	 }
}
