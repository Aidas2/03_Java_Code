import lt.vtvpmc.java.postoffice.IllegalPackageException;
import lt.vtvpmc.java.postoffice.Package;
import lt.vtvpmc.java.postoffice.PostOffice;

import java.util.LinkedList;
import java.util.List;

public class PostofficeImplementation implements PostOffice {
    private List<Package> aPackage = new LinkedList<Package>();

    @Override
    public void postPackage(Package aPackage) throws IllegalPackageException {
        if (aPackage.getOwner() == null || aPackage.getOwner().equals("") || aPackage.getPackageCode() == null || aPackage.getPackageCode().equals("")) {
            throw new IllegalPackageException();
        } else {
            this.aPackage.add(aPackage);
        }
    }

    @Override
    public long numberOfPackagesForOwner(String s) {
        long numberOfPakacges = 0;
        for (Package pack: aPackage) {
            if(pack.getOwner().equals(s)){
                numberOfPakacges++;
            }
        }
        return numberOfPakacges;
    }

    @Override
    public Package retrievePackage(String s) {
        for (int i = 0; i < aPackage.size(); i++) {
            if (aPackage.get(i).getPackageCode().equals(s)) {
                Package pack = aPackage.get(i);
                aPackage.remove(i);
                return pack;
            }
        }
        return null;
    }
}
