package com.test.composite;

import java.util.ArrayList;

public class ConcreteCompany extends Company {
    private ArrayList<Company> companies;

    public ConcreteCompany() {
        companies = new ArrayList();
    }

    public ConcreteCompany(String name) {
        super(name);
        companies = new ArrayList();
    }

    @Override
    protected void add(Company company) {
        companies.add(company);
    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName());
        for (Company company : companies) {
            company.display(depth + 2);
        }

    }

    @Override
    protected void remove(Company company) {
        companies.remove(company);
    }
}