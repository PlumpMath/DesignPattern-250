package design.pattern.singlton;
public enum Single{
    INSTANCE(new String[]{"arg1", "arg2"});

    String[] myArgs;
    Single(String[] args){
        this.myArgs = args;
    }

    public static Single getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(String arg : INSTANCE.myArgs)
            System.out.println(arg);
    }
}