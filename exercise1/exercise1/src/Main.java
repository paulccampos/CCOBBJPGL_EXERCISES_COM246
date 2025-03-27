import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputusername = scanner.nextLine();

        System.out.println("Enter your password");
        String inputpassword = scanner.nextLine();

        User me = new User(inputusername,inputpassword);

        File myfile = new File("accounts.txt");

        Scanner fileScanner = new Scanner(myfile);
        Boolean accountexists = false;
        while (fileScanner.hasNextLine()){
            String filedata = fileScanner.nextLine();;
            String datausername = filedata.split(",")[0];
            String datapassword = filedata.split(",")[1];
            

            if (inputusername.equals(datausername) && inputpassword.equals(datapassword)){
                System.out.println("welcome " + inputusername + "!");
                accountexists = true;
                break;
            }
        }
        if(!accountexists){
            System.out.println("invalid");
        }
        fileScanner.close();
        scanner.close();
    }
}
