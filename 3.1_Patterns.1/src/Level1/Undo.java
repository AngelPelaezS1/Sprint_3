package Level1;

import java.util.ArrayList;

public class Undo {

    private static Undo instance;
    private ArrayList<String> commands;

    private Undo (){
        commands = new ArrayList<String>();
    }

    public static Undo getInstance() {
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }
    public void addCommands(String command) {
        if(command != null){
            commands.add(command);
        }
    }
    public void removeLastCommand(){
        if(commands.isEmpty()){
            System.out.println("No commands to remove");
        }else{
            commands.remove(commands.size() - 1);
            System.out.println("Last command removed");
        }
    }
    public void listCommands () {
        if(commands.isEmpty()){
            System.out.println("No commands in the list");
        }else{
            commands.stream().forEach(System.out::println);
        }
    }
}
