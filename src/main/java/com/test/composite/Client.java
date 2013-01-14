package com.test.composite;

public class Client {
    public static void main(String[] args) {
        Company root = new ConcreteCompany();
        root.setName("ThoughtWorks");
        Company beijing = new ConcreteCompany("ThoughtWorks Beijing");
        ConcreteCompany xian = new ConcreteCompany("ThoughtWorks Xi'an");
        xian.add(new FinanceDepartment("xi'an"));
        xian.add(new HRDepartment("xi'an"));
        ConcreteCompany chengdu = new ConcreteCompany("ThoughtWorks chengdu");
        chengdu.add(new FinanceDepartment("chengdu"));
        chengdu.add(new HRDepartment("chengdu"));
        root.add(beijing);
        beijing.add(xian);
        beijing.add(chengdu);
        root.display(0);
    }
}
