
package contact;

import java.util.ArrayList;
public class ContactManager {
    
    public static void main(String[] args) {
        int choice = 0;
        Validation v = new Validation();
        Option op = new Option();
        ArrayList<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Iker Casillas", "Star", "Ha Noi", "0123012312", "Iker", "Casillas"));
        list.add(new Contact(2, "Iker Casillas anton", "Star", "Ha Noi", "0123012312", "Iker", "Casillas anton"));
        list.add(new Contact(3, "Iker Casillas adam", "Star", "Ha Noi", "0123012312", "Iker", "Casillas adam"));
        while(true){
            v.menu();
            choice = v.getChoice();
            switch(choice){
                case 1:
                    //add
                    op.CreateContact(list);
                    break;
                case 2:
                    //display
                    op.display(list);
                    break;
                case 3:
                    int idDelete = v.getIdToDelete();
                    op.delete(list, idDelete);
                    //delete
                    break;
                case 4:
                    break;
            }
        }
    }
}
