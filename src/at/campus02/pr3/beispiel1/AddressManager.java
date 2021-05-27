package at.campus02.pr3.beispiel1;

import java.io.*;
import java.util.ArrayList;

public class AddressManager {

    private ArrayList<Address> addresses;

    public AddressManager() {
        addresses = new ArrayList<>();
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void add(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "AddressManager{" +
                "addresses=" + addresses +
                '}';
    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException, AddressLoadWrongFormatException, IOException {
        addresses.removeAll(addresses);
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        String temp;
        while (((temp = br.readLine()) != null)) {
            String[] tempp = temp.split(separator);
            if (tempp.length != 4)
                throw new AddressLoadWrongFormatException("4 Spalten erwartet!");

            addresses.add(new Address(tempp[0], tempp[1], tempp[2], tempp[3]));
        }
        br.close();
    }

    public void exportToCsv(String path, String separator) throws AddressExportException,
            IOException {
        FileWriter fw = new FileWriter(path);
        PrintWriter pw = new PrintWriter(fw);
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        for (Address a : getAddresses()) {
            bufferedWriter.write(a.getFirstname() + separator + a.getLastname()
                    + separator + a.getMobilNumber() + separator + a.getEmail());
            bufferedWriter.newLine();
            // pw.println(a.getFirstname() + separator + a.getLastname()
            //       + separator + a.getMobilNumber() + separator + a.getEmail());
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        // pw.flush();
        // pw.close();
    }

}
