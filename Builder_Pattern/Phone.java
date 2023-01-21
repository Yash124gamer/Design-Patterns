package Builder_Pattern;
class phone{
    private int Battery=0;
    private int Camera=0;
    private int ram=0;
    phone(int Battery,int Camera,int ram){
        this.Battery=Battery;
        this.Camera=Camera;
        this.ram=ram;
    }
    public String  toString(){
        return "Phone -: Camera = "+this.Camera+" Battery = "+this.Battery+" RAM = "+this.ram;
    }
}