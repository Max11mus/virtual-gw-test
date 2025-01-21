import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String address1 = "555 Straight Stave Ave, San Francisco, CA 94104";
        String address2 = "444 Ave Maria Stairway St., San Francisco, CA 94104";
        String address3 = "9032 Flave Steep Str, San Francisco, CA 94104";

        System.out.println(expandStreetOrAvenueWithRegExp(address1));
        System.out.println(expandStreetOrAvenueWithRegExp(address2));
        System.out.println(expandStreetOrAvenueWithRegExp(address3));

        System.out.println(expandStreetOrAvenue(address1));
        System.out.println(expandStreetOrAvenue(address2));
        System.out.println(expandStreetOrAvenue(address3));
    }

    public static String expandStreetOrAvenueWithRegExp(String address) {
        address = address.replaceAll("\\b(Str\\.,|Str,|St\\.,|St,)", "Street,");
        address = address.replaceAll("\\b(Ave\\.,|Ave,)", "Avenue,");

        return address;
    }

    public static String expandStreetOrAvenue(String address) {
        String street = address.substring(0, address.indexOf(","));
        String[] words = street.split("\\s+");

        switch (words[words.length - 1]) {
            case "Str.":
            case "Str":
            case "St.":
            case "St":
                words[words.length - 1] = "Street";
                break;
            case "Ave.":
            case "Ave":
                words[words.length - 1] = "Avenue";
                break;
            default:
                break;
        }

        return String.join(" ", words) + address.substring(address.indexOf(","));
    }
}
