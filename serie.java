import java.util.Scanner;

public class Serie {
  /**
 *
 * @author MrOverfl0w
 */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int i, j, n;
        long fact;
        n = scan.nextInt();
        for(i = 1; i <= n; i++){
            fact = 1;
            for(j = 1; j <= i; j++){
                fact *= j;
            }
            System.out.println("Termino: " + i + "\nSerie: " + fact + "\n");
        }
    }  
    
}
