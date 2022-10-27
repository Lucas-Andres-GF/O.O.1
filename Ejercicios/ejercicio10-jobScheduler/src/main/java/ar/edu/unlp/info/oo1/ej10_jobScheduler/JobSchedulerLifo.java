package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class JobSchedulerLifo extends JobScheduler {

    public JobSchedulerLifo () {
        super(); 
        this.setStrategy("LIFO");
    }
    
    public JobDescription next() {
        JobDescription nextJob = this.getJobs().get(this.getJobs().size() -1);
        this.unschedule(nextJob);
        return nextJob; 
    }

}
