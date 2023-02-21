import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


                // ============== 1 uzduotis =========================
                System.out.println("==================== 1 užduotis ====================");

                // Sugeneruokite masyvą iš 30 elementų (indeksai nuo 0 iki 29), kurių reikšmės yra atsitiktiniai
                // skaičiai nuo 5 iki 25. Atsispausdinate, pasižiūrite ką gavote.

                int[] numbs = new int[30];
                Random randomNumb = new Random(); // naudosiu nextInt() metoda
                for (int i = 0; i < numbs.length; i++) {
                    numbs[i] = randomNumb.nextInt(5, 25); // uzpildo masyva atsitiktiniais skaiciais nuo 0 (isk) iki 25 (neisk)
                }
                System.out.println("Randomly filled array's elements are:");
                for (int i = 0; i < numbs.length; i++) { // atspausdinu masyvo turini vienoje eiluteje su tarpais
                    System.out.print(numbs[i] + " ");
                }

                System.out.println(" ");

                // ============== 2 uzduotis =========================
                System.out.println("==================== 2 užduotis ====================");

                // Naudodamiesi 1 uždavinio masyvu:
                //a. Suskaičiuokite kiek masyve yra reikšmių didesnių už 10;
                //b. Raskite didžiausią masyvo reikšmę ir jos indeksą arba indeksus jeigu yra keli ir atspausdinkite.
                //c. Suskaičiuokite visų porinių (lyginių) indeksų reikšmių sumą;
                //d.Sukurkite naują masyvą, kurio reikšmės yra 1 uždavinio masyvo reikšmes minus tos reikšmės indeksas; PVZ -
                //Indeksai   0, 1, 2, 3
                //Reiksmes 1, 17, 40, 3
                //Rezultatas 1, 16, 38, 0



                //========= 2-a ==============================
                System.out.println("====== 2a ======");
                // skaiciuojam kiek yra didesniu uz 10
                int count2a1 = 0;
                for (int i = 0; i < numbs.length; i++) {
                    if (numbs[i] > 10) {
                        count2a1++;
                    }
                }
                System.out.println("Didesniu uz 10 yra: " + count2a1);


                //========= 2-b ==============================
                System.out.println("====== 2b ======");
                // ieskom didziausio skaiciaus (-iu) ir jo (-u) indekso



                //  System.out.println("Didziausias skaicius yra: " + countS1 + " jo indeksas: " + numbs[x irasyti]);


                //========= 2-c ==============================
                System.out.println("====== 2c ======");
                // Suskaičiuokite visų porinių (lyginių) indeksų reikšmių sumą;

                int sum = 0;
                int count2c = 0;
                for (int i = 0; i < numbs.length; i++) {
                    if (i % 2 == 0) { // jei skaicius porinis, tada sumuojam
                        count2c++;
                        sum = sum + count2c;

                    }
                }
                System.out.println(count2c);
















                // ============================ End of the file
            }
        }

    }
}