import java.util.Scanner;

/**
 * Clase que permite la gestión de notas de un estudiante.
 * Incluye métodos para ingresar, comprobar, calcular y mostrar las notas, y para saber si el estudiante ha aprobado o suspendido.
 * 
 * @author Violeta Navarro
 * @version 1.0
 * @since 2025
 */
public class notas {

	 /**
     * Variables para almacenar las notas de las unidades formativas y los acumulados.
     */
    double uf1, uf2, uf3;
    double acu1, acu2, acu3, def;
    
    /**
     * Objeto de la clase Scanner utilizado para la entrada de datos desde el teclado.
     */
    Scanner entrada = new Scanner(System.in);

    /**
     * Método para ingresar las notas del estudiante.
     * Solicita las notas a través del teclado.
     */
    public void IngresaNotas() {
        System.out.println("Ingrese las notas del estudiante");
        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();
        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();
        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }

    /**
     * Método para comprobar que las notas introducidas no son mayores de 10, porque el rango es 0-10.
     * Muestra mensajes indicando si cada nota es válida o incorrecta.
     */
    public void comprobacion() {
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }
        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }
        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Método para calcular la nota definitiva del estudiante.
     * La ponderación es:
     * - Unidad formativa 1: 35%
     * - Unidad formativa 2: 35%
     * - Unidad formativa 3: 30%
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
    }

    /**
     * Método para mostrar las notas ingresadas, las acumuladas y la nota definitiva.
     */
    public void Mostrar() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Método para determinar si el estudiante ha aprobado o suspendido.
     * Un estudiante aprueba si su nota definitiva es mayor o igual a 5.
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendido");
        } else if (def >= 5 && def <= 10) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Error en las notas");
        }
    }

    /**
     * Método principal para ejecutar la clase.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        // Creamos un objeto de la clase y llamamos a los métodos en orden
        notas fc = new notas();
        
        fc.IngresaNotas();
        fc.comprobacion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
    

}
