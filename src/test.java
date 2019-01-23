public class test {
    public static void main(String[] args) {
        String s1 = "androidLab";
        String s2 = "androidLab";
        String s3 = "android" + "Lab";
        String s4 = "android" + new String("Lab");
        String s5 = new String("androidLab");
        String s6 = s5.intern();
        String s7 = "android";
        String s8 = "Lab";
        String s9 = s7 + s8;
        String s10 = new String("android") + new String("Lab");
        String s11 = new String("androidLab");
        s11.intern();
        Integer i1 = 1000;
        Integer i2 = 1000;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s9);
        System.out.println(s4 == s5);
        System.out.println(s1 == s6);
        System.out.println(s10 == s6);
        System.out.println(s1 == s11);
        System.out.println(s1 == s11.intern());
        System.out.println(s6 == s5.intern());
        System.out.println(i1 == i2);
    }
}

