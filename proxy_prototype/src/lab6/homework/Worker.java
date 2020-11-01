package lab6.homework;

public class Worker implements WorkerPrototype{
    private Rules workerRules;
    private String role;

    Worker(String employeeType){
        this.workerRules = new Rules(employeeType);
        this.role = employeeType;
    }

    Worker( Worker worker ){
        this.workerRules = worker.workerRules;
        this.role = worker.role;
    }

    public void addNewRules(String url,  boolean permission){
        workerRules.addRules(url, permission);
    }

    public Rules getWorkerRules(){
        return this.workerRules;
    }


    public WorkerPrototype clone() {
        return new Worker(this);
    }
}
