
package exe4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class EXE4 {

    public static void main(String[] args) {
        
        
        // 1
        
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int num[] = new int[3];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite um número: ");
            num[i] = sc.nextInt();
            set.add(num[i]);
        }
        
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < num.length; i++) {
            System.out.println(it.next());
        }
        
        // 2
        Map<String, String> dados = new HashMap<>();
        String idN[] = new String[3];
        String idT[] = new String[3];
        
        for (int i = 0; i < idN.length; i++) {
            System.out.println("Digite o nome: ");
            idN[i] = sc.next();
            System.out.println("Digite o telefone: ");
            idT[i] = sc.next();
            dados.put(idN[i], idT[i]);
        }
        
        String nom = "";
        while (!nom.equals("fim")) {
            System.out.println("Para buscar telefone por nome, digite o nome: "
                    + "(Digite fim para sair)");
            nom = sc.next();

            for (int i = 0; i < idN.length; i++) {
                if (nom.equals(idN[i])) {
                    System.out.println("Telefone de " + idN[i] + " = " + idT[i]);
                }
            }
        }
        
        String pref = "";
        while (!pref.equals("fim")) {
            System.out.println("Digite um prefixo para buscar os dados"
                    + "(Digite fim para sair)");
            pref = sc.next();

            for (int i = 0; i < idN.length; i++) {
                if (nom.equals(idN[i])) {
                    System.out.println("Telefone de " + idN[i] + " = " + idT[i]);
                }
            }
        }
        
        
    }
    
}
