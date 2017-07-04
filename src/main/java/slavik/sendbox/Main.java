package slavik.sendbox;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * Created by vlli0816 on 2/21/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException, InterruptedException {
        String last = "";
        while(true) {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            String data = (String) clipboard.getData(DataFlavor.stringFlavor);
            if(data.equals(last) || !data.contains(",")) {
                StringSelection selection = new StringSelection(data);
                clipboard.setContents(selection,selection);
                Thread.sleep(1000);
                continue;
            }
            data = data.replace(",",",\n");
            System.out.println(data);
            last=data;
            StringSelection selection = new StringSelection(data);
            clipboard.setContents(selection,selection);
        }
    }
}
