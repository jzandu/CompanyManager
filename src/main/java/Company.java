public class Company {
    String cname;
    String description;

    public Company(){

    }
    //Los metodos get y set deben ser publicos para que puedan operar desde otra clase
    public String getCname(){
        return this.cname;
    }
    public void setCname(String n){
        this.cname=n;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String d){
        this.description=d;
    }

}
