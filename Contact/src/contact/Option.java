package contact;

import java.util.ArrayList;

/**
 *
 * @author trinh
 */
public class Option implements IOption {

    @Override
    public boolean add(ArrayList<Contact> list, int id, String name, String group,
            String address, String phone, String firstName, String lastname) {
        Contact c = new Contact(id, name, group, address, phone, firstName, lastname);
        list.add(c);
        return true;
    }

    @Override
    public void display(ArrayList<Contact> list) {
        for (Contact o : list) {
            System.out.println(o);
        }
    }

    @Override
    public boolean delete(ArrayList<Contact> list, int id) {
        boolean check = true;
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                list.remove(i);
                check = false;
                System.out.println("Delete an contact successful");
                break;
            }
        }
        if (check) {
            System.out.println("Id not exist.Delete an contact fail");
        }
        return true;
    }

    @Override
    public void CreateContact(ArrayList<Contact> list) {
        int id = Validation.getIdToAdd(list);
        String name = Validation.checkInputString("Enter name: ");
        String group = Validation.checkInputString("Enter group: ");
        String address = Validation.checkInputString("Enter address: ");
        String phone = Validation.getPhone();
        //Iker Casillas
        String txt[] = name.split(" ", 2);
        String firstName = txt[0];
        String lastName = txt[1];
        new Option().add(list, id, name, group, address, phone, firstName, lastName);
        //
    }

}
