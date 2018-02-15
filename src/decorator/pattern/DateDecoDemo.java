package decorator.pattern;

public abstract class DateDecoDemo implements DateDemo{

    private final DateDemo dateDemo;

    public DateDecoDemo(DateDemo dateDemo) {
        this.dateDemo = dateDemo;
    }
    public String getDate(){
        return dateDemo.getDate();
    }
}
