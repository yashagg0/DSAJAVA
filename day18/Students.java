package day18;

public class Students {
    int roll;
    String name;
    Batch enrolled_Batch;

    public Students(){
        this.roll = 0;
        this.name = "default";
        this.enrolled_Batch = new Batch();
    }

    public Students(
        int roll, 
        String name,
        String batch_name,
        int batch_cost,
        String topic
        ) {
            this.roll = roll;
            this.name = name;
            this.enrolled_Batch.batch_name = batch_name;
            this.enrolled_Batch.cost = batch_cost;
            this.enrolled_Batch.topic = topic;

        }
}
