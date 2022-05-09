package DemoOptional;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        // Tao Optional
        Optional<Integer> op1 = Optional.empty(); //Optional rong
        Optional<Integer> op2 = Optional.of(1); // Optional phai co gia tri
        Optional<Integer> op3 = Optional.ofNullable(2); // Optional chap nhan gia tri null
        // Get optinal : lay gia tri
        Integer getOp = op2.get();
        System.out.println(getOp.toString());
        System.out.println("------------");
        // isPresent : kiem tra Optionnal co null hay ko. Neu null tra ra false
         Boolean checkNull = op3.isPresent();
        System.out.println(checkNull);
        System.out.println("------------");
        // ifPresent : kiem tra Optional co null hay khong. Neu khong null thi thuc hien thao tac
        op3.ifPresent(x-> System.out.println(x.toString()));
        System.out.println("------------");
        // orElse va orElseGet : deu tra ve Optional neu khong null; null thi tra  gia tri moi. Khac nhau la orElse luc nao cung thuc hien con orElseGet thi khong
        op3.orElse(new Integer(8));
        op3.orElseGet(()-> new Integer(6));
        System.out.println(op3.get().toString());
        System.out.println("------------");
        // map()  ket qua != null thi tra ra Optional voi ket qua con khong thi tra ra 1 Optional rong
        Optional<String> opS1 = Optional.of("Hello");
        Optional<String> opS2 = Optional.empty();
        System.out.println(opS1.map(String :: toLowerCase).toString());
        System.out.println(opS2.map(String :: toLowerCase).toString());
        System.out.println("------------");
        // Optional map co the chong nhau
        Optional<Optional<String>> opS3 = Optional.of(Optional.of("Java"));
        System.out.println(opS3);
        System.out.println(opS3.map(x-> x.map(String :: toLowerCase)));
        System.out.println(opS3.flatMap(x->x.map(String :: toLowerCase))); //flatmap : gop cac Optional thanh 1 Optional duy nhat
        System.out.println("------------");
        //filter trong Optional. neu gia tri cua Optional khop voi gia tri truyen vao thi tra ra Optional con ko tra Optional rong
        System.out.println(opS1.filter(x-> x.equals("Hello")));
        System.out.println(opS1.filter(x->x.equals("Alo")));
        System.out.println("------------");



    }
}
