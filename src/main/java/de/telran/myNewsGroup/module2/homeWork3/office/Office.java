package de.telran.myNewsGroup.module2.homeWork3.office;

public class Office {
    public static void main(String[] args) {


       JobActions manager = GreatingTypsWorkers.createManager();
       JobActions worker = GreatingTypsWorkers.createWorker();
       JobActions laseWorker = GreatingTypsWorkers.createLazyWorker();


       manager.doTask(new Task("Task1","Выполнение работы"));
       manager.haveRest();

       worker.doTask(new Task("Task1","Выполнение работы"));
       worker.haveRest();

       laseWorker.doTask(new Task("Task1","Выполнение работы"));
       laseWorker.haveRest();


    }
}
