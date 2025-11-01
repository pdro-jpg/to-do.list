import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        taskList list = new taskList();
        int option = -1;

        System.out.println("To-Do List em Java");

        while (option!=0){
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluida");
            System.out.println("4. Remover tarefa");
            System.out.println("0. Sair");
            System.out.println("Opcao: ");

            if (sc.hasNextInt()){
                option = sc.nextInt();
                sc.nextLine();
            }else{
                System.out.println("Entrada invalida. Por favor digite um numero.");
                sc.nextLine();
                continue;
            }
            switch (option) {
                case 1:
                    System.out.println("Digite a descrição da nova tarefa: ");
                    String description = sc.nextLine();
                    list.addTask(description);
                    break;
                case 2:
                    list.listTasks();
                    break;
                case 3:
                    list.listTasks();
                    if (!list.tasks.isEmpty()){
                        System.out.println("Digite o numero da tarefa a marcar como concluida.");
                        if (sc.hasNextInt()){
                            int indexDone = sc.nextInt();
                            list.markAsDone(indexDone);
                        }else{
                            System.out.println("Entrada invalida.");
                        }
                        sc.nextLine();
                    }
                    break;
                case 4:
                    list.listTasks();
                    if(!list.tasks.isEmpty()){
                        System.out.println("Digite o numero da tarefa a remover");
                        if (sc.hasNextInt()){
                            int indexRemove = sc.nextInt();
                            list.removeTask(indexRemove);
                        }else{
                            System.out.println("Entrada invalida.");
                        }
                        sc.nextLine();
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o progama.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    sc.close();
    }

}