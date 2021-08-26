
package exe1;

import java.util.Scanner;

public class EXE1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ind = 3;
        Book livro[] = new Book[ind];
        Chapter chapter[] = new Chapter[ind];
        
        Author autor = new Author();
        autor.setName("José Francisco");
        
        Library library = new Library();
        library.setName("Biblioteca Municipal");
        
        for (int i = 0; i < livro.length; i++) {
            int soma = i + 1;
            System.out.println("Informe o Número de Capítulos, Nome e ISBN do "
                    + "Livro " + soma);
            Chapter cp = new Chapter();
            cp.setNumber(sc.nextInt());
            chapter[i] = cp;
            Book livroObj = new Book(sc.next(), sc.next(), autor, chapter[i]);
            livro[i] = livroObj;
        }
        
        System.out.println("Livros cadastrados em " + library.getName() + ":\n");
        
        for (int i = 0; i < livro.length; i++) {
            livro[i].showBook();
        }
        
    }
    
}
