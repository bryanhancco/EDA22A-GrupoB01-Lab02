public class ejercicio2 {
    public int[] rotarIzquierdaArray(int[] A){
        int[] Aiz = new int[A.length];
        int d = 2, aux;
        for (int i = 0; i < Aiz.length; i++) {
            aux = A[i];
            if (i - d >= 0)
                Aiz[i - d] = aux;
        }
        return Aiz;
    }
}
