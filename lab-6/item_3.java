public class item_3 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for(int i =0; i<20;i++){
            queue.enqueue(i+1);
        }
        System.out.println("Queue is; ");
        int cou = 0 ;
        while(!queue.empty()){
            System.out.println("\t"+queue.dequeue()+"\n");
            cou++ ;
            if(cou == 5){
                System.out.println("");
                cou = 0 ;
            }
        }
    }
}
