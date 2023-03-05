package ec.edu.intsuperior.vista;

import java.util.Scanner;

public class Aplicacion {
    
    public static void main(String[] args) {
            Menu();
    }
    
public static void NumeroAcabadoen2() {
    Scanner leer = new Scanner(System.in);

System.out.print("Introduzca el total de numeros que desea ingresar: ");

int todosNumeros = leer.nextInt();

int[] numeros = new int[todosNumeros];

System.out.println("Introduzca " + todosNumeros + " numeros: ");

for (int i = 0; i < numeros.length; i++) {

System.out.print("Numero " + (i + 1) + ": ");

numeros[i] = leer.nextInt();
}
System.out.println("Los numeros introducidos son: ");

try {
for (int i = 0; i < numeros.length; i++) {

System.out.println(numeros[i]);
}
} catch (Exception exc) {
exc.printStackTrace();
}
System.out.println("Y los numeros acabados en 2 son: ");
for (int i = 0; i < numeros.length; i++) {
if (numeros[i] % 10 == 2) {

System.out.println(numeros[i]);

}
}
}

public static void MultipoTresCuatroCinco(){
        Scanner leer=new Scanner(System.in);
        int n1;
        System.out.println("Ingrese un numero");
        n1=leer.nextInt();
        if (n1%3==0) {
            System.out.println("El numero es multiplo de 3");
            } else {
            System.out.println("El numero no es multiplo de 3");
        }
        if (n1%4==0) {
           System.out.println("El numero es multiplo de 4"); 
        } else {
            System.out.println("El numero no es multiplo de 4");
        }
        if (n1%5==0) {
           System.out.println("El numero es multiplo de 5"); 
        } else {
            System.out.println("El numero no es multiplo de 5");
        }
    } 

public static void SueldoMayor() {
 
        Scanner leer = new Scanner(System.in);
  
        String[] empleados = new String[5];
        double[] sueldos = new double[5];

        String nombreMayor;
        double mayorSueldo;

        int i = 0;

        System.out.println("Lectura de nombres y sueldos de empleados: ");                                        
        System.out.print("Nombre del empleado " + (i + 1) + ": ");
        empleados[i] = leer.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = leer.nextDouble();

        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];

        for (i = 1; i < empleados.length; i++) {
            leer.nextLine();
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = leer.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = leer.nextDouble();
          
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            }
        }
        System.out.println("Empleado con mayor sueldo: " + nombreMayor );                                         
        System.out.println("Sueldo: " + mayorSueldo);
    }

public static void PromedioTresValores(){
    Scanner leer =new Scanner(System.in);
        double n1, n2, n3, p;
        System.out.println("Ingrese primera  nota");
        n1=leer.nextDouble();
        System.out.println("Ingrese segunda nota");
        n2=leer.nextDouble();
        System.out.println("Ingrese tercera nota");
        n3=leer.nextDouble();
        
        p=(n1+n2+n3)/3;
        System.out.println("El promedio es " +p);    
    }
    
public static void MayorMenorEdad(){
        Scanner leer=new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad");
        edad=leer.nextInt();
        if (edad>=18) {
            System.out.println("Es mayor de edad");
            
        } else {
            System.err.println("Es menor de edad");}
        
    }

public static void NumeroElementosPositivosNegativosCeros(){
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0;
        int i;                                            
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = leer.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
        System.out.println("Positivos: " + pos);                                                                  
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }

public static void DobleTripleNumero(){
        
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número entero:");
        numero = leer.nextInt();
        System.out.println("Número introducido: " + numero);
        System.out.println("Doble de " + numero + " -> "+ 2*numero);
        System.out.println("Triple de " + numero + " -> "+ 3*numero);                              
       
    }

public static void kilometrosAmetros() {

         Scanner leer = new Scanner(System.in);
         double velocidad;
         System.out.println("Introduzca velocidad en Km/h: ");
         velocidad = leer.nextDouble();
         System.out.println(velocidad + " Km/h -> " + velocidad*1000/3600 + " m/s");                              
}

