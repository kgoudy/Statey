public class Statey {
    TrafficLight trafficLight = new TrafficLight();

    public void run() {
        for (int i = 0; i < 6; i++) {
            trafficLight.changeState();

            try {
                Thread.sleep(1000); // 1000 ms = 1 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
