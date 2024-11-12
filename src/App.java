public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Alku testaus että toimiiko.");
        // tuleeko tämä läpi /koomates

        gnome();
        hei();
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
    }
}
