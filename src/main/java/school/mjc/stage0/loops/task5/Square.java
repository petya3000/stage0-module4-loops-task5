package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if (sideLength == 0) return;
        String ud = "", ins = "";
        ins += "8";
        for (int i = 0; i < sideLength; i++){
            ud += "8";
            if (i >= sideLength-2) continue;
            ins += " ";
        }
        ud += "\n";
        ins += "8\n";
        System.out.print(ud);
        for (int i = 0; i < sideLength-2; i++){
            System.out.print(ins);
        }
        System.out.print(ud);
    }
}
