import java.util.ArrayList;

public class TodoList {

   private ArrayList <String> todolist = new ArrayList<>();

    public void add(String todo) {
        todolist.add(todo);
        System.out.println("Добавлено дело " + todo);

        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index <= todolist.size()) {
            todolist.add(index, todo);
        }
        else {
            add(todo);
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(String todo, int index) {

      if (index < todolist.size()) {
        String s = todolist.get(index);
        todolist.set(index, todo);
        System.out.println("Дело " + s + " заменено на " + todo);
      }
      else {
        System.out.println("Дела с таким индесом не существует");
      }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
      if (index < todolist.size()) {
        String s = todolist.get(index);
        todolist.remove(index);
        System.out.println("Дело " + s + " удалено");
      }
      else {
        System.out.println("Дела с таким индексом не существует");
      }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
      for (int i = 0; i < todolist.size(); i++) {
        System.out.println(i + " - " + todolist.get(i));
      }
        return todolist;
    }

}