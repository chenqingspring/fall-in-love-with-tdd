package com.test.composite;

public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    protected void add(Company company) {
    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + "HR Department in "+this.getName());
    }

    @Override
    protected void remove(Company company) {
    }
}