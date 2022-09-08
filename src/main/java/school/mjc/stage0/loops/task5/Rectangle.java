package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if (length == 0 || height == 0) return;
        String ud = "8", ins = "8";
        for (int i = 0; i < length-2; i++){
            ud += "8";
            ins += " ";
        }
        ud += "8";
        ins += "8";

        System.out.println(ud);
        for (int i = 0; i < height-2; i++){
            System.out.println(ins);
        }
        System.out.println(ud);

    }
}
