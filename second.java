import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Second{
    public static void main(String[] args) {
        List<Data> s21=new ArrayList<>();
        s21.add(new Data("tea", 100));
        s21.add(new Data("coffee", 100));
        s21.add(new Data("green tea", 75));
         List<Data> s22=new ArrayList<>();
        s22.add(new Data("tea", 120));
        s22.add(new Data("coffee", 110));
        s22.add(new Data("green tea", 100));
        int teaadd21=s21.stream().filter(x->x.getProduct().contains("tea")).collect(Collectors.toList()).stream().mapToInt(x->x.getSale()).sum();
        int teaadd22=s22.stream().filter(x->x.getProduct().contains("tea")).collect(Collectors.toList()).stream().mapToInt(x->x.getSale()).sum();
        System.out.println(teaadd21);
        System.out.println(teaadd22);
    }
}
class Data{
    String product;
    int sale;
    double var;
    Data(String product,int sale){
        this.product=product;
        this.sale=sale;
    }
    public String getProduct(){
        return product;
    }
    public int getSale(){
        return sale;
    }
    public String toString(){
        return "{"+product+":"+sale+":"+var+"}";
    }
}