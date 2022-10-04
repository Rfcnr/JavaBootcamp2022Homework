public class Main {
    public static void main(String[] args) {

        //DAY 3 - Interface Demo

        Worker worker = new Worker();
        OutsourceWorker outsourceWorker = new OutsourceWorker();
        RobotWorkers robotWorkers = new RobotWorkers();

        worker.work();
        worker.eat();
        worker.pay();

        outsourceWorker.work();

        robotWorkers.work();
        robotWorkers.maintenance();
    }
}