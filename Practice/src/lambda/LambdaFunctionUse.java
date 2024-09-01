package lambda;

@FunctionalInterface  //It is optional
interface Drawable{
    public void add(int a,int b);
}

public class LambdaFunctionUse {
    public static void main(String[] args) {
      Drawable drawable = (a,b)->System.out.println(a+b);
      drawable.add(10,20);
    }
}