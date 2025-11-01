import java.util.ArrayList;
import java.util.List;

public class taskList {
    List<task> tasks; //atributo para armazenar as tarefas

    public taskList(){
        this.tasks = new ArrayList<>(); //construtor
    }

    public void addTask (String description){
        task newTask = new task(description); //metodo para adicionar uma nova tarefa
        this.tasks.add(newTask);
        System.out.println("Trefa adicionada : " + description);
    }

    public void listTasks (){
        if (tasks.isEmpty()) {
            System.out.println("A lista de tarefas esta vazia"); //metodo para listar todas as tarefas
            return;
        }
        System.out.println("\n --- LISTA DE TAREFAS ---");
        for (int i = 0; i< tasks.size();i++){
            System.out.println((i+1) + ". " + tasks.get(i)) ; //usa o medoto toString() da classe tarefa para exibicao
        }
        System.out.println("------------------------\n");
    }

    public void removeTask (int indice){
        int index = indice -1;

        if (index >=0 && index < tasks.size()){
            task taskCleared = tasks.remove(index);
            System.out.println("Tarefa removida: "+ taskCleared.getDescription());
        }else{
            System.out.println("Índice de tarefa inválido.");
        }
    }


    public void markAsDone(int indice) {
        int index = indice - 1;
        if (index >=0 && index < tasks.size()){
            tasks.get(index).markAsDone();
            System.out.println("Tarefa " + indice + "marcada como concluida." );
        }else{
            System.out.println("Indice de tarefa invalido");
        }
    }
}
