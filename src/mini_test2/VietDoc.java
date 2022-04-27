package mini_test2;

import javafx.scene.input.KeyCode;

import java.io.*;
import java.util.List;
public class VietDoc {
    public static void DocFile (String path, List<DanhBa> danhBaList) throws IOException {
        File file = new File("Ghi.csv");
        file.createNewFile();
//        FileWriter fw = new FileWriter(file);
//        BufferedWriter bW = new BufferedWriter(fw);
        PrintWriter printWriter = new PrintWriter(file);
        String str = "";
        for (DanhBa i : danhBaList) {
            str += i.getTen() + "," + i.getSdt() + "," + i.getDiaChi() + "," + i.getEmail() + "," + i.getFaceBook()+"\n";
        }
        printWriter.write(str);
        printWriter.close();
    }
}

