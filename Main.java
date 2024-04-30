import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Datos del Empleado

        // System.out.println("Inserte su Nombre(s) y Apellidos: ");
        // String nombreEmpleado = scanner.nextLine();

        // System.out.println("Inserte su Salario Base: ");
        // int salarioBase = scanner.nextInt();

        // System.out.println("Inserte su cantidad de horas trabajas (por semana): ");
        // int horasTrabajo = scanner.nextInt();

        // System.out.println("Inserte la cantidad de horas extras(por semana): ");
        // int horasExtras = scanner.nextInt();

        // System.out.println("Inserte la cantidad de horas de ausencia (por semana): ");
        // int horasAusentes = scanner.nextInt();

        System.out.println("Seleccione su tipo de contrato: ");
        System.out.println("1. Contrato Fijo");
        System.out.println("2. Contrato por Horas");
        
        int opcionContrato = scanner.nextInt();

        switch (opcionContrato) {
            case 1:
                
                break;
            case 2:

                break;
            default:
                System.out.println("Opcion no Disponible. Seleccione otra Opcion...");
                break;
        }


        //Formulas de Nomina

        // int tarifaPorHora = salarioBase / horasTrabajo;
        // double porcentajeDeducciones = 16.5;
        // int salarioBruto = salarioBase * (horasTrabajo + horasExtras);
        // double deducciones = salarioBruto / 16.5;
        // double salarioNeto = salarioBruto - deducciones; 




    }  
}