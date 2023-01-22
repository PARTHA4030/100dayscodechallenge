import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
private static Singleton singleton;
    String str;
    private Singleton(){
    }
    public static Singleton getSingleInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return  singleton;
    }
}