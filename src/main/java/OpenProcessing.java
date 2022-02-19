import processing.core.PApplet;

public class OpenProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    private int state[] = { 0,0,0,0 };

    public static void main(String[] args) {
        PApplet.main("OpenProcessing",args);

    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int i=1; i <=4; i++)
            drawCircle(i);
    }

    private void drawCircle(int position) {
        ellipse(state[position-1], calculateHeight(position), DIAMETER, DIAMETER);
        state[position-1] += position;
    }

    private float calculateHeight(int position) {
        return (HEIGHT * position) / 5;
    }


}