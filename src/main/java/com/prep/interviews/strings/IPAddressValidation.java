package com.prep.interviews.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class IPAddressValidation {

    static String range255="(\\d{1,2}|[01][0-9][0-9]|[2][0-5][0-5])\\.";
    static Pattern ipv4=Pattern.compile("^"+range255+range255+range255+range255);
    static String rangeHexa="(\\.{4}|((\\.{3})?)[0-9_a-fA-F]|((\\.{2})?)[0-9_a-fA-F]{2}|((\\.?)[0-9_A-Fa-f]{3})|([0-9_a-fA-F]{4})):";
    static Pattern ipv6= Pattern.compile("^"+rangeHexa+rangeHexa+rangeHexa+
            rangeHexa+rangeHexa+rangeHexa+rangeHexa+rangeHexa);

    public static List<String> validateAddresses(List<String> addresses) {
        List<String> results = new ArrayList<>();
        // Write your code here
        for (int i = 0; i < addresses.size(); i++) {
            String line = addresses.get(i);
            if(ipv4.matcher(line+".$").find()){
                System.out.println("IPv4");
                results.add("IPv4");
            }
            else if(ipv6.matcher(line+":$").find()){
                System.out.println("IPv6");
                results.add("IPv6");
            }
            else {
                System.out.println("Neither");
                results.add("Neither");
            }

        }
        return results;
    }

}
