package AST;

public class routerName extends ASTNode{
    private String name;

    public routerName() {
        super("routerName");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RouterName{" +
                "name='" + name + '\'' +
                '}';
    }
}
