public class ParcelTracker {
    static class Node{
        String stage;
        Node next;

        Node(String stage){
            this.stage = stage;
            this.next = null;
        }
    }

    static class ParcelChain {
        Node head;

        void addStage(String stage){
            Node newnode = new Node(stage);
            if(head==null){
                head = newnode;
                return;
            }
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
        }

        void addCheckPoint(String afterstage, String checkpoint){
            Node current = head;
            while (current != null) {
                if(current.stage.equals(afterstage)){
                    Node newnode = new Node(checkpoint);
                    newnode.next=current.next;
                    current.next = newnode;
                    return;
                }
                current = current.next;
            }
        }

        void displayTracking() {
            Node current = head;
            while (current != null) {
                System.out.print(current.stage);
                if (current.next != null) System.out.print(" → ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        ParcelChain parcel = new ParcelChain();
        parcel.addStage("Packed");
        parcel.addStage("Shipped");
        parcel.addStage("In Transit");
        parcel.addStage("Delivered");

        parcel.displayTracking();

        parcel.addCheckPoint("Shipped", "Warehouse Scan");
        parcel.displayTracking();

        parcel.addCheckPoint("Delivered", "Thank you");
        parcel.displayTracking();
    }
}
