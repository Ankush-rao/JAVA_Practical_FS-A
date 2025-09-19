package Practical_5;

class Box {
    float width, height, depth;
    Box() { width = height = depth = 0; }
    Box(float w, float h, float d) { width = w; height = h; depth = d; }
    Box(Box b) { width = b.width; height = b.height; depth = b.depth; }
    float volume() { return width * height * depth; }
}
class BoxWeight extends Box {
    float weight;
    BoxWeight() { super(); weight = 0; }
    BoxWeight(float w, float h, float d, float wt) { super(w,h,d); weight = wt; }
    BoxWeight(BoxWeight bw) { super(bw); weight = bw.weight; }
    void display() {
        System.out.printf("Volume = %.2f, Weight = %.2f%n", volume(), weight);
    }
}
public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(2,3,4, 5.5f);
        BoxWeight b2 = new BoxWeight(b1);
        b1.display();
        b2.display();
    }
}