public static void NumeroSuerte() {
        Scanner leer = new Scanner(System.in);
        int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;                                          
        System.out.println("Introduzca su fecha de nacimiento");
        System.out.print("día: ");
        dia = leer.nextInt();
        System.out.print("mes: ");
        mes = leer.nextInt();
        System.out.print("año: ");
        año = leer.nextInt();
        suma = dia + mes + año;
        cifra1 = suma/1000;     
        cifra2 = suma/100%10;    
        cifra3 = suma/10%10;     
        cifra4 = suma%10;        
        suerte = cifra1 + cifra2 + cifra3 + cifra4;
        System.out.println("Su número de la suerte es: " + suerte);                                               
    }

public static void SumaCifras() {
        Scanner leer = new Scanner(System.in);
        int n, suma, cifra;
        
        do {
            System.out.print("Introduce un número entero positivo: ");
            n = leer.nextInt();
            if (n <= 0) {
            System.out.println("Número no válido");
            }
        } while (n <= 0);
        suma = 0;                            
        while (n != 0) {           
            cifra = n % 10;        
            suma = suma + cifra;  
            n = n / 10; 
        }    
        System.out.println("La suma de sus cifras es: " + suma);
    }

public static void DiasSemana() {
Scanner leer=new Scanner(System.in);
		int D=0;

		System.out.println("Introduce un Número: ");
		D = leer.nextInt();

		if (D == 1)
			System.out.println("Hoy es Lunes");
		else if (D == 2)
			System.out.println("Hoy es Martes");
		else if (D == 3)
			System.out.println("Hoy es Miércoles");
		else if (D == 4)
			System.out.println("Hoy es Jueves");
		else if (D == 5)
			System.out.println("Hoy es Viernes");
		else if (D == 6)
			System.out.println("Hoy es Sábado");
		else if (D == 7)
			System.out.println("Hoy es Domingo");
		else
			System.out.println("Número no válido");

	}	

public static void MediaNumerosPosicionPar() {
 // Calcular la media de los números que estén en las posiciones pares.
        Scanner leer = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        double media = 0;

        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = leer.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){
                media = media + numeros[i];
            }
        }
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);              
    }

public static void AdivinarNumero() {
    Scanner leer = new Scanner(System.in);
    int numeroAleatorio;
    int intento;
    int cont= 10;
    numeroAleatorio = (int) (Math.random()*100+1);
    System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100. "
        + "Tienes 10 intentos.");
    do {
      System.out.println("Número contador: " + cont);
      System.out.print("Introduce el número que creas posible: ");
      intento = leer.nextInt();
      if (intento > numeroAleatorio) {
        System.out.println("El número que buscas es menor, te quedan "
            + (cont-1) + " intentos: ");
      } else if (intento < numeroAleatorio){
        System.out.println("El número que buscas es mayor, te quedan "
            + (cont-1) + " intentos: ");
      } else {
        System.out.print("¡CORRECTO! "+ numeroAleatorio + " era el número que estabas "
            + "buscando, has necesitado " + (10 - (cont-1)) +" intentos.");
      }
      cont--;
    } while (intento != numeroAleatorio && cont > 0);
    if (cont == 0) {
      System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
    }
  }

public static void NumerosPares(){
    Scanner leer = new Scanner(System.in);
    int numero1;
    int numero2;
    int minimo;
    int maximo;
    
    System.out.println("El programa imprimirá todos los números pares entre dos números indicados.");
    System.out.print("Introduce el primer número: ");
    numero1 = leer.nextInt();
    System.out.print("Introduce el segundo número: ");
    numero2 = leer.nextInt();
    
    if (numero1 < numero2) {
      minimo = numero1;
      maximo = numero2;
    } else {
      minimo = numero2;
      maximo = numero1;
    }
    for (int i=minimo+1; i < maximo; i++){
      if (i%2==0){
        System.out.println(i); 
      }
    }
  }

