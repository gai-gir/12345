import java.util.Random;

public class Shekren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Random random = new Random();
		int[] array;
		array = new int[random.nextInt(1000)];
		for (int i = 0; i < array.length; i++) {
		    array[i] = ((int)(Math.random() * random.nextInt()));
		    System.out.print(array[i]+" ");
		}
		//комнтарий для вишенки
		System.out.println("");
		for(int i = array.length-1;i>0;i--)	{
			for(int j = 0;j<=i;j++){
				if (j==i){
					for (;j<0;j--){
						if(array[j]<array[j-1]){
							int s = array[j-1];
							array[j-1] = array[j];
							array[j] = s;
						}
					}
					break;
				}
				if(array[j]>array[j+1]){
					int p = array[j];
					array[j]=array[j+1];
					array[j+1]=p;
					
				}	
			}
		}
		for(int i = 0;i<array.length;i++){
			 System.out.print(array[i]+" ");
		}
	}

	

}
