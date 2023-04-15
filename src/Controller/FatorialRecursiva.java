package Controller;

public class FatorialRecursiva {

    public FatorialRecursiva(){
        super();
    }

    public int Fatorial(int n){
        if (n == 1){ //Condição de parada
            return 1;
        }
        else {
            return n * Fatorial(n - 1); // chamada da recursiva
            // primeiro n é diminuido até 1, depois é realizidado a multiplicação com o mesmo n
            //4*6= 24
            //3*2= 6
            //2*1= 2
        }
    }
}
