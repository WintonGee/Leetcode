public class Q1108_DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

}
