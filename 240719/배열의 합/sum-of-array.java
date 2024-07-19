import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] output = new int[4];
		
		for(int i=0; i<4; i++) {
			int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			for(int j:input) {
				output[i]+=j;
			}
			
		}
		
		for(int i=0; i<4; i++) {
			System.out.println(output[i]);
		}
		
		br.close();
		
	}
}