package designPattern;

class SingletonExample {

    private static SingletonExample dbObject;

    private SingletonExample() {

    }

    public static SingletonExample getInstance() {
        if (dbObject == null)
            dbObject = new SingletonExample();
        return dbObject;
    }

    public static void getdbConnection1() {
        System.out.println("Database now connected 1 ..!!");
    } public static void getdbConnection2() {
        System.out.println("Database now connected 2 ..!!");
    }

    public static SingletonExample getDbObject() {
        return dbObject;
    }

    public static void setDbObject(SingletonExample dbObject) {
        SingletonExample.dbObject = dbObject;
    }

    public static void getdbConnection3() {
        System.out.println("Database now connected 3 ..!!");
    }
}

class Main {

    public static void main(String[] args) {
        SingletonExample db1;
        db1 = SingletonExample.getInstance();
        db1.getdbConnection1();
        db1.getdbConnection2();
        db1.getdbConnection3();
    }
}
