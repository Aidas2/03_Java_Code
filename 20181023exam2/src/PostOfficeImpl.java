import lt.vtvpmc.java.postoffice.IllegalPackageException;
import lt.vtvpmc.java.postoffice.Package;
import lt.vtvpmc.java.postoffice.PostOffice;

import java.util.ArrayList;
import java.util.List;

public class PostOfficeImpl implements PostOffice {
    private List<Package> packages = new ArrayList<>();//reikia sukurti sarasa kad butu deti paketus

    @Override //sio metodo adoc'e parasyta kad "Not having package code or owner is having those values set to null or an empty string", todel reikia patikrinti ar jie ne null bei ne empty
    public void postPackage(Package aPackage) throws IllegalPackageException {
    if (aPackage.getOwner() == null || aPackage.getPackageCode() == null || aPackage.getOwner() == "" || aPackage.getPackageCode() == "") {
        throw new IllegalPackageException();
    } else {
        packages.add(aPackage);
    }
    }

    @Override
    public long numberOfPackagesForOwner(String owner) {
        long count = 0; //pradinis kiekis yra nulis, long ne tai parasyta adoc (ir metode)
        for (Package aPackage : packages) { //iteruojam  per paketus ir jei paketo savininkas sutampa tai sumuojam
            if (aPackage.getOwner().equals(owner)) {
                count++;
            }
        }
        return count;
    }

//    @Override //paketus atiduodam pagal koda (zr. adoc)
//    public Package retrievePackage(String packageCode) {
//        for (int i = 0; i < packages.size(); i++) {
//            if (packages.get(i).getPackageCode().equals(packageCode)) {
//                Package pack = packages.get(i);
//                packages.remove(i);
//                return pack;
//            }
//        }
//        return null;
//    }
    //alternatyva
    @Override //paketus atiduodam pagal koda (zr. adoc)
    public Package retrievePackage(String packageCode) {
        for (Package aPackage : packages) {
            if (aPackage.getPackageCode().equals(packageCode)) {
                packages.remove(aPackage);
                return aPackage;
            }
        }
        return null;
    }
}
