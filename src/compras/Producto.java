package compras;

public class Producto {
    
    ** final int codigo;
    ** String nombre;
    ** String tipo;
    ** static int totalProductosPedidos;

    ** Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    ** void imprimirNombre() {
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        **
    }

    public ** getCodigo() {
        return codigo;
    }

    ** static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}