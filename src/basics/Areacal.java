package basics;

public class Areacal {
    public static void main(String[] args){
        String area="rectangle";
        double PI=3.14, l=6,b=6;
        switch(area){
            case "circle:":
                System.out.println("enter circle area:"+ (Math.PI*5*5));
                break;
            case "rectangle":
                System.out.println("enter rectangle area:"+ (l*b));
                break;
        }
    }
}
