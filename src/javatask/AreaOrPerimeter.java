package javatask;

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * l : (l << 1) + (w << 1);
    }
}
