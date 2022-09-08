package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        String str = "";
        int start = height % 2 == 0 ? height/2 - 1 : height/2;

        for (int i = 0; i < height/2; i++){
            for (int j = 0; j < height; j++){
                if ((j <= i-1 || j >= height - i )) System.out.print(" ");
                else System.out.print("8");
            }
            System.out.println();
        }
        for (int i = start; i >= 0; i--){
            for (int j = 0; j < height; j++){
                if ((j <= i-1 || j >= height - i )) System.out.print(" ");
                else System.out.print("8");
            }
            System.out.println();
        }
    }
}
