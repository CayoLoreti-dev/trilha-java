import java.util.HashMap;

public class EstudoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Aline", 10.5);
        notasAlunos.put("Matheus", 8.0);
        notasAlunos.put("Maria", 9.9);

        for (String nome : notasAlunos.keySet()) {
            Double nota = notasAlunos.get(nome);
            System.out.println(nome + ": " + nota);
        }

        Double notaAlice = notasAlunos.get("Alice");
        if (notaAlice != null) {
            System.out.println(notaAlice);
        } else {
            System.out.println("Aluno 'Alice' não encontrado.");
        }
 
    }
}
