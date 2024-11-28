class Prod {
    int id;
    String name;

    Prod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void info() {
        System.out.println(id + " " + name);
    }

}

class ExtProd extends Prod {
    int qty ;
    ExtProd(int id, String name , int q) {
        super(id, name);
        qty = q;
    }

    @Override
    void info() {
        super.info();
        System.out.println("수량 " + qty);
    }
}
public class ProdTest {
    public static void main(String[] args) {
        Prod p = new Prod(1,"Pen");
        ExtProd ep = new ExtProd(2, "NoteBook" , 10);

        p.info();
        ep.info();
    }
}
