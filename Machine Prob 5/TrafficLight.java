public class TrafficLight {
    protected String color;
    protected int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void printStatus() {
        if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        } else if (color.equalsIgnoreCase("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color");
        }
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 10);
        trafficLight.printStatus();

        trafficLight.setColor("green");
        trafficLight.printStatus();
    }
}
