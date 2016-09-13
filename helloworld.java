import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.shape.*;

class helloworld {
	public static void main(String[] args){
	menu();
	}
	public static void menu(){
		Scanner in = new Scanner(System.in);

		System.out.println("Missing Number (1)");
		System.out.println("Missing Number Part 2 (2)");
		System.out.println("Exit Program (0)");

		int choose = in.nextInt();
		if(choose == 1) mis1();
		if(choose == 2) mis2();
		if(choose == 0) exit();
	}
	public static void exit(){
		System.exit(0);
	}
	public static void mis1(){
		int[] array = new int[11];
		int i;
		int sum = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter 11 numbers");
		for(i = 0; i < array.length; i++){
			array[i] = in.nextInt();
		}
		for(i = 0; i < (array.length); i++){
			if((i+1) % 2 == 0){
				sum += array[i];
			}else{
				sum += (3 * array[i]);
			}
		}
		for(i = 0; i < 10; i++){
			if((sum + i) % 10 == 0){
				missingnum(i);
				menu();
			}
		}
	}
	public static void missingnum(int i){
		System.out.println("The last digit is " + i);
	}
	public static void mis2(){
		int[] array = new int[12];
		int i;
		int x;
		int j;
		int sum = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter 12 digits. Enter -1 in the unknown spot");
		for(i = 0; i < array.length; i++){
			array[i] = in.nextInt();
		}
		for(i = 0; i < array.length; i++){
			if(((i % 2) == 0) & (array[i] != -1)){
				sum += (3 * array[i]);
			}else if(((i % 2) != 0) & (array[i] != -1)){
				sum += array[i];
			}else if(array[i] == -1){
				array[i] = -1;
			}
		}
		System.out.println(sum);
		for(i = 0; i < array.length; i++){
			if((array[i] == -1) & ((i % 2) == 0)){
				for(j = 0; j < 10; j++){
					if(((sum + (3 *j)) % 10) == 0){
						System.out.println("The missing value is " + j);
						array[i] = j;
					}else
						array[i] = -1;
					}
			}else if((array[i] == -1) & ((i % 2) != 0)){
				for(j = 0; j < 10; j++){
					if(((sum + j) % 10) == 0){
						System.out.println("The missing value is " + j);
						array[i] = j;
					}else{
						array[i] = -1;
					}
				}
			}
		}
	}
}
