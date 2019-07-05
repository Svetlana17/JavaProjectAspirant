package calculations;


        class  Recursion{
    public static void main(String args[]){
        Recursion recursion=new Recursion();

        System.out.println("Factorial 1 = " + " " + recursion.fact(1));
    }

            private int fact(int i) {
                int result;
                if (i == 1)
                    return 1;
                result = fact(i - 1) * i;
                return result;
            }

        }

