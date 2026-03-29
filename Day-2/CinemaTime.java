import java.util.*;

class InvalidTimeFormatException extends Exception{
    public InvalidTimeFormatException(String message){
        super(message);
    }
}
public class CinemaTime {
    private List<String> titles = new ArrayList<>();
    private List<String> times = new ArrayList<>();

    public void Add(String title, String time) throws InvalidTimeFormatException{
        if(!isValidTime(time)){
            throw new InvalidTimeFormatException("Invalid time format - "+time);
        }
        titles.add(title);
        times.add(time);
    }

    public void search(String key){
        boolean found=false;
        for(int i=0;i<titles.size();i++){
            if(titles.get(i).toLowerCase().contains(key.toLowerCase())){
                System.out.println(titles.get(i)+" is on time - "+times.get(i));
                found = true;
            }
        }
        if(!found){
            System.out.println("No movie found of this title -"+key);
        }
    }

    public void Display(){
        try{
            for(int i=0;i<titles.size();i++){
                System.out.println(titles.get(i)+" is on time - "+times.get(i));
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Error Displaying movies - "+e.getMessage());
        }
    }

    private boolean isValidTime(String time){
        String[] parts = time.split(":");
        if(parts.length != 2) return false;
        try{
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            return (h>=0 && h<=23) && (m>=0 && m<=59);
        }
        catch(NumberFormatException e){
            return false;
        }
    }

    public static void main(String args[]){
        CinemaTime cinema = new CinemaTime();
        Scanner sc = new Scanner(System.in);

        try{
            cinema.Add("Avengers", "18:30");
            cinema.Add("Batman", "21:30");
            cinema.Add("Breaking Bad", "23:50");
            cinema.Add("Interstellar", "25:30");
        }
        catch(InvalidTimeFormatException e){
            System.out.println(e.getMessage());
        }

        cinema.Display();

        System.out.println("Searching for Batman - ");
        cinema.search("Batman");

        sc.close();
    }
     
}