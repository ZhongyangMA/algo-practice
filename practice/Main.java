package practice;

import java.util.*;

public class Main {

    public static class Fruit implements Comparable<Fruit> {
        Integer m;
        Integer p;
        boolean visited;

        public Integer getM() {
            return m;
        }

        public void setM(Integer m) {
            this.m = m;
        }

        public Integer getP() {
            return p;
        }

        public void setP(Integer p) {
            this.p = p;
        }

        @Override
        public String toString() {
            return "{" + m + ", " + p + ", " + visited + "}";
        }
        @Override
        public int compareTo(Fruit fruit) {
            return fruit.getP().compareTo(this.getP());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mArr = sc.nextLine();  // 成本价数组
        String nArr = sc.nextLine();  // 卖出价数组
        int k = sc.nextInt();

        String[] m = mArr.split(",");
        String[] n = nArr.split(",");

        List<Fruit> fruitList = new ArrayList<>();
        for(int i = 0; i < m.length; i++) {
            Fruit fruit = new Fruit();
            fruit.m = Integer.parseInt(m[i]);
            fruit.p = Integer.parseInt(n[i]) - Integer.parseInt(m[i]);
            fruit.visited = false;
            fruitList.add(fruit);
        }
        Collections.sort(fruitList);
        Integer totalP = 0;
        Integer totalM = 0;
        while(k > 0) {
            for (Fruit fruit : fruitList) {
                if(fruit.visited == false) {
                    totalM += fruit.getM();
                    if(totalM > k) {
                        break;
                    } else {
                        totalP += fruit.getP();
                        fruit.visited = true;
                    }
                }
            }
            k = k + totalP;
        }

        System.out.println(totalP);


        System.out.println(a);
        System.out.println(b);


    }
    static Boolean a;
    static boolean b;

}
