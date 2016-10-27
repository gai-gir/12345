import java.util.Random;

public class Puz {

	public static void main(String[] args) {

		final Random random = new Random();
		int[] array;
		array = new int[random.nextInt(1000)];
		for (int i = 0; i < array.length; i++) {
		    array[i] = ((int)(Math.random() * random.nextInt()));
		    System.out.print(array[i]+" ");
		}
		System.out.println("");
		for(int i = array.length-1;i>0;i--)	{
			for(int j = 0;j<i;j++){
				if(array[j]>array[j+1]){
					int a = array[j];
					array[j]=array[j+1];
					array[j+1]=a;
				}	
			}
		}
		for(int i = 0;i<array.length;i++){
			 System.out.print(array[i]+" ");
			}
			System.out.println("");
	}

}
