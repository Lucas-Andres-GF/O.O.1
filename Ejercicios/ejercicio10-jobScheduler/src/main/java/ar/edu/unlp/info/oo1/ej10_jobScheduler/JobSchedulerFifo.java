package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class JobSchedulerFifo extends JobScheduler {
    
    public JobSchedulerFifo () {
        super(); 
        this.setStrategy("FIFO");
    }
    
    public JobDescription next() {
        JobDescription nextJob = this.getJobs().get(0);
        this.unschedule(nextJob);
        return nextJob;
    }
}
