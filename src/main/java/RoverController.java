public class RoverController {
    private Rover rover;

    public RoverController(Rover rover) {
        this.rover = rover;
    }

    public String execute(String mission) throws Exception {
        String[] info = mission.split(",");

        Area area = new Area(Integer.parseInt(info[0]), Integer.parseInt(info[1]));
        Rover roverObj = new Rover();
        roverObj.land(area, Integer.parseInt(info[2]), Integer.parseInt(info[3]), info[4]);

        for (int i = 4; i < info.length; i++) {
            executeOneCommend(info, roverObj, i);
        }
        return roverObj.getPosition();
    }

    private void executeOneCommend(String[] info, Rover rover, int i) throws Exception {
        if ("M".equals(info[i])) {
            rover.move();
        } else if ("L".equals(info[i])) {
            rover.turnLeft();
        } else if ("R".equals(info[i])) {
            rover.turnRight();
        }
    }

}
