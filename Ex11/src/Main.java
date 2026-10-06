//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner input = new Scanner(System.in);
    Double suma = 0.0;
    Double promig = 0.0;
    System.out.println("INICI DEL PROGRAMA: CÀLCUL DE NOTES");


    for (int i = 1; i <= 4; i++){
        System.out.println("Introdueix la nota numero " + i);
        double nota = input.nextDouble();
        suma = suma + nota;
    }

    promig = suma / 4;
    System.out.println("El promig de les notes és: " + promig);

}
