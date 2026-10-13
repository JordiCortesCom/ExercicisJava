import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
/*
Treball a l'aula: 10%
Exercici: 20%
Pràctica: 40%
Examen: 30%
 */
    Scanner input = new Scanner(System.in);
    double suma = 0.0;
    double promig = 0.0;

    System.out.println("---------- VERSIÓN HALLOWEEN ----------");
    System.out.println("Programa de càlcul de notes terrorífiques:");
    System.out.println("---------UUUUUUUUUUUUUU-----------------");

    /*
    // FOR SIMPLE
    for (int i = 1; i <= 4; i++){
        System.out.println("Introdueix la nota numero " + i);
        double nota = input.nextDouble();
        suma = suma + nota;
    }

    promig = suma / 4;
    */

/*
    // SENSE FOR
    System.out.println("Introdueix nota Treballa a l'aula");
    double notaAula = input.nextDouble();

    System.out.println("Introdueix nota Exercicis");
    double notaExercicis = input.nextDouble();

    System.out.println("Introdueix nota Practica");
    double notaPractica = input.nextDouble();

    System.out.println("Introdueix nota Examen");
    double notaExamen = input.nextDouble();

    promig = 0.1*notaAula + 0.2*notaExercicis + 0.4*notaPractica + 0.3*notaExamen;
*/
    // AMB FOR I EXTRA
    for (int i = 1; i <= 4; i++) {
        String element = "";
        double nota = 0.0;
        double pes = 0.0;

        switch (i) {
            case 1:
                element = "notaAula";
                pes = 0.1;
                break;
            case 2:
                element = "notaExercicis";
                pes = 0.2;
                break;
            case 3:
                element = "notaPractica";
                pes = 0.4;
                break;
            case 4:
                element = "notaExamen";
                pes = 0.3;
                break;
        }
        System.out.println("Introdueix la nota: " + element);
        nota = input.nextDouble();
        promig = promig + nota*pes;

    }
    System.out.println("El promig de les notes és: " + promig);

}