public static void Peso(){
        Scanner leer=new Scanner(System.in);
        double p,e,imc;
       
        System.out.println("Cual es su peso en kilos ");
        p= leer.nextDouble();
        System.out.println("Cual es tu estatura ej:1,50");
        e= leer.nextDouble();
      
        imc= p/(e*e);
        System.out.println("SU IMC ES: "+imc);
  
        if (imc<18.5) {
            System.out.println("BAJO PESO");
        } else if (imc>=18.5 && imc<=24.9) {
            System.out.println("NORMAL");
        } else if (imc>=25 && imc<=29.9) {
            System.out.println("SOBREPESO");
        } else {
            System.out.println("OBESIDAD");
        }
    }
 
 public static void NumeroPerfecto() {
     //Un número es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio número.
        int i, suma = 0, n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = leer.nextInt();
        for (i = 1; i < n; i++) {                          
            if (n % i == 0) {
                suma = suma + i; 
            }
        }
        if (suma == n) {              
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }
 
 public static void NumerosAmigos() {
 //Dos números son amigos si la suma de los divisores propios del primero es igual al segundo y viceversa.
        int i,suma=0, n1, n2;
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce primer número: ");
        n1 = leer.nextInt();
        System.out.print("Introduce segundo número: ");
        n2 = leer.nextInt();
  
        for(i = 1;i < n1;i++){                              
             if(n1%i==0){
                suma=suma+i;
             }
        } 
        if(suma==n2){
           suma=0;
           for(i = 1;i < n2;i++){                                          
                if(n2%i==0){
                   suma=suma+i;
                }
            }
           if(suma==n1){
              System.out.println("Son Amigos");
           }else{
              System.out.println("No son amigos");
           }
        }        
        else{
             System.out.println("No son amigos");
        }
    }
 
 public static void ElementosDuplicados() {
int[] array = {1, 2, 3, 3, 4, 4, 5, 2};
System.out.println("Elementos del array");

for (int i = 0; i < array.length; i++) {
System.out.println("Elemento [" + i + "] = " + array[i]);
}
for (int i = 0; i < array.length - 1; i++) {
    
for (int j = i+1; j < array.length; j++) {

if ((array[i] == array[j]) && (i != j)) {
System.out.println("Elemento duplicado: " + array[j]);
}
}
}
}

public static void Variados() {       
//Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
//Al terminar, mostrará lo siguiente:
//– mayor numero introducido
//– menor numero introducido
//– suma de todos los numeros
//– suma de los numeros positivos
//– suma de los numeros negativos
//– media de la suma (la primera que pido)

Scanner leer = new Scanner(System.in);
        int numeroUsuario=0;
        int menor=0;
        int mayor=0;
        int suma=0;
        double media;
        int contador=-1;
        int sumaPositivos=0;
        int sumaNegativos=0;        
        do{
            if(menor>numeroUsuario){
                menor = numeroUsuario;
            }
            if(mayor<numeroUsuario){
                mayor=numeroUsuario;
            } 
            suma+=numeroUsuario;
            if(numeroUsuario>=0){
                sumaPositivos+=numeroUsuario;
            }else{
                sumaNegativos+=numeroUsuario;
            }
            contador++;
            System.out.println("Introduce un numero");
            numeroUsuario = leer.nextInt();
        }while(numeroUsuario!=-1);
        media = (double) suma / contador;
        System.out.println("El menor es: "+menor);
        System.out.println("El mayor es: "+mayor);
        System.out.println("La suma es: "+suma);
        System.out.println("La suma de los positivos es: "+sumaPositivos);
        System.out.println("La suma de los negativos es: "+sumaNegativos);
        System.out.println("La media es: "+media);
         
    }
    
 public static void ContadorCifras() {
  
        Scanner leer = new Scanner(System.in);
        int numero=0;
        do{
            System.out.println("Introduce un numero");
            numero=leer.nextInt();
        }while(numero<0); int contador=0; for (int i=numero;i>0;i/=10){
            contador++;
        }
  
        if (contador==1){
            System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
        }
  
    }
 
 public static void SepararPalabras() {
      
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
         
        System.out.println("Escribe una frase");
        String frase=leer.next();

        String palabras[] = frase.split(" ");
         
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
         
    }

 public static void DiezNumerosAleatoriosEntreDosNumeros() {
  
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el primero numero: ");
        int num1=leer.nextInt();
  
        System.out.println("Introduce el segundo numero: ");
        int num2=leer.nextInt();
       System.out.println("Numeros aleatorios generados: ");
       
        for (int i=0;i<10;i++){      
            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(numAleatorio);
        }
    }

 public static void DiaLaborableNoLaborable() {
  
        Scanner leer = new Scanner(System.in);
         
        System.out.println("Introduce un dia de la semana");
        String dia = leer.next();
         
        switch(dia){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Es un dia laboral");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("Es un dia festivo");
        }
    }

 public static void Menu() {
         
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion;       
       while(!salir){           
           System.out.println("1. Verificar si un número termina en 2");
           System.out.println("2. Verificar si un número es multiplo de 3,4 o 5");
           System.out.println("3. Averiguar el nombre del empleado con el sueldo mayor");
           System.out.println("4. Sacar el promedio de 3 valores");
           System.out.println("5. Verificar si una persona es mayor o menor de edad");
           System.out.println("6. Contar los números positivos, negativos y ceros existentes");
           System.out.println("7. Sacar el doble y el triple de un número");
           System.out.println("8. Transformar de Kilometros a metros");
           System.out.println("9. Averiguar su numero de la suerte");
           System.out.println("10. Sumar las cifras de un número");
           System.out.println("11. Presentar los dias de la semana segun el numero ingresado");
           System.out.println("12. Sacar la media de los numeros que están en posición par");
           System.out.println("13. Juego para adivinar el numero generado");
           System.out.println("14. Imprimir numeros pares entre dos valores ingresados");
           System.out.println("15. Averiguar IMC (Peso)");
           System.out.println("16. Averiguar si un número es perfecto o no");
           System.out.println("17. Averiguar si dos número son amigos o no");
           System.out.println("18. Mostrar números duplicados");
           System.out.println("19. Realizar varias operaciones");
           System.out.println("20. Contar el número de cifras de un número");
           System.out.println("21. Separar una frase en palabras");
           System.out.println("22. Generar 10 numeros aleatorios entre 2 números");
           System.out.println("23. Averiguar que dias son laborables y que dias no son laborables");
           System.out.println("24.Salir");

           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   NumeroAcabadoen2();
                   break;
               case 2:
                   MultipoTresCuatroCinco();
                   break;
                case 3:
                   SueldoMayor();
                   break;
                case 4:
                   PromedioTresValores();
                   break;
                case 5:
                    MayorMenorEdad();
                    break;
                case 6:
                    NumeroElementosPositivosNegativosCeros();
                    break;
                case 7:
                    DobleTripleNumero();
                    break;
                case 8:
                    kilometrosAmetros();
                    break;
                case 9:
                    NumeroSuerte();
                    break;
                case 10:
                    SumaCifras();
                    break;
                case 11:
                    DiasSemana();
                    break;
                case 12:
                    MediaNumerosPosicionPar();
                    break;
                case 13:
                    AdivinarNumero();
                    break;
                case 14:
                    NumerosPares();
                    break;
                case 15:
                    Peso();
                    break;
                case 16:
                    NumeroPerfecto();
                    break;
                case 17:
                    NumerosAmigos();
                    break;
                case 18:
                    ElementosDuplicados();
                    break;
                case 19:
                    Variados();
                    break;
                case 20:
                    ContadorCifras();
                    break;
                case 21:
                    SepararPalabras();
                    break;
                case 22:
                    DiezNumerosAleatoriosEntreDosNumeros();
                    break;
                case 23:
                    DiaLaborableNoLaborable();
                    break;
                case 24:
                    salir=true;
                    break;
                default:
                   System.out.println("Solo números entre 0 y 20");
           }
            
       }
        
    }
     
}
    