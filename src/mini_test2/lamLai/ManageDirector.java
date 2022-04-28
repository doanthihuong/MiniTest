package mini_test2.lamLai;

import java.util.ArrayList;
import java.util.List;

public class ManageDirector {
    List<PhoneDirector>directorList=new ArrayList<>();

    public void display(){
        for (int i = 0; i < directorList.size(); i++) {
            System.out.println(directorList.get(i));
        }
    }
    public void add(PhoneDirector phoneNumber) {
        directorList.add(phoneNumber);

    }
    public int search(int phoneNumber) {
        for (int i = 0; i < this.directorList.size(); i++) {
            if( this.directorList.get(i).getPhoneNumber()==phoneNumber) {
                return  i;
            }
        } return -1;

    }
    public void edit(int phoneNumber,PhoneDirector director) {
        int indexOf=search(phoneNumber);
        if(indexOf==-1) {
            System.out.println("không tồn tại");
        } else {
            directorList.set(indexOf,director);
        }

    }
    public void delete(int phoneNumber) {
        for (int i = 0; i < this.directorList.size(); i++) {
            if(search(phoneNumber)!=-1) {
                directorList.remove(search(phoneNumber));
            } else
                System.out.println( " không có");
        }

    }
    public void findByPhoneNumber(int phoneNumber) {
        for (int i = 0; i < this.directorList.size(); i++) {
          if(this.directorList.get(i).getPhoneNumber()==phoneNumber) {
              System.out.println(directorList.get(i));
          }
        }
    }
}
