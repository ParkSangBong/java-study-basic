package string;

public class StringTest2 {

    public static void main(String[] args) {

        String java = "java";
        String android = "android";
        System.out.println(System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java));

    }

}
