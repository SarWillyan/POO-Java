package OPERACAO.src;

public enum Operacao {

    SOMA {
        @Override
        public int avalia(int arg1, int arg2) {return arg1 + arg2;}
    },
    SUBTRAI{
        @Override
        public int avalia(int arg1, int arg2) {return arg1 - arg2;}
    },
    MULTIPLICA{
        @Override
        public int avalia(int arg1, int arg2) {return arg1 * arg2;}
    }, 
    DIVIDE{
        @Override
        public int avalia(int arg1, int arg2) {return arg1 / arg2;}
    };

    public abstract int avalia(int arg1, int arg2); // método abstrato para ser feito o override 
}
