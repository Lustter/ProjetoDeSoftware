//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Criar um vetor

        double[] notasAlunos = new double[10];

        notasAlunos[0] = 3.0;
        notasAlunos[1] = 5.0;
        notasAlunos[2] = 6.0;
        notasAlunos[3] = 7.0;
        notasAlunos[4] = 8.0;
        notasAlunos[5] = 9.0;
        notasAlunos[6] = 10.0;
        notasAlunos[7] = 11.0;
        notasAlunos[8] = 12.0;
        notasAlunos[9] = 13.0;

        notasAlunos[2] = 10.0;

        System.out.println(notasAlunos[0]);
        System.out.println(notasAlunos[1]);
        System.out.println(notasAlunos[2]);


        //Percorrer o vetor

        for (double nota : notasAlunos) {
            System.out.println(nota);
        }
    }
}