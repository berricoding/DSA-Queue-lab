import java.util.Scanner;
public class AQ{

    public static void main(String[]args){
        ArrayQueue AQ = new ArrayQueue();
    Scanner scanner = new Scanner(System.in);
    while(true){
    System.out.println("1.Enqueue");
    System.out.println("2.Dequeue");
    System.out.println("3.Display");
    System.out.println("4.Exit");
int num = scanner.nextInt();
switch(num){
    case 1:
        System.out.println("Add a number");
        int n = scanner.nextInt();
        AQ.enqueue(n);
        break;
    case 2:
        AQ.dequeue();
        break;
    case 3:
       AQ.display();
       break;
    case 4:
        scanner.close();
        return;
        default:
            System.out.println("Invalid Option! Please choose 1-4");
}
    }


}
}
