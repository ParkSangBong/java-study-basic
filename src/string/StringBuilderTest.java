package string;

public class StringBuilderTest {

    public static void main(String[] args) {

        String java = "java";
        String android = "android";

//        System.out.println(System.identityHashCode(java));

        StringBuilder builder = new StringBuilder(java);
        System.out.println(System.identityHashCode(builder));
        builder.append("android");
        System.out.println(System.identityHashCode(builder));

        java = builder.toString();
//        System.out.println(System.identityHashCode(java));

    }

}
