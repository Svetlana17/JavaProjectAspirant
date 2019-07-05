import java.util.Scanner;

public class Main
{

        public static void main(String[] args)
        {
            double result = Math.abs(-13.5);// возвращает абсолютное значение для аргумента value
            System.out.println(result + " "+ "abs");
            double resultAcos = Math.acos(0);
            System.out.println("acos" + " "+ resultAcos);
            double resultAsin = Math.asin(1);
            System.out.println("asin"+ " "+ resultAsin);
            double crbt= Math.cbrt(27);//возвращает кубический корень числа value
            System.out.println("cbrt"+ " " +crbt);
            double a=4; double b=8; double k = 9;
            double c=Math.max(a, b);
            System.out.println("max"+ " "+c);
            double t = Math.min(a, b);
            System.out.println("min" + " " + t);

            // For ввода данных
//            Scanner in=new Scanner(System.in);
//            System.out.print("Введите значение: ");
//            int radius=in.nextInt();
//            long area=Math.round(Math.PI*Math.pow(radius,2));
//            System.out.print("Area"+ " "+ area);
            System.out.println(Math.random());
            System.out.println((int)(Math.random() * 5));
            System.out.println("1-ое случайное число: " + Math.random()); //вывести случайное число
            System.out.println("2-ое Случайное число: " + Math.random());
            int resultRandom = (int) (5*Math.random());
            int resRandrom=(int)(10*Math.random());
            int resultrandom=(int)(5+5*4*Math.random());
            int randomdouble = (int)(Math.random()*78);
            System.out.println("ResultRandom:" + "  " + resultRandom);
            System.out.println("ResultRandrpm:" + " " +  resRandrom);
            System.out.println("Resultrandom" + " " + resultrandom);
            System.out.println("Resultrandom" + " " + randomdouble );


            double alpha=0.05;
            double l0= Math.sqrt(2*alpha)*Math.exp(-alpha*t);
            double l1= Math.sqrt(2*alpha)*Math.exp(-alpha*t)*(1-2*alpha*t);
            double l2= Math.sqrt(2*alpha)*Math.exp(-alpha*t)*(1-4*alpha*t+2*alpha*alpha*t*t);
            double l3= Math.sqrt(2*alpha)*Math.exp((-alpha*t)*(1-8*alpha*t+12*alpha*alpha*t*t-16*alpha*alpha*alpha*t*t*t/3+2*alpha*alpha*alpha*alpha/(t*t*t*t)/3));


            System.out.println("l0:= " + l0 + " "+ "l1:="+" " + l1 + "" + " " + "l2: =" + " "+ l2 + " "+"l3:=" + " "+l3);


        }

}