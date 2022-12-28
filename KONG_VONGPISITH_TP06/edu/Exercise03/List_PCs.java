package KONG_VONGPISITH_TP06.edu.Exercise03;

import java.util.ArrayList;

public class List_PCs {
    private int ID_PC;
    private String condition;

    public List_PCs() {
    }

    public List_PCs(int ID_PC, String condition) {
        this.ID_PC = ID_PC;
        this.condition = condition;
    }

    ArrayList<List_PCs> list_pc = new ArrayList<List_PCs>();

    public void add_PC_List(int id, String Condition) {
        list_pc.add(new List_PCs(id, Condition));
    }

    public void show_pc() {
        for (List_PCs list : list_pc) {
            System.out.printf("Computer %d \t Condition: %s\n", list.ID_PC, list.condition);

        }
    }

    public void isGood() {
        for (List_PCs list : list_pc) {
            if (list.condition.equals("good")) {
                System.out.printf("Computer %d\t Condition: %s\n", list.ID_PC, list.condition);

            }
        }
    }

    public void isDamage() {
        for (List_PCs list : list_pc) {
            if (list.condition.equals("damage")) {
                System.out.printf("Computer %d\t Condition: %s\n", list.ID_PC, list.condition);
            }
        }
    }

    public void markGood(int id) {
        int index = 0;
        for (List_PCs list : list_pc) {
            if (list.ID_PC == id) {
                list_pc.set(index, new List_PCs(id, "good"));
            } else {
                index++;
            }
        }
    }

    public void markDamage(int id) {
        int index = 0;
        for (List_PCs list : list_pc) {
            if (list.ID_PC == id) {
                list_pc.set(index, new List_PCs(id, "damage"));
            } else {
                index++;
            }
        }
    }

}
