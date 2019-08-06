import java.util.Scanner;

public class PrintCityName                  //write first character and program will return the name of city starting from that character
{
public static void main(String[]args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the First Character of the City : ");
    char cityName = scanner.next().charAt(0);       //this will scan the first character of the city

    switch (cityName)
    {
        case 'a': System.out.println("Aberdeen"); break;
        case 'b': System.out.println("Bradford"); break;
        case 'c': System.out.println("Cardiff"); break;
        case 'd': System.out.println("Doncaster"); break;
        case 'e': System.out.println("Exeter"); break;
        case 'f': System.out.println("Fort Worth"); break;

        default: System.out.println("Invalid Entry");           //rest of a-f are invalid city character set as per the requirement
    }
}
}