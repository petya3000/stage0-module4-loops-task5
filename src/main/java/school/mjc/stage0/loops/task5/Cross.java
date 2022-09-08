package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String line = "";

        for (int i = 0; i < sideLength; i++){
            for (int j = 0; j < sideLength; j++) {
                if (i == sideLength/2) line += "8";
                else if (j == sideLength/2) line += "8";
                else line += " ";
            }
            System.out.println(line);
            line = "";
        }
    }
}
