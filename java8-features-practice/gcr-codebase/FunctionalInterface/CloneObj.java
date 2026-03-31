interface Backup {
}

class Data implements Backup {
}

class CloneObj implements Cloneable {
    public static void main(String[] a) throws Exception {
        CloneObj c = new CloneObj();
        System.out.println(c.clone());
    }
}

interface Sensitive {
}

class User implements Sensitive {
}
