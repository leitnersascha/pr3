package at.campus02.pr3.beispiel1;

public class AddressDemo {

    public static void main(String[] args) throws AddressLoadException {
        String filePath = "test.csv";
        String seperator = ","; // in case von PIPE -> \\| (needs to be escaped!)
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
        } catch (AddressExportFileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (AddressExportException e) {
            e.printStackTrace();
        }


        try {
            am.loadFromCsv(filePath, seperator);
        } catch (AddressLoadWrongFormatException e) {
            e.printStackTrace();
        }


        System.out.println(am.getAddresses().toString());

    }
}
