public class ejercicio1 {
    public int[] invertirArray(int[] A){
        int[] Ain = new int[A.length];
        for (int i = Ain.length - 1, j = 0; i >= 0; i--, j++) {
            Ain[j] = A[i];
        }
        return Ain;
    }
}
