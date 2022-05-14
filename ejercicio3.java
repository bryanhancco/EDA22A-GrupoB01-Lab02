public class ejercicio3 {
    public void trianguloRecursivo(int base){
        if(base == 1){
            System.out.println("*");
        } else {
            trianguloRecursivo(base -1);
            for (int i = 0; i < base; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
