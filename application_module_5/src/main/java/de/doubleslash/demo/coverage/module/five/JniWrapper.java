package de.doubleslash.demo.coverage.module.five;

import java.util.List;

@SuppressWarnings("unused")
public class JniWrapper {
    private static final String LIB_NAME = "jnilibrary";

    static {
        System.loadLibrary(LIB_NAME);
    }

    public static void callbackStatic(String string) {
        System.out.println("Static callback: " + string);
    }

    public native String getString();

    public void callback(String string) {
        System.out.println("Callback: " + string);
    }

    public String callbackObject(List<String> arrayList) {
        System.out.println("Callback object with size: "
                + arrayList.size()
                + " and payload: "
                + arrayList.get(0));
        return arrayList.get(0);
    }
}
