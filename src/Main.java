import java.util.*;

public class Main {
    static int[][] returnArray = new int[3][3];


    public static void main(String[] args) {

        populateArray();
        boolean run = true;
        while(run){

            System.out.println(Arrays.deepToString(returnArray));

            Scanner obj = new Scanner(System.in);
            System.out.println("what would you like to do?");
            System.out.println("1. edit cells");
            System.out.println("2. find rows w/ same number");
            System.out.println("3. quit");
            String input = obj.nextLine();

            if(input.equals("1")){
                editCells();

            }
            else if (input.equals("2")){
                findRows();
            }
            else if (input.equals("3")){
                run = false;
            }
        }

    }

    public static void populateArray(){
        for(int i = 0; i < returnArray.length; i++){
            for (int j = 0; j < returnArray[0].length; j++){
                int random = (int)(Math.random() * 10) + 1;
                returnArray[i][j] = random;
            }
        }
    }
    public static void editCells(){
        Scanner findRow = new Scanner(System.in);
        System.out.println("which row?");
        int row = findRow.nextInt();

        Scanner findCol = new Scanner(System.in);
        System.out.println("which column?");
        int col = findCol.nextInt();

        Scanner findInput = new Scanner(System.in);
        System.out.println("what number?");
        int input = findInput.nextInt();

        returnArray[row][col] = input;
    }

    public static void findRows(){
        for (int i = 0; i < returnArray.length; i++){
            if (returnArray[i][0] == returnArray[i][1] && (returnArray[i][1] == returnArray[i][2])) {
                System.out.println("Found matching @ row #" + i + " " + Arrays.toString(returnArray[i]));
            }
        }
    }
}