package de.telran.javaPro.summary.work_24_03_15.works.office;

public class GreatingTypsWorkers {

        public static JobActions createManager() {
            return new Manager();
        }

        public static JobActions createWorker() {
            return new Worker();
        }

        public static JobActions createLazyWorker() {
            return new LazyWorker();
        }

        private static class Manager implements JobActions {
            @Override
            public void doTask(Task task) {
                System.out.println("Я ставлю задачи работникам.");
            }

            @Override
            public void haveRest() {
                System.out.println("Я пью кофе во время отдыха.");
            }
        }

        private static class Worker implements JobActions {
            @Override
            public void doTask(Task task) {
                System.out.println("Я выполняю задание менеджера.");
            }

            @Override
            public void haveRest() {
                System.out.println("Я курю во время отдыха.");
            }
        }

        private static class LazyWorker implements JobActions {
            @Override
            public void doTask(Task task) {
                System.out.println("Я сачкую в рабочее время.");
            }

            @Override
            public void haveRest() {
                System.out.println("Пора выдвигаться в шашлычную.");
            }
        }
    }


