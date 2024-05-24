public class StudentGrades {
    public static void main(String[] args) {
    	// Initialize the array with values
        double[][] grade1 = {
            {90.5, 85.0, 78.5},
            {92.3, 88.7},
            {85.8}
        };
        //Create the array using the new keyword and then assign values to it
        double[][] grade2 = new double[3][];
        grade2[0] = new double[]{90.5, 85.0, 78.5};
        grade2[1] = new double[]{92.3, 88.7};
        grade2[2] = new double[]{85.8};

        //prints the contents of the array
        print2DArray(grade1);
        System.out.println();
        print2DArray(grade2);
    }

    public static void print2DArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("student" + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%.1f ", array[i][j]);
            }
            System.out.println(); 
        }
    }
}
