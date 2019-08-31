package me.anukkritshanker;

class cal extends abs_class {
    int extra_var;

    public cal(int a, int b, int c, int extra_var) {
        super(a, b, c);
        this.extra_var = extra_var;
    }

    @Override
    int mul() {
        return super.mul()*extra_var;
    }

    @Override
    int add() {
        return super.add()+extra_var;
    }

    @Override
    int retval() {
        return 99;
    }
}
