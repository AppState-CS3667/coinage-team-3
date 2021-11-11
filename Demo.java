import java.util.Scanner;

public class Demo{
    public static void main(String[] args){
        System.out.println("This is the coin demo class.");
        System.out.println("What country's coins would you like "+
                           "to create? Type \"USD\" or \"CAD\".");
        Scanner s = new Scanner(System.in);
        String country = s.nextLine();
        MintFactory mf;
        if (country.equals("USD")){
            mf = USDMintFactory.getInstance();
        }
        else if (country.equals("CAD")){
            mf = CADMintFactory.getInstance();
        }
        else {
            System.out.println("Sorry, that input doesn't match.");
        }
        
    }
}
