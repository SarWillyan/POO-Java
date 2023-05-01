
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*_______________________________________________________________________________________________________*/

        Item it = new Item(20.0f, "Arroz", 23, 05, 2022);
        Item it2 = new Item(20.0f, "Arroz", 23, 05, 2022);
        System.out.println("Item: " + it); //automaticamente chama toString, é o mesmo que colocar it.toString()

        if (it.equals(it2))  {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
        /*_______________________________________________________________________________________________________*/

        System.out.println("\nPARTE 2");
        Item i1 = new Item(20.0f, "Arroz", 23, 05, 2022);
        Item i2 = (Item) i1.clone();

        System.out.println(i1);
        System.out.println(i2);

        System.out.println("Após mudança de i2");
        i2.setData(25, 05, 2000);

        System.out.println(i1);
        System.out.println(i2);
    }
}
