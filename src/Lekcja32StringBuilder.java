public class Lekcja32StringBuilder {

    public static void main(String[] args) {

        int j=100000;
        long start = System.currentTimeMillis();
        String s="";
        for (int i=0;i<j; i++){
            s+="a";
        }
        System.out.println(s);


        System.out.println("czas przed optymalizacją przy użyciu StringBuildera: " +
                (System.currentTimeMillis() - start));


        StringBuilder sb=new StringBuilder();
        start = System.currentTimeMillis();
        for (int i=0;i<j; i++){
           sb.append("a");
        }
        System.out.println(sb.toString());

        System.out.println("czas po optymalizacją przy użyciu StringBuildera: " +
                (System.currentTimeMillis() - start));
    }
}
