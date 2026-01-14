package com.jad;
import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo {
    private IBaz baz;
    private List<IBar> bars = new ArrayList<>();
    private IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.qux = new Qux();
    }

    @Override
    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    @Override
    public ICorge getCorge() {
        return this.corge;
    }

    public IBaz getBaz() {
        return this.baz;
    }

    public List<IBar> getBars() {
        return this.bars;
    }

    public IQux getQux() {
        return this.qux;
    }

    public void addBar (IBar bar) {
        this.bars.add(bar);
    }

}
