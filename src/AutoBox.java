import java.util.*;

public class AutoBox {
    Object method() {
        return new Integer(1);
    }

    public static void main(String[] args) {
        int in;
        byte b;
        short s;
        long l;
        boolean bool;
        char c;
        float f;
        double d;

        Byte _byte;
        Short _short;
        Integer _integer;
        Long _long;
        Boolean _boolean;
        Character _char;
        Float _float;
        Double _double;

        List<Integer> list;

        int j = new Integer("5");
        Integer k = new Integer(5);
        Integer n = new Integer("6");
        Integer i = new Integer("4");
        int sdf = Integer.parseInt("123");
        Integer wer = Integer.valueOf("3");
        short sh = i.shortValue();
        Integer zsd = new Integer(5);
        //  i++;
        int tempVar = i.intValue();
        tempVar++;
        i = new Integer(tempVar);
        System.out.println(i);
        List<Integer> listt = new ArrayList<>();
        listt.add(1);
        listt.add(2);
        listt.add(3);
        for (int kk : listt) {
            System.out.println(kk);
        }
        String str = "String";
        String str2 =new String( "String");
        Object o1 = new Object();
        Object o2 = new Object();
        if (o1 == o2) {
            System.out.println("==");
        } else {
            System.out.println("no no no");
        }
        if (o1.equals(o2)) {
            System.out.println("==");
        } else {
            System.out.println("nah");
        }
        if(str.equals(str2)){
            System.out.println("==");
        }
        if(str==str2){
            System.out.println("dvoenoe ravno");
        }
        Integer inte=new Integer (128);
        Integer jit=128;
        if(inte.equals(jit)){
            System.out.println("Integer eq");
        }
        if(inte==jit){
            System.out.println("integer ==");
        }


    }
}

