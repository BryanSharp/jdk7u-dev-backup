public class TestCaseIfElse {

    @DARanges({
        @DARange(varName="o", bytecodeStart=9, bytecodeLength=8),
        @DARange(varName="o", bytecodeStart=20, bytecodeLength=9)
    })
    void m0(String[] args) {
        Object o;
        if (args[0] != null) {
            o = "then";
            o.hashCode();
        } else {
            o = "else";
            o.hashCode();
        }
        o = "finish";
    }

    @DARanges({
        @DARange(varName="o", bytecodeStart=10, bytecodeLength=8),
        @DARange(varName="o", bytecodeStart=21, bytecodeLength=9)
    })
    void m1() {
        Object o;
        int i = 5;
        if (i == 5) {
            o = "then";
            o.hashCode();
        } else {
            o = "else";
            o.hashCode();
        }
        o = "finish";
    }

    @DARanges({
        @DARange(varName="o", bytecodeStart=10, bytecodeLength=8),
        @DARange(varName="o", bytecodeStart=21, bytecodeLength=9)
    })
    void m2() {
        Object o;
        int i = 5;
        if (i != 5) {
            o = "then";
            o.hashCode();
        } else {
            o = "else";
            o.hashCode();
        }
        o = "finish";
    }

    @DARanges({
        @DARange(varName="o", bytecodeStart=11, bytecodeLength=3),
        @DARange(varName="o", bytecodeStart=17, bytecodeLength=2)
    })
    Object m3(boolean cond1, boolean cond2) {
        Object o;
        if (cond1) {
            if (cond2) {
                o = "then";
            } else {
                o = "else";
                return null;
            }
        }
        return null;
    }
}
