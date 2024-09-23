package day18;

public class Batch {
    String batch_name;
    int cost;
    String topic;

    //CONSTRUCTOR
    public Batch(){ // empty brackets means default constructor
        this.batch_name = "default_batch";
        this.cost = 95000;
        this.topic = "Java";
    }

    //CUSTOM CONSTRUCTOR
    public Batch(
        String batch_name, 
        int cost, 
        String topic
        ) {
            this.batch_name = batch_name;
            this.cost = cost;
            this.topic = topic;
    }
}
