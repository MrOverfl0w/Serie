import java.util.Scanner;

public class Serie {
  /**
 *
 * @author MrOverfl0w
 */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int i, j, n;
        long fact=1;
        n = scan.nextInt();
        for(i = 1; i <= n; i++){
           fact *= i;
            System.out.println("Termino: " + i + "\nSerie: " + fact + "\n");
        }
    }  
    
}
