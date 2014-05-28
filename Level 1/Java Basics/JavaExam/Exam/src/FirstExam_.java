import java.util.Scanner;

public class FirstExam_ {

	public static void main(String[] args) {
		
		int minutes = 0;
		Scanner input = new Scanner(System.in);
		String currentLine;
		
		
		
		while(true){
			currentLine = input.nextLine();
			if(currentLine.equals("End")){
				break;
			}else{
				String[] splited = currentLine.split(":");
				minutes += Integer.parseInt(splited[1]);
				minutes += (60 * Integer.parseInt(splited[0]));
			}
		}
		
		int hours = minutes / 60;
		int returnMinutes = minutes % 60;
		String minutesInString = Integer.toString(returnMinutes).length() == 1? "0" + returnMinutes : "" + returnMinutes;
		
		System.out.println(hours + ":" + minutesInString );
		

	}

}
