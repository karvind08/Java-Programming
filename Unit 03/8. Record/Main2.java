class Example {
    private int r;
    private String name;

    public Example(int r, String name) {
        this.r = r;
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Example [r=" + r + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + r;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Example other = (Example) obj;
        if (r != other.r)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

public class Main2 {
    public static void main(String[] args) {
        Example E1 = new Example(1, "Arvind");
        Example E2 = new Example(2, "Yuvaan");
        System.out.println(E1.equals(E2));
    }

}
