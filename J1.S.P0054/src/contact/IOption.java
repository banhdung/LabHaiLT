/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;

import java.util.ArrayList;

/**
 *
 * @author trinh
 */
public interface IOption {

    boolean add(ArrayList<Contact> list, int id, String name, String group,
            String address, String phone, String firstName, String lastname);

    void display(ArrayList<Contact> list);

    boolean delete(ArrayList<Contact> list, int id);

    void CreateContact(ArrayList<Contact> list);

}
