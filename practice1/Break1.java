package practice1;

public class Break1 {
	public static void main(String[] args) {
        int sum = 0;
        for (int i=1; ; i++) {
            sum = sum + i;
            if (i == 100) {
                break;
            }
        }
        System.out.println(sum);
        
      //break two 
      
        for (int i=1; i<=10; i++) {
            System.out.println("i = " + i);
            
            for (int j=1; j<=10; j++) {
                System.out.println("j = " + j);
                if (j >= i) {
                    break;
                }
            }
            // breakÌøµ½ÕâÀï
            System.out.println("breaked");
        }
}
}