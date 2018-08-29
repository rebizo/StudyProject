package spring.JavaBase.Exceptions;

public class CallMethods {

    public static void main(String[] args) {
        anotherMethod();
        System.out.println(getCallerClassAndMethodName());
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();

        if (stackTraceElements.length < 3) {
            return null;
        } else
            return stackTraceElements[2].getClassName()+"#"+stackTraceElements[2].getMethodName();
    }
}