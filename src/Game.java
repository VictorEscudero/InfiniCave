import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player myPlayer = null;
        boolean running = true;

        Weapon knife = new Weapon("Cuchillo", 15, 75);
        Weapon axe = new Weapon("Hacha", 30, 60);
        Weapon bow = new Weapon("Arco", 20, 55);

        Player elf = new Player("Elfo", 85, 70, 80, knife, 3);
        Player giant = new Player("Gigante", 115, 30, 20, axe, 9);
        Player archer = new Player("Arquero", 100, 50, 50, bow, 6);

        Attack attack1 = new Attack("Picada venenosa", 15);
        Attack attack2 = new Attack("Espadazo", 25);
        Attack attack3 = new Attack("Salto pegajoso", 10);

        Enemy spider = new Enemy("Araña gigante", 25, attack1);
        Enemy skeleton = new Enemy("Esqueleto", 35, attack2);
        Enemy slime = new Enemy("Slime", 30, attack3);

        while (running) {
            System.out.println("""
            INFINICAVE
            ##########
            
            1. Jugar
            2. Sobre el juego
            3. Salir del juego
            """);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    selectCharacter(elf, giant, archer, myPlayer, spider, skeleton, slime);
                    break;
                case 2:
                    about();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }

    public static void about() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sobre el juego");
        System.out.println("--------------");
        System.out.println();
        System.out.println("Escoge a tu personaje y adentrate en una cueva que parece no tener fin y en la cual habitan unas criaturas hostiles.");
        System.out.println("Prepárate para tener que enfrentarte y pelear por sobrevivir, a medida que encuentras objetos que te ayudarán en tu aventura.");
        System.out.println();
        System.out.println("Pulsa una tecla para continuar!                                                                         Juego hecho por ViTTo");
        scanner.nextLine();
    }

    public static void selectCharacter(Player elf, Player giant, Player archer, Player myPlayer, Enemy spider, Enemy skeleton, Enemy slime) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona a tu personaje!");
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("1. " + elf.getPlayerName() + " [vida: " + elf.getHealth() + " | suerte: " + elf.getLuck() + " | estamina: " + elf.getStamina() + " | arma: " + elf.getWeapon().getWeaponName() + " | espacios de inventario: " + elf.getInventoryLimit() + "]");
        System.out.println("2. " + giant.getPlayerName() + " [vida: " + giant.getHealth() + " | suerte: " + giant.getLuck() + " | estamina: " + giant.getStamina() + " | arma: " + giant.getWeapon().getWeaponName() + " | espacios de inventario: " + giant.getInventoryLimit() + "]");
        System.out.println("3. " + archer.getPlayerName() + " [vida: " + archer.getHealth() + " | suerte: " + archer.getLuck() + " | estamina: " + archer.getStamina() + " | arma: " + archer.getWeapon().getWeaponName() + " | espacios de inventario: " + archer.getInventoryLimit() + "]");
        System.out.println();
        System.out.print("Pon el numero del personaje que quieres escoger: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                myPlayer = elf;
                break;
            case 2:
                myPlayer = giant;
                break;
            case 3:
                myPlayer = archer;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        game(myPlayer, spider, skeleton, slime);
    }

    public static void game(Player myPlayer, Enemy spider, Enemy skeleton, Enemy slime) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lvl = 1;

        System.out.println("Eres un " + myPlayer.getPlayerName() + ", te has metido en una cueva.");
        System.out.println("""
                Al intentar salir, no has encontrado la salida, y cada vez pareces adentrarte más.
                Parece que no te queda otra opción, te adentras de lleno en la cueva. Aquí empieza tu aventura.
                
                Presiona cualquier tecla para continuar.
                """);
        scanner.nextLine();

        while (myPlayer.getHealth() >= 1) {
            int randomOption = random.nextInt(4);
            switch (randomOption) {
                case 1:
                    System.out.println("Nivel " + lvl + ". Te adentras un poco más en la cueva...");
                    combat(myPlayer, spider);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Nivel " + lvl + ". Te adentras un poco más en la cueva...");
                    combat(myPlayer, skeleton);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Nivel " + lvl + ". Te adentras un poco más en la cueva...");
                    combat(myPlayer, slime);
                    scanner.nextLine();
                    break;
            }
            lvl++;
        }
    }

    public static void combat(Player myPlayer, Enemy currentEnemy) {
        int enemyLife = currentEnemy.getLife();
        int playerLife = myPlayer.getHealth();

        System.out.println("Te acabas de encontrar a " + currentEnemy.getEnemyName() + "!");
        while (myPlayer.getHealth() >= 1 || currentEnemy.getLife() >= 1) {
            System.out.println(myPlayer.getPlayerName() + ": " + playerLife + " PS | " + currentEnemy.getEnemyName() + ": " + enemyLife + " PS");
            System.out.println("1. Atacar con " + myPlayer.getWeapon().getWeaponName() + " (eficacia de ataque de: " + myPlayer.getWeapon().getPrecision() + "%)");
            System.out.println("2. Usar un objeto del inventario");
            System.out.println("3. Huir (probabilidad debido a estamina de: " + myPlayer.getStamina() + "%)");
            break;
        }
    }
}
