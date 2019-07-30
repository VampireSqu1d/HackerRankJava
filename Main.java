import javax.swing.text.NumberFormatter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static int[] race(int v1, int v2, int g) {// debe regresar un arreglo de tres celdas [horas, min, seg]
        if (v1 >= v2) return null;

        int[] resultado = new int[3];
        int tiempo  = g * (3600) / (v2 - v1);

        resultado[0] = tiempo / 3600;
        resultado[1] = (tiempo % 3600) / 60 ;
        resultado[2] = tiempo % 60;

        return  resultado;
    }

    public static long power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        if (n == 0 && p == 0)
            throw new Exception("n and p should be zero");
        return (long) Math.pow(n,p);
    }

    public static int reloj(int[][] arr){
        int a,b,c,d,e,f,g, holder = 0;
        int resultado = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                a = arr[i][j];
                b = arr[i+1][j];
                c = arr[i+2][j];
                d = arr[i+1][j+1];
                e = arr[i][j+2];
                f = arr[i+1][j+2];
                g = arr[i+2][j+2];
                holder = a+b+c+d+e+f+g;

                if (holder >= resultado)
                    resultado = holder;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
       /*Scanner scanner = new Scanner(System.in);
       ArrayList[] lists = new ArrayList[scanner.nextInt()];
        int d, q , x, y;
        for (int i = 0; i < lists.length; i++) {
            d = scanner.nextInt();
            lists[i] = new ArrayList();
            for (int j = 0; j < d; j++)
                lists[i].add(scanner.nextInt());
        }
        q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
          x = scanner.nextInt();
          y = scanner.nextInt();
          try {
              System.out.println(lists[x - 1].get( y));
          } catch (Exception e) {
              System.out.println("ERROR!");
          }
        }*/
       /*Scanner scanner = new Scanner(System.in);
        List lista = new ArrayList();
        int tamanio, queries;
        tamanio = scanner.nextInt();
        for (int i = 0; i < tamanio ; i++) {
            lista.add(scanner.nextInt());
        }
        queries = scanner.nextInt();
        for (int i = 0; i < queries ; i++) {
            if (scanner.next().equals("Insert"))
                lista.add(scanner.nextInt(), scanner.nextInt());
            else
                lista.remove(scanner.nextInt());
        }

        for (Object o: lista )
            System.out.printf("%s ", o);*/
       /*Scanner scanner = new Scanner(System.in);
       int x, y, division;
       try{
           x = scanner.nextInt();
           y = scanner.nextInt();
           division = x/ y;
           System.out.println(division);

       } catch(InputMismatchException e){
           System.out.print(e.getClass().getName());
       }
       catch (Exception e) {
           System.out.println(e);
       }*/
       /*Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(reloj(arr));
        scanner.close();*/

    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;
        smallest = largest = s.substring(0, k);

        for (int i = 1; i < s.length() - k + 1; i++) {
            String actual = s.substring(i, i + k);
            if (actual.compareTo(smallest) > 0)
                smallest = actual;
            if (actual.compareTo(largest) < 0)
                largest = actual;
        }
        return smallest + "\n" + largest;
    }

    public static String Tickets(int[] peopleInLine){
        String answer;

        int change = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            int current = peopleInLine[i];
            if (current == 25)
                change = change + current;
            else
                change = change - (current - 25);
        }

        if (change >= 0)
            answer = "YES";
        else
            answer = "NO";

        return answer;
    }

    public static int Perimeter(int n){
        int perimetro = 0;
        if (n < 0) return 0;

        int[] cuadrados = new int[ n + 2];

        for (int i = 0; i < cuadrados.length; i++) {
            if (i > 1)
                cuadrados[i] = cuadrados[i -1] + cuadrados[i - 2];
            else
                cuadrados[i] = i;
        }

        for (int i = 0; i < cuadrados.length; i++) {
            System.out.println(cuadrados[i]);
            perimetro = perimetro + cuadrados[i];
        }

        return 4*perimetro;
    }

}

