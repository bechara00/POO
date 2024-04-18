public class Ppo {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan José";
        persona1.apellido = "Bechara Baladi";
        persona1.edad = 41;

        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Ing. Agrónomo";
        carrera1.duracion = 5;
        carrera1.estaEnCurso = false;

        persona1.carrera = carrera1;

       

        System.out.println(
                persona1.darNombreCompleto() + " tiene " + persona1.edad + " años, y es " + persona1.carrera.nombre);
        
    }

}
