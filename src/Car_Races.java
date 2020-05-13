/**
 *
 * @author Julius
 */
public class Car_Races {

    public static void main(String[] args) {
        
        int[] m = {1, 3, 5, 2, -2, -1, 10};
        
            for(int i = 0; i < m.length - 1; i++) {
                for(int x = i + 1; x < m.length; x++) {
                   if(m[i] < m[x]) {
                       int temp = m[i];
                       m[i] = m[x];
                       m[x] = temp;
                   } 
                }
            }
            for(int i = 0; i < m.length; i++) {
                System.out.println(m[i]);
            }
        
    }
    
}
