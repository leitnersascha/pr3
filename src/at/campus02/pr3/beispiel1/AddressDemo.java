package at.campus02.pr3.beispiel1;

import java.io.IOException;

public class AddressDemo {

    public static void main(String[] args) throws AddressLoadException {
        String filePath = "test.csv";
        String seperator = ";";
        AddressManager am = new AddressManager();
        Address a1 = new Address("Robert", "Leitner", "0660", "Robert.leitner@outlook.com");
        Address a2 = new Address("Sabine", "Leitner", "0660", "Sabine.leitner@outlook.com");
        Address a3 = new Address("Christopher", "Leitner", "0660", "Christopher.leitner@outlook.com");
        Address a4 = new Address("Horst", "Leitner", "0660", "Horst.leitner@outlook.com");

        am.add(a1);
        am.add(a2);
        am.add(a3);
        am.add(a4);

        try {
            am.exportToCsv(filePath, seperator);
        } catch (AddressExportException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            am.loadFromCsv(filePath, seperator);
        } catch (AddressLoadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new AddressLoadException(e);
        } catch (AddressLoadWrongFormatException e) {
            e.printStackTrace();
        }

        System.out.println(am.getAddresses().toString());

    }
}
