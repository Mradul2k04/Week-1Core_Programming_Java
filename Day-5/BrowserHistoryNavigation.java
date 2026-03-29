class page{
    String url;
    page next;
    page prev;

    public page(String url){
        this.url = url;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory{
    page current;

    void visit(String url){
        page newpage = new page(url);
        while(current!=null){
            current.next = newpage;
            newpage.prev = current;
        }
        current = newpage;
        System.out.println("Visited = " + current.url);
    }

    void back(){
        if(current != null && current.prev != null){
            current = current.prev;
            System.out.println("Previous page = " + current.url);
        }
        else{
            System.out.println("No previous page");
        }
    }

    void forward(){
        if(current != null && current.next != null){
            current = current.next;
            System.out.println("Forward page = " + current.url);
        }
        else{
            System.out.println("No forward page");
        }
    }

    void showcurrentpage(){
        if(current != null){
            System.out.println("Current page = " + current.url);
        }
        else{
            System.out.println("No page avialable");
        }
    }
}

public class BrowserHistoryNavigation{
    public static void main(String args[]){
        BrowserHistory browserhistory = new BrowserHistory();

        browserhistory.visit("google.com");
        browserhistory.visit("youtube.com");
        browserhistory.visit("mail.google.com");
        browserhistory.visit("leetcode.com");
        browserhistory.visit("classroom.google.com");;

        browserhistory.back();
        browserhistory.showcurrentpage();

        browserhistory.back();
        browserhistory.showcurrentpage();

        browserhistory.back();
        browserhistory.showcurrentpage();

        browserhistory.forward();
        browserhistory.showcurrentpage();
    }
}
