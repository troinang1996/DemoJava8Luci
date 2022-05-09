package DemoLambda;

import DemoStream.Person;

public class MainLambda {
    public static void main(String[] args) {
        // ko dung lambda
        StringFunction exclaim = new StringFunction() {
            @Override
            public String run(String str) {
                return str + "!!!!";
            }
        };
        // rut ngon code. yeu cau bat buoc la Function Interface
        StringFunction ask = (s) -> s + "?????";
        stringFormat("wow", exclaim);
        stringFormat("why", ask);


    }
    public static void stringFormat(String str, StringFunction sf){
        String result = sf.run(str);
        System.out.println(result);
    }
    public int compareTo(Person p1, Person p2){
        return p1.getElectionYear()-p2.getElectionYear();
    }
}
