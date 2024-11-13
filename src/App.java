import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Alku testaus että toimiiko.");

        gnome();
        hei();
        // tulostetaan käyttäjälle joulukuusi
        joulukuusi();
    }

    public static void gnome()
    {
        System.out.println("                __");
        System.out.println("             .-'  |");
        System.out.println("            /   <\\|");
        System.out.println("           /     \\'");
        System.out.println("           |_.- o-o");
        System.out.println("           / C  -._)\\");
        System.out.println("          /',        |");
        System.out.println("         |   `-,_,__,'");
        System.out.println("         (,,)====[_]=|");
        System.out.println("           '.   ____/");
        System.out.println("            | -|-|_");
        System.out.println("            |____)_)");
    }

    public static void hei()
    {
        System.out.println("Hei olen tonttu!");

        //Tonttu on melko mielenkiintoinen elementti tässä lähdekoodissa. Koska itse pidän erityisesti kenkien designista, printtaan nyt sitten kenkiä. - Daniel

        String kengänvarsi = "| -|-|_ ";
        String kenkä = "|____)_) ";
        
        System.out.println("Ahh kengät ");
        System.out.println(kengänvarsi);
        System.out.println(kenkä);
    } // kenkien loppu

    public static void joulukuusi(){
        int joulukuusenKoko = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kuinka iso kuusi?");
        joulukuusenKoko=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= joulukuusenKoko; i++) {
            
            for (int j = joulukuusenKoko - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
